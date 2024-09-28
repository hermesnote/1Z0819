package chapter03;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@FunctionalInterface
	/*
	 * Functional Interface : 函數式介面
	 * 一個interface裡面只能有一個抽象方法（abstract method）
	 * 但不包括有本體的非抽象方法
	 * 非一定要加@Annotation，無關編譯, 加了會報錯
	 */
	interface Pet{
		
		int age = 15;
		void run(); // 唯一的抽象方法
		
		// 方法加上以下三個修飾字則不是抽象方法須有方法本體
		default void a() {}; // default
		static void b() {}; // static
		private void c() {}; // private 子類看不到無法Override
		
	}

}


/*
 * Which statement about a functional interface is true?
 * A. It must be defined with the public access modifier.
 * B. It must be annotated with @FunctionalInterface.
 * C. It is declared with a single abstract method.
 * D. It is declared with a single default method.
 * E. It cannot have any private methods and static methods.
*/