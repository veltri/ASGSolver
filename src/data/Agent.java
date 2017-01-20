package data;

public class Agent {
	
	private int id;
	private String programFile;
	private WeightTable weightTable;
	private int maxWeightSingleton;
	private int maxWeightGrandCoalition;
	
	public Agent( int ident, String fileName, WeightTable wt, int maxWSC, int maxWGC ) {
		init(ident,fileName,wt,maxWSC,maxWGC);
	}
	
	public Agent( int ident, String fileName, WeightTable wt ) {
		init(ident,fileName,wt,Integer.MIN_VALUE, Integer.MIN_VALUE);
	}

	private void init( int ident, String fileName, WeightTable wt, int maxWSC, int maxWGC ) {
		this.id = ident;
		this.programFile = fileName;
		this.weightTable = wt;
		this.maxWeightSingleton = maxWSC;
		this.maxWeightGrandCoalition = maxWGC;
	}
	
	public int getMaxWeightGrandCoalition() {
		return maxWeightGrandCoalition;
	}

	public void setMaxWeightGrandCoalition(int maxWeightGrandCoalition) {
		this.maxWeightGrandCoalition = maxWeightGrandCoalition;
	}
	
	public int getMaxWeightSingleton() {
		return maxWeightSingleton;
	}
	
	public void setMaxWeightSingleton( int m ){
		maxWeightSingleton = m;
	}
	
	public int getId() {
		return id;
	}

	public String getProgramFile() {
		return programFile;
	}

	public WeightTable getWeightTable() {
		return weightTable;
	}

	@Override
	public String toString() {
		return "Agent [id=" + id + ", programFile=" + programFile + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + maxWeightGrandCoalition;
		result = prime * result + maxWeightSingleton;
		result = prime * result
				+ ((programFile == null) ? 0 : programFile.hashCode());
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
		Agent other = (Agent) obj;
		if (id != other.id)
			return false;
		if (maxWeightGrandCoalition != other.maxWeightGrandCoalition)
			return false;
		if (maxWeightSingleton != other.maxWeightSingleton)
			return false;
		if (programFile == null) {
			if (other.programFile != null)
				return false;
		} else if (!programFile.equals(other.programFile))
			return false;
		return true;
	}



}
