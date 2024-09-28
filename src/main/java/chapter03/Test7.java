package chapter03;

public class Test7 {
	
	// final常數變數須給初值,或在建構子/初始化區塊給值
	private final double value;
	
//	// 初始化區塊 initial block
//	{
//		value = 123;
//	}
	
	public Test7(String value) {
		this(Double.parseDouble(value));
	}
	
	public Test7(Double value) {
		this.value = value;
	}
	
	public Test7() { // 無參數建構子無初始化編譯會報錯
//		this.value = 100;
	}; 
	
	public double getValue() {
		return value;
	}

	public static void main(String[] args) {
		
		Test7 p1 = new Test7("1.99");
		Test7 p2 = new Test7(2.99);
		Test7 p3 = new Test7();
		System.out.println(p1.getValue()+","+p2.getValue()+","+p3.getValue());
		
	}

}


/*
 *  A. The compilation fail
 *  B. 1.99,2.99,0
 *  C. 1.99,2.99,0.0
 *  D. 1.99,2.99
 */


