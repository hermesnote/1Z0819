package chapter04;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		try {		
			doA();
			doB();	
		} catch(IOException e) {
			System.out.println("c");
			return;
		} finally {
			System.out.println("d");
		}
		System.out.println("f");	
	}
	
	private static void doA() {
		System.out.println("a");
		if(false) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	private static void doB() throws FileNotFoundException {
		System.out.println("b");
		if(true) {
			throw new FileNotFoundException();
		}
	}

}


/*
 * A. The compilation fails.
 * B. abdf
 * C. abd.
 * D. adf.
 * E. abcd
 *  
 */
