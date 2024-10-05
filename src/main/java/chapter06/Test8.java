package chapter06;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Test8 {

	public static void main(String[] args) {
		
		Map<Integer, String> books = new TreeMap<>(); // TreeMap ordering of its Key, 

		// 自定義排序 調用 comparator
//		Map<Integer, String> books = new TreeMap<>(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o2-o1; // 遞減排序
//			}
//			
//		});
		
		// Lambda
//		Map<Integer, String> books = new TreeMap<>((Integer o1,Integer o2)->{return o2-o1;});
		// More Lambda
//		Map<Integer, String> books = new TreeMap<>((o1,o2)->o2-o1);
		books.put(1007, "A");
		books.put(1002, "C");
		books.put(1001, "B");
		books.put(1003, "B");
		System.out.println(books);
		
	}

}




/*
 * What is the result?
 * A. {1007=A, 1002=C, 1001=B, 1003=B}
 * B. {1001=B, 1002=C, 1003=B, 1007=A}
 * C. {1002=C, 1003=B, 1007=A}
 * D. {1007=A, 1001=B, 1003=B, 1002=C}
 * 
 */