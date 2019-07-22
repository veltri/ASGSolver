package data;

import java.util.Enumeration;

import it.unical.mat.dlv.program.Literal;
import it.unical.mat.wrapper.Model;
import it.unical.mat.wrapper.Predicate;

public class HedonicCoalitionNetworksWorthComputer extends WorthComputer {

	private static HedonicCoalitionNetworksWorthComputer unique;
	
	public HedonicCoalitionNetworksWorthComputer() {
		super();
		unique = null;
	}
	
	public static HedonicCoalitionNetworksWorthComputer getInstance() {
		if ( unique == null )
			unique = new HedonicCoalitionNetworksWorthComputer();
		return unique;
	}

	@Override
	public double getWorth(Model model, Agent agent) {

		int worth = 0;
		Enumeration< Predicate > predicates = model.getPredicates();
		while( predicates.hasMoreElements() ) {
			Predicate predicate = predicates.nextElement();
			if( predicate.name().startsWith("val_") )
				if( agent.getId().equals(predicate.name().substring(predicate.name().indexOf("_")+1)) )
					worth += 1;
		}
		return worth;

	}

}
