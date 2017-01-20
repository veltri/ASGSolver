import java.io.IOException;
import java.util.Enumeration;

import it.unical.mat.dlv.program.Literal;
import it.unical.mat.wrapper.DLVInputProgram;
import it.unical.mat.wrapper.DLVInputProgramImpl;
import it.unical.mat.wrapper.DLVInvocation;
import it.unical.mat.wrapper.DLVInvocationException;
import it.unical.mat.wrapper.DLVWrapper;
import it.unical.mat.wrapper.Model;
import it.unical.mat.wrapper.ModelBufferedHandler;
import it.unical.mat.wrapper.Predicate;


public class Prova {

	public static void main(String[] args) {
		
		DLVInputProgram inputProgram = new DLVInputProgramImpl();
		
		inputProgram.addFile("./examples/paperGraph/agent1.dl");
		
		DLVInvocation invocation = DLVWrapper.getInstance().createInvocation("./executables/dlv");

		ModelBufferedHandler modelHandler = new ModelBufferedHandler(invocation);
		
		try {
			invocation.setInputProgram(inputProgram);
			invocation.run();
			invocation.waitUntilExecutionFinishes();
		} catch (DLVInvocationException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while( modelHandler.hasMoreModels() ) {
			Model model = modelHandler.nextModel();
			System.out.print("{");
			Enumeration< Predicate > predicates = model.getPredicates();
			while( predicates.hasMoreElements() ) {
				Predicate predicate = predicates.nextElement();
				Enumeration< Literal > literals = predicate.getLiterals();
				while( literals.hasMoreElements() ) {
					Literal l = literals.nextElement();
					System.out.println(l);
					System.out.println("name: "+l.getName());
					System.out.println("terms: "+l.attributes().size());
				}
			}
			System.out.println("}");
		}
	}
}
