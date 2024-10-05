package chapter06;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test4 {

	public static void main(String[] args) {
		
		List<String> list1 = new LinkedList<String>(); // 有序可重覆
		Set<String> hs1 = new HashSet<String>(); // 無序不可重覆
		String[] v = {"a", "b", "c", "b", "a"};
		
		for(String s:v) {
			list1.add(s); // a b c b a
			hs1.add(s); // a b c
		}
		
		// 注意先印的是hs1不是list1
		System.out.println(hs1.size()+" "+list1.size()+" "); // 3 5
		
		HashSet hs2 = new HashSet(list1); // HashSet不可重覆, a b c
		LinkedList list2 = new LinkedList(hs1); // a b c
		
		System.out.println(hs2.size()+" "+list2.size()+" "); // 3 3
		
	}

}




/*
 * What is the result?
 * A. 3 5 3 3
 * B. 3 3 3 3
 * C. 3 5 3 5
 * D. 5 5 3 3
 * 
 */