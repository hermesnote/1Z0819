package chapter01;

public class Test4 {
	
	// 物件變數 in Heap - 各自維護
	private int x;
	// 類別變數 in Global - 共同維護
	private static int y;

	// 類別方法
	public static void main(String[] args) {
		
		Test4 t1 = new Test4();
		t1.x = 2;
		Test4.y = 3;
		Test4 t2 = new Test4();
		t2.x = 4;
		t2.y = 5;
		System.out.println(t1.x + "," + t1.y);
		System.out.println(t2.x + "," + Test4.y);
		System.out.println(t2.x + "," + t1.y);
				
	}

}
