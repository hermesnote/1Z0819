package chapter03;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/*
 * What is the result?
 * 
 * package test.t1;
 * public calss A {
 * public int x = 42; //line 1
 * protected A(){}
 * }
 * 
 * package test.t2;
 * import test.t1.A;
 * public class B extends A {
 * int x = 17; // line 2
 * public B() {super();} // line 3
 * }
 * 
 * package test;
 * import test.t1.A;
 * import test.t2.B;
 * public class Tester{
 * public static main(String[] args){
 * A obj = new B();
 * System.out.println(obj.x);
 * }
 * }
 *
 * A. 42
 * B. The compilation fails due to an error in line 4.
 * C. 17
 * D. The compilation fails due to an error in line 3.
 * E. The compilation fails due to an error in line 2.
 * F. The compilation fails due to an error in line 1.
 * G. The compilation fails due to an error in line 5.
 *
 *
*/