package chapter03;

public class Test17 {
	
	// 類別變數
	static StringBuilder sb1 = new StringBuilder("yo ");
	// 物件變數
	StringBuilder sb2 = new StringBuilder("hi ");

	public static void main(String[] args) {
		
		sb1 = sb1.append( new Test17().foo( new StringBuilder("hey ") ) );
		System.out.print(sb1);
		
	}
	
	StringBuilder foo(StringBuilder s) {
		System.out.print(s + " oh " + sb2);
		return new StringBuilder("ey");
	}

}


/*
 * A. hey oh hi yo ey
 * B. oh hi hey
 * C. yo ey
 * D. hey oh hi ey
 * E. A compile time error occurs
 * F. hey oh hi 
 *
*/