package chapter03;

public class Test2 {

	public static void main(String[] args) {
		
		Person p = null;
		checkPerson(p); // 接不了return
//		p = checkPerson(p);;
		System.out.print(p);
		
		p = new Person("Mary");
		checkPerson(p); // 接不了return
//		p = checkPerson(p);
		System.out.print(p);
		
	}
	
	public static Person checkPerson(Person p) {
		if(p == null) {
			p = new Person("Joe");
		} else {
			p = null;
		}
		return p;
	}

}


class Person {
	
	private String name;
	// Person建構子
	public Person(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	
}