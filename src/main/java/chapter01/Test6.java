package chapter01;

public class Test6 {

	public static void main(String[] args) {
		
		int x = 12_34; // _為JDK7出現的裝飾符不會印出
		short sh = (short)'A'; // 賦予A的ASCII碼, 強制轉換 short to short
//		String contact# = "(+2)(999)(232)"; 變數不可#
//		boolean true = (4==4); true為boolean關鍵保留字不可使用作變數名稱, 大寫True或TRUE可使用
//		float x = 1.99; float需於數字尾+F或轉型, 否則默認double
		int[][] e = {{1, 1},{2,2}};
//		byte b = 10;char c = b; 不可直接將byte轉char
		byte b = 65;
		char c = (char)b;
		System.out.println(c);

	}

}
