package input;

import data.AdditiveWeightTable;
import data.WeightTable;

public class AdditiveWeightTableFactory extends WeightTableFactory {

	@Override
	public WeightTable createWeightTable() {
		
		return new AdditiveWeightTable();
		
	}

}
