package util;

public class ErrorMessage {

	private static final String ERROR_PARSING = "\nError during parsing";
	private static final String ERROR_GENERIC = "\nGeneric error";
	private static final int ERROR_PARSING_CODE = 100;
	private static final int ERROR_GENERIC_CODE = 110;
	
    public static void errorDuringParsing( String errorMessage )
    {
        System.out.println(ERROR_PARSING+": "+errorMessage);
        System.exit( ERROR_PARSING_CODE );
    }

    public static void errorGeneric( String errorMessage )
    {
        System.out.println(ERROR_GENERIC+": "+errorMessage);
        System.exit( ERROR_GENERIC_CODE );
    }
    
}
