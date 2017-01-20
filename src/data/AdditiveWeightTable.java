package data;

import java.util.Enumeration;
import java.util.HashMap;

import util.ErrorMessage;
import it.unical.mat.dlv.program.Literal;
import it.unical.mat.wrapper.Model;
import it.unical.mat.wrapper.Predicate;

public class AdditiveWeightTable extends WeightTable {

	private HashMap< String, Integer > table;
	
	public AdditiveWeightTable() {
		super();
		table = new HashMap< String, Integer >();
	}

	@Override
	public boolean insertWeight( String key, String value ) {
		if( key.contains(",") ) // there is more than one literal in the current key;
			ErrorMessage.errorDuringParsing("Every key should be a single literal since option -nonAdditive is not active");
//		Atom a;
//		if( key.startsWith("-") )
//			a = new NormalAtom(true,key);
//		else
//			a = new NormalAtom(key);
//		Literal l = new Literal(true,a);
		int val = Integer.parseInt(value);
		Integer ret = table.put(key, val);
		return (ret == null) ? true : false;
	}

	@Override
	public int getWeight( Model model ) {
		int weight = 0;
		Enumeration< Predicate > predicates = model.getPredicates();
		while( predicates.hasMoreElements() ) {
			Predicate predicate = predicates.nextElement();
			Enumeration< Literal > literals = predicate.getLiterals();
			while( literals.hasMoreElements() ) {
				Literal l = literals.nextElement();
				if( !table.containsKey(l.toString()) )
					ErrorMessage.errorGeneric("WeightTable --> literal " + l + " not found!");
				else
					weight += table.get(l.toString());
			}
		}
		return weight;
	}

	@Override
	public String toString() {
		return "AdditiveWeightTable [table=" + table + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((table == null) ? 0 : table.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdditiveWeightTable other = (AdditiveWeightTable) obj;
		if (table == null) {
			if (other.table != null)
				return false;
		} else if (!table.equals(other.table))
			return false;
		return true;
	}
	
}
