package chapter05;

import java.util.Arrays;

public class Test8 {

	public static void main(String[] args) {
		
		int[] secA = {2,4,6,8,10};
		int[] secB = {2,4,8,6,10};
		int res1 = Arrays.mismatch(secA, secB); // Arrays.mismatch(a,b) 比較兩陣列, 若兩陣列完全相同return -1, 若不同return第一個值不同的索引值
		int res2 = Arrays.compare(secA, secB); // Arrays.compare(a,b), 比較兩陣列, 若兩陣列內容完全相同, return 0, 若不同return第一個不同值並比較大小後, a>b return 0, a<b return -1, 與 String.compareTo相同
		System.out.println(res1+":"+res2);
		
	}

}




/*
 * What is the result?
 * A. -1:2
 * B. 2:-1
 * C. 2:3
 * D.3:0
 * 
 */