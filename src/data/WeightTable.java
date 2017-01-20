package data;

import it.unical.mat.wrapper.Model;

public abstract class WeightTable {

	public WeightTable() { }
	
	public abstract boolean insertWeight( String key, String value );
	public abstract int getWeight( Model model );

}
