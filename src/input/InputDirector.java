package input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//SAX
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;

import util.ErrorMessage;

public class InputDirector {
	
	public InputDirector() {
		builder = null;
		worthComputerBuilder = null;
	}
	
	public void parseInput( String inputDirectory, String metadataFileName ) {
		assert builder != null : "Set a valid input builder";
		File dir = new File(inputDirectory);
		if( !dir.exists() || !dir.isDirectory() )
			ErrorMessage.errorDuringParsing("Not a valid input directory");
		for( File file: dir.listFiles() )
		{
			String fileName = file.getName();
			if( fileName.endsWith(".dl") )
			{
				String agentId = fileName.substring(0, fileName.indexOf(".dl"));
				builder.onAgentId(agentId);
				builder.onProgramFile(file.getAbsolutePath());
				builder.onAgent();
			}
		}
		if( metadataFileName == null )
			ErrorMessage.errorGeneric("Null input metadata file");
		
		parseMetadata(metadataFileName);
	}
	
	private void parseMetadata( String metadataFileName ) {
		try {			
			SAXParserFactory spf = SAXParserFactory.newInstance();
		    spf.setNamespaceAware(true);
		    SAXParser saxParser = spf.newSAXParser();
		    XMLReader xmlReader = saxParser.getXMLReader();
		    if( worthComputerBuilder == null )
		    	ErrorMessage.errorGeneric("WorthBuilder is still null");
		    xmlReader.setContentHandler(worthComputerBuilder);
		    xmlReader.parse(metadataFileName);
		    
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void configureBuilder( InputBuilder b ) { this.builder = b; }
	public InputBuilder getBuilder() { return builder; }
	
	public void configureWorthBuilder( DefaultHandler wb ) { this.worthComputerBuilder = wb; }
	public DefaultHandler getWorthBuilder() { return worthComputerBuilder; }
	
	private InputBuilder builder;
	private DefaultHandler worthComputerBuilder;
}
