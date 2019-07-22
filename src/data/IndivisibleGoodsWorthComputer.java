package data;

import java.util.Enumeration;

import it.unical.mat.dlv.program.Literal;
import it.unical.mat.wrapper.Model;
import it.unical.mat.wrapper.Predicate;

public class IndivisibleGoodsWorthComputer extends WorthComputer {

	private static IndivisibleGoodsWorthComputer unique;
	
	private IndivisibleGoodsWorthComputer() {
		super();
		unique = null;
	}
	
	public static IndivisibleGoodsWorthComputer getInstance() {
		if ( unique == null )
			unique = new IndivisibleGoodsWorthComputer();
		return unique;
	}
	
	@Override
	public double getWorth(Model model, Agent agent) {

		int worth = 0;
		Enumeration< Predicate > predicates = model.getPredicates();
		while( predicates.hasMoreElements() ) {
			Predicate predicate = predicates.nextElement();
			if( predicate.name().equals("get") )
			{
				Enumeration< Literal > literals = predicate.getLiterals();
				while( literals.hasMoreElements() ) {
					Literal l = literals.nextElement();
					if( agent.getId().equals(l.getAttributeAt(0).toString()) )
					{
						if( l.getAttributeAt(1).isNumericConstant() )
							worth += Integer.parseInt(l.getAttributeAt(1).toString());
					}
				}				
			}
		}
		return worth;
	}

}
