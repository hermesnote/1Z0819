package chapter05;

public class Test5 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder(5); // index 0 1 2 3 4 5 最大值 5
		sb.append("HOWDY"); // HOWDY
		System.out.println(sb);
		sb.insert(0, ' '); // _HOWDY
		System.out.println(sb);
		sb.replace(2, 5, "LL"); // 234 -> _HLL_Y -> _HLLY
		System.out.println(sb);
		sb.insert(6, "COW"); // StringBuilder index最大值5, 無法插入6, 報錯 "Range [6, 5) out of bounds for length 5"
		System.out.println(sb);
		sb.delete(2, 7);
		System.out.println(sb);
		System.out.println(sb.length());
		
	}

}


/*
 * What is the result?
 * A. 5
 * B. 3
 * C. An exception is thrown at runtime.
 * D. 4
 * 
 */