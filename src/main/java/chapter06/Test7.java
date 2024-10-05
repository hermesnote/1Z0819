package chapter06;

import java.util.ArrayList;
import java.util.List;

public class Test7 {

	public static void main(String[] args) {
		
		List<Integer> even = List.of(); // List.of() 方法產生的集合不可改變
//		List<Integer> even = new ArrayList<>();
		even.add(0, -1); // (key, value) 0:-1
		even.add(0, -2); // 後移 0:-2 1:-1
		even.add(0, -3); // 後移 0:-3 1:-2 2:-1
		System.out.println(even);
		
	}

}




/*
 * What is the output?
 * A. The compilation fails.
 * B. [-1, -2, -3]
 * C. [-3, -2, -1]
 * D. A runtime exception is thrown.
 * 
 */