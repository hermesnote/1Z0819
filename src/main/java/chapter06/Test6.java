package chapter06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test6 {
	
	static Map<String, String> map = new HashMap<>();
	static List<String> keys = new ArrayList<>(List.of("A","B","C","D"));
	static String[] values = {"one","two","three","four"};
	
	// 初始化區塊
	static {
		for(var i=0; i<keys.size(); i++) {
			map.put(keys.get(i), values[i]); // Map = [A:one, B:two, C:three, D:four]
		}
	}

	public static void main(String[] args) {
		
		keys.clear(); // 清空集合keys的值
		values = new String[0]; // values被重新new了size為0的array
		System.out.println("Map:"+map.size()+"Keys:"+keys.size()+"Values:"+values.length);
		
		// Map長度4, Keys被清空為0, Values被new了0
		
	}

}




/*
 * What is the result?
 * A. Map:0 Keys:0 Values:0
 * B. The compilation fails.
 * C. Map:4 Keys:4 Values:4
 * D. Map:4 Keys:0 Values:0
 * E. Map:0 Keys:4 Values:4
 * 
 */