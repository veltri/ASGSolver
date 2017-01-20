package algorithm;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

import data.Agent;
import data.AgentCollection;
import data.ModelsCollection;
import util.Constants;
import util.ErrorMessage;
import input.AdditiveWeightTableFactory;
import input.InputBuilder;
import input.InputDirector;
import input.NTUInputBuilder;
import input.NonAdditiveWeightTableFactory;
import input.WeightTableFactory;
import it.unical.mat.dlv.program.Literal;
import it.unical.mat.wrapper.Model;
import it.unical.mat.wrapper.Predicate;

public class NTUFacade {

	enum Task { Imputations, Core };
	
	private InputDirector inputDirector;
	private InputBuilder inputBuilder;
	private WeightTableFactory tableFactory;
	private String inputDirectory;
	private SolvingStrategy solvingStrategy;
	private List< Model > imputations;
	private Vector< HashMap< Integer, Integer > > imputationGainMatrix;
	private Task task;
	private List< Model > core;
	private long startTime;
	private long endImputationTime;
	private long endCoreTime;
	private int kCore;
	private boolean stats;
	
	
	public NTUFacade() {
		inputDirector = new InputDirector();
		inputBuilder = null;
		tableFactory = null;
		inputDirectory = "";
		solvingStrategy = null;
		imputations = new ArrayList< Model >();
		imputationGainMatrix = new Vector< HashMap < Integer, Integer > >();
		task = Task.Imputations;
		core = new ArrayList< Model >();
		startTime = 0;
		endImputationTime = 0;
		endCoreTime = 0;
		kCore = 0;
		stats = false;
	}
	
	public void readInput( String[] args ) {
		
		if( args.length > 3 )
			ErrorMessage.errorGeneric("Too many arguments: "+Constants.getSystemName()+" [-nonAdditive] [-reasoning=imputations|-core|-2core|-3core|-4core] inputDirectory");
		
		for( String opt : args )
		{
			if( opt.startsWith("-") )
			{					
				if( opt.equals("-nonAdditive") )
				{
					if( tableFactory != null )
						ErrorMessage.errorGeneric("Option -nonAdditive has been already seen");
					tableFactory = new NonAdditiveWeightTableFactory();
					// FIXME
					ErrorMessage.errorGeneric("Support to non-additive functions is an ongoing work.");
				}
				else if( opt.equals("-reasoning=imputations") )
				{
					task = Task.Imputations;
				}
				else if( opt.equals("-reasoning=core") )
				{
					task = Task.Core;
				}
				else if( opt.equals("-reasoning=2core") )
				{
					task = Task.Core;
					kCore = 2;
				}
				else if( opt.equals("-reasoning=3core") )
				{
					task = Task.Core;
					kCore = 3;
				}
				else if( opt.equals("-reasoning=4core") )
				{
					task = Task.Core;
					kCore = 4;
				}
				else if( opt.equals("-stats") )
				{
					stats = true;
				}
				else
					ErrorMessage.errorGeneric("Option \"" + opt + "\" not recognized");
			}
			else 
			{
				if( !inputDirectory.equals("") )
					ErrorMessage.errorGeneric("The input directory has been already set up");
				inputDirectory = opt;
			}
		}
		
		solvingStrategy = new DLVStrategy();
		
		if( tableFactory == null )
			tableFactory = new AdditiveWeightTableFactory();
		
		inputBuilder = new NTUInputBuilder();
		inputBuilder.configureWeightBuilder(tableFactory);
		inputDirector.configureBuilder(inputBuilder);
		inputDirector.parseInput(inputDirectory);
	}
	
	public void start(){
		
		startImputations();
		if( task == Task.Core )
			startCore();
		if( stats )
			printStats();
	}
	
