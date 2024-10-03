package chapter04;

public class Test6 {
	
	private int num = 1;
	private int div = 0;
	
	public void divide() {
		try {
			num = num/div; // 1/0編譯報錯
			System.out.println("Exception");
		} catch (ArithmeticException ae) { // catch捕捉編譯算術報錯
			num = 100; // num為100
		} catch (Exception e) {
			num = 200;
		} finally {   // finally仍然執行
			num = 300; // num為 300
		}
		System.out.println(num);
	}

	public static void main(String[] args) {
		
		Test6 test = new Test6();
		test.divide();
		
	}

}



/*
 * What is the output?
 * A. 300
 * B. Exception
 * C. 200
 * D. 100
 */