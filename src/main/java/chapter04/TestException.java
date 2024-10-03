package chapter04;

import java.io.IOException;
import java.util.function.IntBinaryOperator;

public class TestException {

	public static void main(String[] args) throws IOException {
		
		// StackOverfolowError
//		main(args);
		
		// OutOfMemoryError
//		int a[] = new int[1024*1024*1024];
		
//		throw new IOException();
		
		try {
			int a = 10/0;
		} catch(ArithmeticException e) { // 多catch從直系子類往直系父類增加
			System.out.println("不能除零");
//			return; // 程式結束，後＂除了finally＂都不會執行
		} catch(RuntimeException e) {
			//
		} finally {
			System.out.println("我一定會執行");
		}
		
		// try-catch 多重區段內不能有繼承關係之外的例外
		try {
			String str = "hello";
			System.out.println(str.charAt(11));
		} catch (ArithmeticException|IndexOutOfBoundsException|ClassCastException e) {
			System.out.println("多重區段寫法");
		} finally {
			//
		}
		
		System.out.println("主程式的方法");

	}

}





/* 
 * 
 * 
 */