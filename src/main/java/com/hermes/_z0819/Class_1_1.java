package com.hermes._z0819;

public class Class_1_1 {
	
	// 類別變數 with static 自帶初值
	static int myInt = 666;
	static Integer staticVar;
	// 物件變數 with non-static 自帶初值
	int objectVar;
	
	// 類別方法，可直接存取類別變數，new以存取物件變數
	public static void main(String[] args) {
		
//		int myInt = myInt; -- 兩個myInt都是方法內的區域變數, 需給初值
		
		// 方法內的區域變數(Stack)名稱可與類別變數及物件變數相同,調用時以區域變數自身優先
		int staticVar = 199;
		int objectVar = 299;
		System.out.println(staticVar + objectVar);
		
		// 『類別變數』直接存取
		System.out.println(myInt);
		
		// 完整的寫法也可以
		System.out.println(Class_1_1.myInt);
		
		// new類別以存取同名『物件變數』
		Class_1_1 ob1 = new Class_1_1();
		System.out.println(ob1.objectVar);
		// 調用同名類別變數
		System.out.println(Class_1_1.staticVar);
		
		// 『區域變數』, 方法內宣告的變數,生命週期只存在方法內,需給初值
		int localVar = 0;
		System.out.println(localVar);
		
		// 『區塊變數』, 方法內{}的區塊中宣告的變數.生命週期只存在區塊內,需給初值
		{
			int blockVar=100;
			System.out.println(blockVar);
			
			// 可以調用區域變數
			localVar = 200;
			System.out.println(localVar);
		}
		
	}
	
	// 物件方法
	void method() {
		
		// 直接存取類別變數
		System.out.println(myInt);
		
		// 直接存取物件變數
		System.out.println(objectVar);
		
		// 調用this表物件本身,但不可用於類別方法
		System.out.println(this.objectVar);
		
	}
	
}