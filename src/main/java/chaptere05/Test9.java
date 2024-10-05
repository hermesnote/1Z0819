package chaptere05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test9 {

	public static void main(String[] args) {
		
		var lst = List.of(1, 2.0f, "4.0"); // List.of return an unmodifiable 不可修改集合
//		var lst = Arrays.asList(1, 2.0f, "4.0"); // asList return a fixed-size 固定大小集合，可修改內容，不可新增或刪除內容
		for( var c:lst ) {
			System.out.println("> "+c);
		}
		
		System.out.println();
		
		lst.add(2,3); // line n1 -- List.of已為固定fixed集合, 此處add編譯會過但執行不會過
		for(int c=0; c<lst.size(); c++) {
			display(lst.get(c));
		}
		
	}
	
//	public static void display(var c) { // line n2 -- var僅可為區域變數且須給初值
	public static void display(Object c) { // line n2
		System.out.println("> "+c);
	}

}


/*
 * What is the result?
 * A. An exception is thrown at line n1
 * B. A compile time error occurs at line n2
 * C. >1>@.0>4.0 換行 >1>2.0>4.0
 * D. A compile time error occurs at line n2 and An exception is thrown at line n1
 * 
 */