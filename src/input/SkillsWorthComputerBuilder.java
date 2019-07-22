package input;

import java.util.HashSet;
import java.util.Hashtable;

import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

import data.SkillsWorthComputer;
import util.ErrorMessage;

public class SkillsWorthComputerBuilder extends DefaultHandler {

	// Data to be stored:
	// 	- agentIDs,
	//  - taskIDs, 
	//  - \sigma_h for each task h, 
	//  - reqS(h) for each task h, 
	//  - availS(i) for each agent i, 
	//  - t_{ij} for each agent i and each task j.
	
	Hashtable<String, HashSet<String>> agentAvail;
	Hashtable<String, Hashtable<String, Integer>> agentEarns;
	Hashtable<String, HashSet<String>> taskRequires;
	Hashtable<String, Integer> skillSigma;
	
	HashSet<String> currAvail;
	Hashtable<String, Integer> currEarns;
	HashSet<String> currRequires;
	
	static final String rootTag = "root";
	static final String agentTag = "agent";
	static final String taskTag = "task";
	static final String availTag = "avail";
	static final String requiresTag = "requires";
	static final String earnsTag = "earns";
	static final String skillTag = "skill";
	
	private enum TAG{ EMPTY, ROOT, AGENT, TASK, AVAIL, REQUIRES, EARNS, SKILL};
	private TAG tagName;
	
	private String agentId;
	private String taskId;
	private String text;
	private String attKey;
	private String attValue;
	private String skillId;
	private String sigmaSkill;
	
	public SkillsWorthComputerBuilder() {
		super();
		tagName = TAG.EMPTY;
		agentId = "";
		taskId = "";
		text = "";
		attKey = "";
		attValue = "";
		skillId = "";
		sigmaSkill = "";
		
		agentAvail = null;
		agentEarns = null;
		taskRequires = null;
		skillSigma = null;
		
		currAvail = null;
		currEarns = null;
		currRequires = null;
	}
	
	@Override
	public void startDocument() throws SAXException {
		agentAvail = new Hashtable<String, HashSet<String>>();
		agentEarns = new Hashtable<String, Hashtable<String, Integer>>();
		taskRequires = new Hashtable<String, HashSet<String>>();
		skillSigma = new Hashtable<String, Integer>();
	}
	
	@Override
	public void endDocument() throws SAXException {
		SkillsWorthComputer.getInstance().setAgentAvail(agentAvail);
		SkillsWorthComputer.getInstance().setAgentEarns(agentEarns);
		SkillsWorthComputer.getInstance().setTaskRequires(taskRequires);
		SkillsWorthComputer.getInstance().setSkillSigma(skillSigma);
	}
	
	@Override
	public void startElement(String namespaceURI,
            String localName,
            String qName, 
            Attributes atts) 
		throws SAXException {
		
		if( tagName == TAG.EMPTY ) {
			if( localName.equals(rootTag) ) {
				tagName = TAG.ROOT;
			}
			else
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: not a valid tag name ("+ localName +")!");
		}
		else if( tagName == TAG.ROOT ) {
			if( localName.equals(agentTag) ) {
				tagName = TAG.AGENT;
				currAvail = new HashSet<String>();
				currEarns = new Hashtable<String, Integer>();
			}
			else if( localName.equals(taskTag) ) {
				tagName = TAG.TASK;
				currRequires = new HashSet<String>();
			}
			else if( localName.equals(skillTag) ) {
				tagName = TAG.SKILL;
			}
			else {
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: not a valid tag name ("+ localName +")!");
			}
		}
		else if( tagName == TAG.AGENT ) {
			if( localName.equals(availTag) ) {
				tagName = TAG.AVAIL;
			}
			else if( localName.equals(earnsTag) ) {
				tagName = TAG.EARNS;
			}
			else {
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: not a valid tag name ("+ localName +")!");
			}
		}
		else if( tagName == TAG.TASK ) {
			if( localName.equals(requiresTag) ) {
				tagName = TAG.REQUIRES;
			}
			else {
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: not a valid tag name ("+ localName +")!");
			}
		}
		else {
			ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: not a valid tag name ("+ localName +")!");
		}
		
		for( int i=0; i<atts.getLength(); i++ )	{
			onAttribute(atts.getLocalName(i),atts.getValue(i));			
		}
		
	}

