package chapter06;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList ls1 = new ArrayList(); // ArrayList 生成的集合為 modifiable
		ls1.add(1);
		ls1.add(2);
		ls1.add(3);
//		System.out.println(ls1);
		List copy1 = List.copyOf(ls1); // copyOf()方法 來源為可修改 產生的為不可修改
		System.out.println(ls1 == copy1);
		System.out.println(" ");
		List<Integer> ls2 = List.of(1,2,3,4,5); // List.of() 生成的集合為 unmodifiable
//		System.out.println(ls2);
		List<Integer> copy2 = List.copyOf(ls2); // copyOf()方法 來源為不可修改 產生的為不可修改 不會產生新的記憶體
		System.out.println(ls2==copy2);
		
	}

}



/*
 * What is the result?
 * A. true false
 * B. false false
 * C. true true
 * D. false true
 * E. An exception is thrown at run time.
 * 
 */