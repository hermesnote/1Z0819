package chapter06;

import java.util.ArrayList;

public class Test5 {

	public static void main(String[] args) {
		
		var data = new ArrayList();
		data.add("Peter"); // ["Peter"]
		data.add(30); // ["Peter", 30]
		data.add("Market Road"); // ["Peter", 30, "Market Road"]
		data.add(1, 25);  // ["Peter", 25, "Market Road"]
		data.remove(2); // 移除 index 2 : "Market Road"
		// List的 remove 方法內, 若整數會先調用索引值, 並return值, 若為物件內容則return boolean
		data.set(3, 1000L); // 沒有index 3 超出索引值
		System.out.println(data);
		
	}

}




/*
 * What is the output?
 * A. [Market Road, 1000]
 * B. [Peter, 30, Market Road]
 * C. [Peter, 25, null, 1000]
 * D. An exception is thrown at run time.
 * 
 */