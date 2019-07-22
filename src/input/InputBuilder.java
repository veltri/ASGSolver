package input;

public abstract class InputBuilder {
	
	public InputBuilder() {	}
	
	public abstract void onAgentId( String id );
	public abstract void onProgramFile( String fileName );
	public abstract void onAgent();
	
}
