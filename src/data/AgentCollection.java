package data;

import java.util.ArrayList;

public class AgentCollection {

	private ArrayList< Agent > agents;
	
	public AgentCollection() {
		agents = new ArrayList< Agent >();
	}
	
	public void pushAgent( Agent a ) {
		assert a != null : "Null agent";
		agents.add(a);
	}
	
	public Agent getAgent( int i ){
		assert i >= 0 && i < agents.size() : "Index out of range";
		return agents.get(i);
	}
	
	public int size() { 
		return agents.size();
	}

	@Override
	public String toString() {
		return "AgentCollection [agents=" + agents + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agents == null) ? 0 : agents.hashCode());
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
		AgentCollection other = (AgentCollection) obj;
		if (agents == null) {
			if (other.agents != null)
				return false;
		} else if (!agents.equals(other.agents))
			return false;
		return true;
	}
	
}
