package chapter04;

import java.io.FileNotFoundException;

public class Test7 {
	
	// and the code fragment（表以下程式寫在主方法內）
	public static void main(String[] args) {
		
		try {
			String param1 = "Oracle";
			if(param1.equals("Oracle")) { // equalsIgnoreCase 無視大小寫 
				throw new ExSub(9001, "APPLICATION ERROR-9001", new FileNotFoundException("MyFile.txt"));
			} 
			throw new ExSuper(9001, new FileNotFoundException("MyFile.txt")); // line 1
		} catch(ExSuper ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}


class ExSuper extends Exception {
	private final int eCode;
	
	public ExSuper(int eCode, Throwable cause) {
		super(cause);
		this.eCode = eCode;
	}
	
	public ExSuper(int eCode, String msg, Throwable cause) {
		super(msg, cause);
		this.eCode = eCode;
	}
	
	public String getMessage() {
		return this.eCode + ":" + super.getMessage() + "-" + this.getCause().getMessage();
	}
	
}

class ExSub extends ExSuper{
	public ExSub(int eCode, String msg, Throwable cause) {
		super(eCode, msg, cause);
	}
}





/*
 * What is the result?
 * A. Compilation fails at line 1.
 * B. 9001:java.io.FileNotFoundException:MyFile.txt-MyFile.txt
 * C. 9001:APPLICATION ERROR-9001-MyFile.txt
 *    9001:java.io.FileNotFoundException:MyFile.txt-MyFile.txt
 * D. 9001:APPLICATION ERROR-9001-MyFile.txt
 */