	private void startImputations() {
		
		startTime = System.currentTimeMillis();
		System.out.println("Imputation answer sets:");

		List< String > inputFiles = new ArrayList< String >();
		// Compute the maximum worth which an agent would gain into a single coalition.
		AgentCollection agents = ((NTUInputBuilder)inputBuilder).getAgentCollection();
		for( int i=0; i<agents.size(); i++ )
		{
			Agent agent = agents.getAgent(i);
			List< String > localInputFiles = new ArrayList< String >();
			localInputFiles.add(agent.getProgramFile());
			inputFiles.add(agent.getProgramFile());
			ModelsCollection models = solvingStrategy.solve(localInputFiles);
			int maxWeight = Integer.MIN_VALUE;
			while( models.hasMoreModels() )
			{
				Model model = models.nextModel();
				int modelWeight = agent.getWeightTable().getWeight(model);
				if( modelWeight > maxWeight )
					maxWeight = modelWeight;
			}
			agent.setMaxWeightSingleton(maxWeight);
		}
		
		// Identify the imputations.
		ModelsCollection models = solvingStrategy.solve(inputFiles);
		if( !models.hasMoreModels() )
		{
			ErrorMessage.errorGeneric("The grand-coalition program has no answer sets");
		}
		// Add every model into the following list because class ModelsCollection can be iterated just once (ResulSets-like).
		List< Model > modelList = new ArrayList< Model >();
		// Compute the maximum gain which an agent may achieve into the grand-coalition, 
		// and store all the gains into a matrix.
		Vector< HashMap< Integer, Integer > > gainMatrix = new Vector< HashMap < Integer, Integer > >();
//		int modelCounter = 0;
		while( models.hasMoreModels() )
		{
//			modelCounter++;
			Model model = models.nextModel();
			HashMap< Integer, Integer > agentGains = new HashMap< Integer, Integer >();
			boolean secondProperty = true;
			for( int i=0; i<agents.size() && secondProperty; i++ )
			{
				Agent agent = agents.getAgent(i);
				int modelWeight = agent.getWeightTable().getWeight(model);
				agentGains.put(agent.getId(), modelWeight);
				if( modelWeight > agent.getMaxWeightGrandCoalition() )
					agent.setMaxWeightGrandCoalition(modelWeight);
				// Check the second property (see the definition of "imputations")
				if( modelWeight < agent.getMaxWeightSingleton() )
					secondProperty = false;
			}
			// The current model will be investigated just whether it enjoys the second property.
			if( secondProperty )
			{
				gainMatrix.add(agentGains);
				modelList.add(model);
			}
		}
//		System.out.println("#models of P_N = " + modelCounter);
		assert (modelList.size() == 0) || (gainMatrix.size() == modelList.size() && gainMatrix.get(0).size() == agents.size()) : 
			"Not valid gain matrix!";
		
		// Notice that, all the models in modelList enjoy the second property.
		boolean stop = false;
		for( int m=0; m<modelList.size() && !stop; m++ )
		{
			Model model = modelList.get(m);
			boolean firstProperty = false;
			// First property:
			// - if, in the current model, there is an agent which earns more than he might get in every other model,
			// then the model is definitely efficient;
			for( int i=0; i<agents.size() && !firstProperty; i++ )
				if( gainMatrix.get(m).get(agents.getAgent(i).getId()) >= agents.getAgent(i).getMaxWeightGrandCoalition() )
					firstProperty = true;
			// - otherwise we need to check whether for each other model there exists an agent that would get less.
			if( !firstProperty )
			{
				firstProperty = true;
				for( int m1=0; m1<modelList.size() && firstProperty; m1++ )
				{
					if( m1 != m )
					{
						boolean exists = false;
						for( int i=0; i<agents.size() && !exists; i++ )
							if( gainMatrix.get(m).get(agents.getAgent(i).getId()) >= gainMatrix.get(m1).get(agents.getAgent(i).getId()) )
								exists = true;
						
						if( !exists )
							firstProperty = false;
					}
				}
			}
			
			if( firstProperty )
			{
				imputations.add(model);
				imputationGainMatrix.add(gainMatrix.get(m));
				if( endImputationTime == 0 )
				{
					endImputationTime = System.currentTimeMillis();
					if( task == Task.Imputations )
						stop = true;
				}
//				printModel(model);
			}
		}
	}
	
