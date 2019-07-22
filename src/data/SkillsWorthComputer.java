package data;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;

import util.ErrorMessage;
import it.unical.mat.dlv.program.Literal;
import it.unical.mat.wrapper.Model;
import it.unical.mat.wrapper.Predicate;

public class SkillsWorthComputer extends WorthComputer {

	Hashtable<String, HashSet<String>> agentAvail;
	Hashtable<String, Hashtable<String, Integer>> agentEarns;
	Hashtable<String, HashSet<String>> taskRequires;
	Hashtable<String, Integer> skillSigma;
	
	private static SkillsWorthComputer unique;
	
	private SkillsWorthComputer( Hashtable<String, HashSet<String>> avail,
			Hashtable<String, Hashtable<String, Integer>> earns,
			Hashtable<String, HashSet<String>> requires,
			Hashtable<String, Integer> sigma ) {
		super();
		unique = null;
		agentAvail = avail;
		agentEarns = earns;
		taskRequires = requires;
		skillSigma = sigma;
	}
	
	public static SkillsWorthComputer getInstance() {
		if( unique == null )
			unique = new SkillsWorthComputer(null, null, null, null);
		return unique;
	}
	
	public void setAgentAvail(Hashtable<String, HashSet<String>> agentAvail) {
		this.agentAvail = agentAvail;
	}

	public void setAgentEarns(Hashtable<String, Hashtable<String, Integer>> agentEarns) {
		this.agentEarns = agentEarns;
	}

	public void setTaskRequires(Hashtable<String, HashSet<String>> taskRequires) {
		this.taskRequires = taskRequires;
	}

	public void setSkillSigma(Hashtable<String, Integer> skillSigma) {
		this.skillSigma = skillSigma;
	}
	
	@Override
	public double getWorth(Model model, Agent agent) {
		
		if( agentAvail == null || agentEarns == null || taskRequires == null || skillSigma == null )
			ErrorMessage.errorGeneric("Not valid metadata");
		
		Set<String> agentIDs = agentAvail.keySet();
		Set<String> taskIDs = taskRequires.keySet();
		Vector<String> coalition = new Vector<String>();
		Vector<String> tasks = new Vector<String>();
		HashSet<String> reqByTasks = new HashSet<String>();
		
		Enumeration< Predicate > predicates = model.getPredicates();
		while( predicates.hasMoreElements() ) {
			Predicate predicate = predicates.nextElement();
			Enumeration< Literal > literals = predicate.getLiterals();
			while( literals.hasMoreElements() ) {
				Literal l = literals.nextElement();
				if( agentIDs.contains(l.toString()) )
					coalition.add(l.toString());
				else if( taskIDs.contains(l.toString()) )
					tasks.add(l.toString());
			}
		}
		if( !coalition.contains(agent.getId()) )
			return 0;
		
		// Compute \Sigma_{t_{j} \in T} \tao_{i,j} (See Section 4.1 of the paper).
		int sum = 0;
		for( int i=0; i<tasks.size(); i++ ) {
			if( !agentEarns.containsKey(agent.getId()) )
				ErrorMessage.errorGeneric("Agent id not recognized: " + agent.getId());
			if( !agentEarns.get(agent.getId()).containsKey(tasks.get(i)) )
				ErrorMessage.errorGeneric("Task id not recognized: " + tasks.get(i));
			sum += agentEarns.get(agent.getId()).get(tasks.get(i));
		}
		// Compute \Sigma_{s_h \in S(T)} \sigma_h / |C| (See Section 4.1 of the paper).
		for( int i=0; i<tasks.size(); i++ ) {
			if( !taskRequires.containsKey(tasks.get(i)) )
				ErrorMessage.errorGeneric("Task id not recognized: " + tasks.get(i));
			reqByTasks.addAll(taskRequires.get(tasks.get(i)));
		}
		String[] reqByTasksArray = reqByTasks.toArray(new String[reqByTasks.size()]);
		// FIXME: Should the following variable be an int??? 
		double sigmaTot = 0;
		for( int i=0; i<reqByTasksArray.length; i++ ) {
			if( !skillSigma.containsKey(reqByTasksArray[i]) )
				ErrorMessage.errorGeneric("Skill id not recognized: " + reqByTasksArray[i]);
			sigmaTot += skillSigma.get(reqByTasksArray[i]);
		}			
		sigmaTot = sigmaTot/(double)coalition.size();		
		
		// Compute the last sum \Sigma_{s_h \in S(T) \cap availS(i)} \sigma_h / |\{i' \in C | s_h \in availS(i')\}| (See Section 4.1).
		double lastSum = 0;
		if( !agentAvail.containsKey(agent.getId()) )
			ErrorMessage.errorGeneric("Agent id not recognized: " + agent.getId());
		String[] availSkillsOfAgent = agentAvail.get(agent.getId()).toArray(new String[agentAvail.get(agent.getId()).size()]);
		for( int i=0; i<availSkillsOfAgent.length; i++ ) {
			String skill = availSkillsOfAgent[i];
			if( reqByTasks.contains(skill) ) {
				int membersOfCoalitionSharingThisSkill = 0;
				for( int j=0; j<coalition.size(); j++ ) {
					if( !agentAvail.containsKey(coalition.get(j)) )
						ErrorMessage.errorGeneric("Agent id not recognized: " + coalition.get(j));
					if( agentAvail.get(coalition.get(j)).contains(skill) )
						membersOfCoalitionSharingThisSkill++;
				}
				if( !skillSigma.containsKey(skill) )
					ErrorMessage.errorGeneric("Skill id not recognized: " + skill);
				// FIXME: Should the following variables be Integer?
				double sigma = skillSigma.get(skill);
				sigma = sigma / (double)membersOfCoalitionSharingThisSkill;
				lastSum += sigma;
			}
		}
		
		return sum+sigmaTot+lastSum;
	}

}
