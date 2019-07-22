package input;

import data.Agent;
import data.AgentCollection;

public class NTUInputBuilder extends InputBuilder {

	private String id;
	private String programFile;
	private Agent agent;
	private AgentCollection agents;
	
	public NTUInputBuilder() {
		super();
		id = "";
		programFile = "";
		agent = null;
		agents = new AgentCollection();
	}
	
	@Override
	public void onAgentId( String ident ) {
		// Start a new agent
		this.id = ident;
	}
	
	@Override
	public void onProgramFile( String fileName ) {
		this.programFile = fileName;
	}

	@Override
	public void onAgent() {
		assert id != "" && programFile != "" : "Not valid agent";
		agent = new Agent(id, programFile);
		agents.pushAgent(agent);
		id = "";
		programFile = "";
	}
	
	public AgentCollection getAgentCollection() {
		return agents;
	}

}
