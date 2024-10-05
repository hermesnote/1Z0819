package chapter06;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		// 迭代過程不允許改變集合內容, 否則拋出例外
		Iterator<Integer> itr = a1.iterator();
		while(itr.hasNext()) {
			if(itr.next()==2) {
				a1.remove(2); // 迭代器內不尤許更改內容
				System.out.println(itr.next());
			}
		}
		
	}

}




/*
 * A. 1 2 followed by an exception.
 * B. A ConcurrentModificationException is thrown at run time.
 * C. 1 2 3 4
 * D. 1 2 3 followed by an exception.
 * 
 */