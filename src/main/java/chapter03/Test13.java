package chapter03;

public class Test13 {

	public static void main(String[] args) {
		
		// 子類別new自己
		AnotherClass ac = new AnotherClass();
		// 左父右子 - 多型
		SomeClass sc = new AnotherClass();
		// ac資料型態是AnotherClass子類，sc資料型態是SomeClass父類，不符合左父右子
//		ac = sc;
		sc = ac;
		sc.methodA();
		ac.methodA();
		
	}

}

// 父類
class SomeClass {
	public void methodA() {
//	public static void methodA() {
		System.out.println("SomeClass#methodA()");
	}
}

// 子類
class AnotherClass extends SomeClass {
	public void methodA() {
//	public static void methodA() {
		System.out.println("AnoyherClass#methodA()");
	}
}


/* 多型程式檢查步驟：
 * 1. 左父右子
 * 2. 子類存取權限大於等於父類
 * 3. return type 須同（基礎型別）或子類小於等於父類（參考型別）
 * 4. 方法名稱一樣
 */


/*
 * What is the result?
 *
 * A. A ClassCastException is throw at runtime.
 * B. AnotherClass#methodA()AnotherClass#methodA()
 * C. The compilation fails.
 * D. SomeClass#methodA()AnotherClass#methodA()
 * E. AnotherClass#methodA()SomeClass#methodA()
 * F. SomeClass#methodA()SomeClass#methodA()
*/