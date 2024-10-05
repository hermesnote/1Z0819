package chapter06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		

//		// ArrayList add及remove
//		{
//			ArrayList a = new ArrayList();
//			a.add("1");
//			a.add("2");
//			a.add(3);
//			a.add(4);
//			System.out.println(a);
////			System.out.println(a.remove(3)); // 刪除 index 3 回傳 value
//			System.out.println(a.remove(new Integer(3))); // 刪除 Object 4 回傳 boolean
//			System.out.println(a);
//			a.add(4);
//			a.add(4);
//			a.add(4);
//			a.add(4);  // 資料可重覆
//			System.out.println(a); // 資料重覆長度改變
//		}
//		
//		// Set add及remove
//		{
//			HashSet a = new HashSet();
//			a.add("1");
//			a.add("2");
//			a.add(3);
//			a.add(4);
//			System.out.println(a);
//			System.out.println(a.remove(4)); // 刪除 Object 4 回傳 boolean
//			System.out.println(a);
//			a.add(3); // Set 資料不可重覆
//			System.out.println(a); // 資料重覆不會報錯
//			
//		}
		
//		// Tree自動排序, 自定義類別要實作 Comparable
//		{
//			TreeSet people = new TreeSet(Arrays.asList(new Person("Amy", 25), new Person("Mike", 15), new Person("Zoe", 11)));
//			System.out.println(people);
//		}
		
		// ArrayList List.copyOf()
		{
			ArrayList a = new ArrayList(); // a 為 new ArrayList 可增刪修
			a.add(1);
			a.add(2);
			a.add(3);
			a.add(4);
			List b = List.copyOf(a); // b 透過copyOf()方法複製 a, 為unmodifiable, 不可增刪修, 新增一個記憶體空間, a與b為不同物件
			List c = List.copyOf(b); // c 透過copyOf()方法複製 b, 同為unmodifiable, 不會新增記憶體空間, 將b記憶體位址指向給c, b與c為同物件
			System.out.println(a==b); // ==比較記憶體位置 false
			System.out.println(b==c); // true
		}

	}

}

class Person implements Comparable<Person>{
	int age;
	String name;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name = " + name + "]";
	}
	@Override
	public int compareTo(Person o) {
//		return this.age-o.age; // 年齡遞增
//		return -(this.age-o.age); // 年齡遞減
//		return o.age-this.age; // 年齡遞減
		
		return o.name.compareTo(this.name); // 姓名遞減
		
	}
}




