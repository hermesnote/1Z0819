package chapter03;

import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;

public class Test3 {
	
	// 內部類別的權限不受限制
	public class InnerPublic {};
	protected class InnerProtected {};
	private class InnerPrivate {};

	public static void main(String[] args) {
		
		// 區域變數內宣告常數變數,一經宣告不可再改變
		final int a = 100;
//		a = 200;
		
	}
	
	// 物件方法
	void test() {
		// 方法內部宣告的類別 = 方法內部類別
		// 不可加上任何存取權限
		class InnerMethod {};
	}

}

interface Fly{
	public static final int speed = 500;
	public abstract void test();
}

//abstract class Dog{
//	abstract void test();
//}
//class BullDog extends Dog{
//
//	@Override
//	// 覆寫父類別Dog的抽象方法
//	void test() {
//		// TODO Auto-generated method stub
//	}
//}


/* access modifier = 存取權限
 * Which statement about access modifiers is correct?
 * A. An instance variable can be declared with the static modifier.
 * B. A local variable can be declared with the final modifier.
 * C. An abstract method can be declared with the private modifier.
 * D. An inner class cannot be declared with the public modifier.
 * E. An interface can be declared with the protected modifier.
 *
*/