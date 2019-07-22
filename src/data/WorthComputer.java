package data;

import it.unical.mat.wrapper.Model;

public abstract class WorthComputer {

	public WorthComputer() { }
	
	public abstract double getWorth( Model model, Agent agent );

}
