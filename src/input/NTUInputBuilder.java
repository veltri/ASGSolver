package input;

import data.Agent;
import data.AgentCollection;
import data.WeightTable;

public class NTUInputBuilder extends InputBuilder {

	private int id;
	private String programFile;
	private String key;
	private String value;
	private WeightTable weightTable;
	private Agent agent;
	private AgentCollection agents;
	
	public NTUInputBuilder() {
		super();
		id = -1;
		programFile = "";
		key = "";
		value = "";
		weightTable = null;
		agent = null;
		agents = new AgentCollection();
	}
	
	@Override
	public void onAgentId( int ident ) {
		// Start a new agent
		this.id = ident;
		weightTable = weightTableFactory.createWeightTable();
	}
	
	@Override
	public void onProgramFile( String fileName ) {
		this.programFile = fileName;
	}
	
	@Override
	public void onWeightKey( String k ) {
		assert !k.equals("") : "Not valid weight key";
		if( this.key != "" )
			this.key += "," + k;
		else
			this.key += k;
	}
	
	@Override
	public void onWeightValue( String val ) {
		this.value = val;
	}
	
	@Override
	public void onWeight() {
		assert key != "" && value != "" : "Not valid key and/or value";
		assert weightTable != null : "Not valid weight table";
		weightTable.insertWeight(key, value);
		key = "";
		value = "";
	}

	@Override
	public void onAgent() {
		assert id != -1 && programFile != "" && weightTable != null : "Not valid agent";
		agent = new Agent(id, programFile, weightTable);
		agents.pushAgent(agent);
		id = -1;
		programFile = "";
		key = "";
		value = "";
		weightTable = null;
	}
	
	public AgentCollection getAgentCollection() {
		return agents;
	}

}
