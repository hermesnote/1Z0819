package chapter04;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) {
		
		try {
			doA();
		} catch(IOException e) {
			
		}
		
	}
	
	private static void doA() throws IOException, IndexOutOfBoundsException{
		if(false) {
			throw new FileNotFoundException();
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

}


/*
 * What must be added in line 1 to compile this class?
 * A. catch(IOExceprtion){}
 * B. catch(FileNotFoundException | IndexOutOfBoundsException e) {}
 * C. catch(FileNotFoundException | IOException e) {}
 * D. catch(IndexOutOfBoundsException e){} catch(FileNotFoundException e){}
 * E. catch(FileNotFoundException e){} catch(IndexOutOfBoundsException){}
 *  
*/