	private void startCore() {
		
		System.out.println("\nCore answer sets:");
		
		HashSet< Integer > nonCoreAnswerSetIndices = new HashSet< Integer >();
		AgentCollection agents = ((NTUInputBuilder)inputBuilder).getAgentCollection();
		
		// Generate every single coalition of agents (except the ones composed by one agent and the total one).
		int[] binaryString = new int[agents.size()];
		for( int i=0; i<agents.size(); i++ )
			binaryString[i] = 0;
		
		int i = 0;
		while( i < agents.size() )
		{
			i = 0;
			while( i < agents.size() && binaryString[i] != 0 )
			{
				binaryString[i] = 0;
				i++;
			}
			if( i < agents.size() )
				binaryString[i] = 1;

			// Check whether the generated coalition is composed by at least two agents and almost n-1 agents.
			AgentCollection coalition = new AgentCollection();
			for( int j=0; j<agents.size(); j++ )
			{
				if( binaryString[j] == 1 )
					coalition.pushAgent(agents.getAgent(j));
			}
			if( coalition.size() > 1 && coalition.size() < agents.size() )
			{
				if( kCore == 0 || coalition.size() == kCore )
				{
					List< String > coalitionProgramFiles = new ArrayList< String >();
					for( int j=0; j<coalition.size(); j++ )
						coalitionProgramFiles.add(coalition.getAgent(j).getProgramFile());
					
					ModelsCollection coalitionModels = solvingStrategy.solve(coalitionProgramFiles);
					while( coalitionModels.hasMoreModels() )
					{
						Model coalitionModel = coalitionModels.nextModel();
						HashMap< Integer, Integer > coalitionModelGains = new HashMap< Integer, Integer >();
						
						for( int j=0; j<coalition.size(); j++ )
						{
							Agent coalitionAgent = coalition.getAgent(j);
							int coalitionModelWeight = coalitionAgent.getWeightTable().getWeight(coalitionModel);
							coalitionModelGains.put(coalitionAgent.getId(), coalitionModelWeight);
						}
						
						// Check whether this is a objection to some imputations.
						for( int j=0; j<imputations.size(); j++ )
						{
							if( !nonCoreAnswerSetIndices.contains(j) )
							{
								boolean objection = true;
								for( int k=0; k<coalition.size() && objection; k++ )
								{
									if( coalitionModelGains.get(coalition.getAgent(k).getId()) <= imputationGainMatrix.get(j).get(coalition.getAgent(k).getId()) )
										objection = false;
								}
								if( objection )
									nonCoreAnswerSetIndices.add(j);
							}
						}
					}
				}
			}
		}
		
		endCoreTime = System.currentTimeMillis();
		for( int j=0; j<imputations.size(); j++ ) 
			if( !nonCoreAnswerSetIndices.contains(j) )
			{
				core.add(imputations.get(j));
//				printModel(imputations.get(j));
			}
	}

	
	private void printModel( Model model ) {
		
		System.out.print("{");
		Enumeration< Predicate > predicates = model.getPredicates();
		while( predicates.hasMoreElements() ) {
			Predicate predicate = predicates.nextElement();
			Enumeration< Literal > literals = predicate.getLiterals();
			while( literals.hasMoreElements() ) {
				Literal l = literals.nextElement();
				System.out.print(" " + l);
			}
		}
		System.out.println(" }");
	}
	
	private void printStats() {
		if( endImputationTime > 0 )
		{
			System.out.println("\nStatistics:");
			System.out.println("\tIAS in "+(endImputationTime-startTime)+" msec");
			if( endCoreTime > 0 )
				System.out.println("\tCAS in "+(endCoreTime-startTime)+" msec");
		}		
	}
		
	public static void main( String[] args ) {
		
		NTUFacade facade = new NTUFacade();
		facade.readInput(args);
		facade.start();
		
	}
}
