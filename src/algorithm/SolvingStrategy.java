package algorithm;

import java.util.List;

import data.ModelsCollection;

public abstract class SolvingStrategy {

	public SolvingStrategy() { }
	
	public abstract ModelsCollection solve( List< String > fileNames );
	
}
