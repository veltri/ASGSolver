package input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import util.ErrorMessage;

public class InputDirector {
	
	public InputDirector() {
		builder = null;
		weightFileParser = null;
	}
	
	public void parseInput( String inputDirectory ) {
		assert builder != null : "Set a valid input builder";
		File dir = new File(inputDirectory);
		if( !dir.exists() || !dir.isDirectory() )
			ErrorMessage.errorDuringParsing("Not a valid input directory");
		for( File file: dir.listFiles() )
		{
			String fileName = file.getName();
			if( fileName.startsWith("agent") && fileName.endsWith(".dl") )
			{
				int agentId = 0;
				try{
					
					agentId = Integer.parseInt(fileName.substring(fileName.indexOf('t')+1, fileName.lastIndexOf(".dl")));
					
				} catch( NumberFormatException e ) { e.printStackTrace(); }
				builder.onAgentId(agentId);
				builder.onProgramFile(file.getAbsolutePath());
				
				String weightFileName = file.getAbsolutePath().substring(0, file.getAbsolutePath().length()-fileName.length());
				weightFileName += "weight" + agentId + ".txt";
				File weightFile = new File(weightFileName);
				assert weightFile.exists() : "Not valid weight file: " + weightFileName;
				try {
					if( weightFileParser == null )
					{
						weightFileParser = new WeightFileParser(new FileInputStream(weightFile));
						weightFileParser.configureDirector(this);
					}
					else
					{
						WeightFileParser.ReInit(new FileInputStream(weightFile));
					}
					WeightFileParser.start();
				} catch (FileNotFoundException | ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				builder.onAgent();
			}
		}
	}

	public void configureBuilder( InputBuilder b ) { this.builder = b; }
	public InputBuilder getBuilder() { return builder; }
	
	private InputBuilder builder;
	private WeightFileParser weightFileParser;
}
