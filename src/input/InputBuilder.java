package input;

public abstract class InputBuilder {
	
	protected WeightTableFactory weightTableFactory;
	
	public InputBuilder() {
		weightTableFactory = null;
	}
	
	public void configureWeightBuilder( WeightTableFactory wf ) {
		assert wf == null : "The table factory has been already set up";
		this.weightTableFactory = wf;
	}
	
	public WeightTableFactory getWeightBuilder() {
		return weightTableFactory;
	}
	
	public abstract void onAgentId( int id );
	public abstract void onProgramFile( String fileName );
	public abstract void onWeightKey( String key );
	public abstract void onWeightValue( String value );
	public abstract void onWeight();
	public abstract void onAgent();
	
}
