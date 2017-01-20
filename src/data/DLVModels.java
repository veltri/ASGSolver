package data;

import it.unical.mat.wrapper.Model;
import it.unical.mat.wrapper.ModelBufferedHandler;

public class DLVModels implements ModelsCollection {

	private ModelBufferedHandler handler;
	
	public DLVModels( ModelBufferedHandler h ) {
		handler = h;
	}
	
	@Override
	public boolean hasMoreModels() {
		return handler.hasMoreModels();
	}

	@Override
	public Model nextModel() {
		return handler.nextModel();
	}

}