	@Override
	public void endElement(String namespaceURI,
            String localName,
            String qName)
        throws SAXException {
		
		if( tagName == TAG.ROOT && localName.equals(rootTag) ) {
			tagName = TAG.EMPTY;
		}
		else if( tagName == TAG.AGENT && localName.equals(agentTag) ) {
			finalize(TAG.AGENT);
			tagName = TAG.ROOT;
		}
		else if( tagName == TAG.AVAIL && localName.equals(availTag) ) {
			finalize(TAG.AVAIL);
			tagName = TAG.AGENT;
		}
		else if( tagName == TAG.EARNS && localName.equals(earnsTag) ) {
			finalize(TAG.EARNS);
			tagName = TAG.AGENT;
		}
		else if( tagName == TAG.TASK && localName.equals(taskTag) ) {
			finalize(TAG.TASK);
			tagName = TAG.ROOT;
		}
		else if( tagName == TAG.REQUIRES && localName.equals(requiresTag) ) {
			finalize(TAG.REQUIRES);
			tagName = TAG.TASK;
		}
		else if( tagName == TAG.SKILL && localName.equals(skillTag) ) {
			finalize(TAG.SKILL);
			tagName = TAG.ROOT;
		}
		else {
			ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: not a valid node ("+ localName +")!");
		}
		
	}
	
	@Override
	public void characters( char[] ch, 
			int start, 
			int length )
		throws SAXException {
		
		text = new String(ch,start,length);
		
	}
	
	private void onAttribute(String attrKey, String attrValue) {
		
		if( tagName == TAG.AGENT ) {
			if( attrKey == "id" )
				agentId = attrValue;
			else
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: not a valid attribute ("+ attrKey +") "
						+ "of "+ TAG.AGENT +"!");
		}
		else if( tagName == TAG.TASK ) {
			if( attrKey == "id" )
				taskId = attrValue;
			else
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: not a valid attribute ("+ attrKey +") "
						+ "of "+ TAG.TASK +"!");
		}
		else if( tagName == TAG.EARNS ) {
			if( attrKey == "taskId" )
				attKey = attrValue;
			else if( attrKey == "value" )
				attValue = attrValue;
			else
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: not a valid attribute ("+ attrKey +") "
						+ "of "+ TAG.EARNS +"!");
		}
		else if( tagName == TAG.SKILL ) {
			if( attrKey == "id" )
				skillId = attrValue;
			else if( attrKey == "sigma" )
				sigmaSkill = attrValue;
			else
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: not a valid attribute ("+ attrKey +") "
						+ "of "+ TAG.SKILL +"!");
		}
		else {
			ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: not a valid attribute ("+ attrKey +")!");
		}
		
	}
	
	private void finalize( TAG tagName ) {
		
		switch( tagName ) {
		case AGENT: {
			if( agentId == "" || currAvail == null || currEarns == null )
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: incomplete data about agents!");
			if( agentAvail.put(agentId, currAvail) != null )
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: repeated agent "+agentId+"!");
			if( agentEarns.put(agentId, currEarns) != null )
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: repeated agent "+agentId+"!");
			agentId = "";
			currAvail = null;
			currEarns = null;
			break;
		}
		case AVAIL: {
			if( text == "" )
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: wrong node ("+ availTag +")!");
			if( !currAvail.add(text) )
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: wrong node ("+ availTag +")!");
			text = "";
			break;
		}
		case EARNS: {
			if( attKey == "" || attValue == "" )
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: wrong node ("+ earnsTag +")!");			
			if( currEarns.put(attKey, Integer.valueOf(attValue)) != null )
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: wrong node ("+ earnsTag +")!");
			attKey = "";
			attValue = "";
			break;
		}
		case TASK: {
			if( taskId == "" || currRequires == null )
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: incomplete data about tasks!");
			if( taskRequires.put(taskId, currRequires) != null )
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: repeated task "+taskId+"!");
			taskId = "";
			currRequires = null;
			break;
		}
		case REQUIRES: {
			if( text == "" )
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: wrong node ("+ requiresTag +")!");
			if( !currRequires.add(text) ) 
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: wrong node ("+ requiresTag +")!");
			text = "";
			break;
		}
		case SKILL: {
			if( skillId == "" || sigmaSkill == "" )
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: incomplete data about skills!");
			if( skillSigma.put(skillId, Integer.valueOf(sigmaSkill)) != null )
				ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: repeated skill "+skillId+"!");
			skillId = "";
			sigmaSkill = "";
			break;
		}
		default:
			ErrorMessage.errorDuringParsing("Error while parsing the metadata XML file: internal error!");
			break;
		}
	}
	
}
