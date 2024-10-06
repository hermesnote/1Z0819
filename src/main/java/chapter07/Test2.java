package chapter07;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Test2 extends Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Foo{
	public List<Number> foo(Set<CharSequnce> m){
		return new ArrayList<>();
	}
}

class Bar extends Foo{
	@Override
//	 public List<Integer> foo(Set<CharSequence> m) {return null;}
//	 public ArrayList<Number> foo(Set<CharSequence> m) {return null;}
//	 public List<Integer> foo(TreeSet<String> m) {return null;}
//	 public List<Integer> foo(Set<String> m) {return null;}
//	 public List<Object> foo(Set<CharSequnce> m) {return null;}
//	 public ArrayList<Integer> foo(Set<String> m) {return null;}
}


/*
 * Which two statements can be added at line 1 in Bar to successfully compile it? (Choose Two)
 * A. public List<Integer> foo(Set<CharSequence> m) {...}
 * B.public ArrayList<Number> foo(Set<CharSequence> m) {...}
 * C. public List<Integer> foo(TreeSet<String> m) {...}
 * D. public List<Integer> foo(Set<String> m) {...}
 * E. public List<Object> foo(Set<CharSequnce> m) {...}
 * F. public ArrayList<Integer> foo(Set<String> m) {...}
 * 
 */

