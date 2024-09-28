package chapter03;

import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;

public class Test9 {
	
	// 內部靜態類別，可視為類別變數
	private static class Greet{
		// 物件方法
		private void print() { // line 2
			System.out.println("Hello World");
			
			// 方法內部類別，可視為區域變數，不能宣告存取權限
			class someClass{};
		}
	}

	public static void main(String[] args) {
		
		// new Greet直接調用靜態內部類別, 視同直接調用類別變數
		Test9.Greet i = new Greet(); // line 8
		i.print(); // line 9
		
	}

}



/*
 * What is the result?
 * 
 * A. The compilation fails at line9.
 * B. The compilation fails at line 2.
 * C. Hello World
 * D. The compilation fails at line 8.
 *
*/