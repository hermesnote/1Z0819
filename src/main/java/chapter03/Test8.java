package chapter03;

public class Test8 {
	
	// 一般內部類別, 當成物件變數, 在類別方法要new一個類別物件才能調用
	// 若有static的內部類別相當類別變數, 在類別方法直接調用即可
	class Student{ // line 1
		String classname;
		Student(String classname){ // line 2
			this.classname = classname;
		}
	}

	public static void main(String[] args) {
		
		// 方法內使用var推定宣告區域變數是可行的
		var student = new Student("Biology"); // line 3
		
		// Student宣告為一般內部類別,視為物件變數,要new類別物件Test8才能使用
		var student = new Test8().new Student("Biology");
		
	}

}


/*
 * 
 * Which two independent changes will make the Main class compile? (choose two)
 * A. Move the entire Student class declaration to a separate Java file, Student.java 
 * B. Change line 2 to public Student(String classname).
 * C. Change line 1 to public class Student{.
 * D. Change line 3 to Student student = new Student("Biology");.
 * E. Change line 1 to static class Student{.
 *
*/


/*
 * 把 Student 抽出做為獨立的外部類別 or 在內部類別Student加上static成為類別變數即可在類別方法直接調用
 *
*/