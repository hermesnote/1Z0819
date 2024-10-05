package chapter05;

public class Test6 {

	public static void main(String[] args) {
		
		char[][] arrays = {{'a','d'},{'b','e'},{'c','f'}};
		for( char[] xx:arrays ) {
			for( char yy:xx ) {
				System.out.print(yy);
			}
			System.out.println();
		}
		
	}

}


/*
 *
 * What is the result?
 * A. ab cd ef
 * B. An ArrayIndexOutOfBoundsException is thrown at runtime.
 * C. The compilation fails.
 * D. abc def
 * E. ad be cf
 * 
 */