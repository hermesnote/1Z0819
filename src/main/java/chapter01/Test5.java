package chapter01;

public class Test5 {
	
	public static void main(String[] args) {
		
		int x; // 區域變數未初始化
		int y = 5;
		
		if( y > 2 ) {
			x = ++y; // 賦值初始化
			y = x + 7;
		} else {
			x = ++y; // 若整個程式x都未被賦值則compile錯誤 
			y++;
		}
		
		// x必被初始化, 在if/else中都要
		System.out.println(x + " " + y);

	}

}
