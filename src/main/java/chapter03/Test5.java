package chapter03;

public class Test5 {

	public static void main(String[] args) {
		
		Y obj = new Y();
		System.out.println(obj);

	}

}

class X {};
final class Y extends X {

	@Override
	public String toString() {
		return "1Z0-819 ALL PASS!";
	}
	
};


/*
 * What is the result of compiling these two classes?
 * A. The compilation fails because there is no zero args constructor defined in class X.
 * B. The compilation fails because either X or class Y needs to implement the toString() method.
 * C. The compilation fails because a final class cannot extend another class.
 * D. The compilation succeeds. 
 *
*/