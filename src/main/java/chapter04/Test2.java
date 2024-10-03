package chapter04;

public class Test2 {
	
	public static void doThings() throws GeneralException{
		
		try {
			throw new RuntimeException("Something happened");
		} catch(Exception e) {
			throw new SpecificException(e.getMessage());
		}
		
	}

	public static void main(String[] args) {
		
		try {
			Test2.doThings();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}

	class GeneralException extends Exception /* line 1 */ {
		public GeneralException(String s) {
			super(s);
		}
	}
	
	class SpecificException extends GeneralException/* line 2 */ {
		public SpecificException(String s) {
			super(s);
		}
	}
	


/*
 * Which option should you choose to enable the code to print Something happened?
 * A. Ass extendsGeneralException on line 1. Add extends Exception on line 2.
 * B. Add extends SpecificException on line 1. Add extends GeneralException on line 2.
 * C. Add extends Exception on line 1. Add extends Exception on line 2.
 * D. Add extends Exception on line 1. Add extends GeneralException on line 2. 
 */




