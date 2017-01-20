package algorithm;

import it.unical.mat.wrapper.DLVInputProgram;
import it.unical.mat.wrapper.DLVInputProgramImpl;
import it.unical.mat.wrapper.DLVInvocation;
import it.unical.mat.wrapper.DLVInvocationException;
import it.unical.mat.wrapper.DLVWrapper;
import it.unical.mat.wrapper.ModelBufferedHandler;

import java.io.IOException;
import java.util.List;

import util.Constants;
import data.DLVModels;
import data.ModelsCollection;

public class DLVStrategy extends SolvingStrategy {

	public DLVStrategy() {
		super();
	}
	
	@Override
	public ModelsCollection solve( List< String > fileNames ) {
		
		DLVInputProgram inputProgram = new DLVInputProgramImpl();
		for( String fileName : fileNames )
		{
			inputProgram.addFile(fileName);
		}
		DLVInvocation invocation = DLVWrapper.getInstance().createInvocation(Constants.getDLVPath());
		ModelBufferedHandler modelHandler = new ModelBufferedHandler(invocation);
		try {
			invocation.setInputProgram(inputProgram);
			invocation.run();
			invocation.waitUntilExecutionFinishes();
		} catch (DLVInvocationException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ModelsCollection models = new DLVModels(modelHandler);
		return models;
	}

}
