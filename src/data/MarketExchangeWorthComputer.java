package data;

import java.util.Enumeration;

import it.unical.mat.wrapper.Model;
import it.unical.mat.wrapper.Predicate;

public class MarketExchangeWorthComputer extends WorthComputer {

	private static MarketExchangeWorthComputer unique;
	
	public MarketExchangeWorthComputer() {
		super();
		unique = null;
	}
	
	public static MarketExchangeWorthComputer getInstance() {
		if ( unique == null )
			unique = new MarketExchangeWorthComputer();
		return unique;
	}

	@Override
	public double getWorth(Model model, Agent agent) {

		double sold = 0;
		double bought = 0;
		Enumeration< Predicate > predicates = model.getPredicates();
		while( predicates.hasMoreElements() ) {
			Predicate predicate = predicates.nextElement();
			if( predicate.name().startsWith("sell_") ) {
				if( agent.getId().equals(predicate.name().substring(predicate.name().indexOf("_")+1,predicate.name().lastIndexOf("_"))) )
					sold += 1;
			}
			else if( predicate.name().startsWith("buy_") ) {
				if( agent.getId().equals(predicate.name().substring(predicate.name().indexOf("_")+1,predicate.name().lastIndexOf("_"))) )
					bought += 1;
			}
		}
		if( sold < bought )
			return -1;
		else
			return bought;

	}

}