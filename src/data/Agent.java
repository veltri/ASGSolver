package data;

public class Agent {
	
	private String id;
	private String programFile;
	private double maxWeightSingleton;
	private double maxWeightGrandCoalition;
	
	public Agent( String ident, String fileName, int maxWSC, int maxWGC ) {
		init(ident,fileName,maxWSC,maxWGC);
	}
	
	public Agent( String ident, String fileName ) {
		init(ident,fileName,Integer.MIN_VALUE, Integer.MIN_VALUE);
	}

	private void init( String ident, String fileName, double maxWSC, double maxWGC ) {
		this.id = ident;
		this.programFile = fileName;
		this.maxWeightSingleton = maxWSC;
		this.maxWeightGrandCoalition = maxWGC;
	}
	
	public double getMaxWeightGrandCoalition() {
		return maxWeightGrandCoalition;
	}

	public void setMaxWeightGrandCoalition(double maxWeightGrandCoalition) {
		this.maxWeightGrandCoalition = maxWeightGrandCoalition;
	}
	
	public double getMaxWeightSingleton() {
		return maxWeightSingleton;
	}
	
	public void setMaxWeightSingleton(double m ){
		maxWeightSingleton = m;
	}
	
	public String getId() {
		return id;
	}

	public String getProgramFile() {
		return programFile;
	}

	@Override
	public String toString() {
		return "Agent [id=" + id + ", programFile=" + programFile + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		long temp;
		temp = Double.doubleToLongBits(maxWeightGrandCoalition);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(maxWeightSingleton);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (Double.doubleToLongBits(maxWeightGrandCoalition) != Double
				.doubleToLongBits(other.maxWeightGrandCoalition))
			return false;
		if (Double.doubleToLongBits(maxWeightSingleton) != Double
				.doubleToLongBits(other.maxWeightSingleton))
			return false;
		if (programFile == null) {
			if (other.programFile != null)
				return false;
		} else if (!programFile.equals(other.programFile))
			return false;
		return true;
	}

}
