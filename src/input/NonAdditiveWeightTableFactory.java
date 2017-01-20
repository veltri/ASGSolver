package input;

import data.NonAdditiveWeightTable;
import data.WeightTable;

public class NonAdditiveWeightTableFactory extends WeightTableFactory {

	@Override
	public WeightTable createWeightTable() {
		
		return new NonAdditiveWeightTable();

	}

}
