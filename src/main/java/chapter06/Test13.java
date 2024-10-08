package chapter06;

import java.util.ArrayList;
import java.util.List;

public class Test13 {

	public static void main(String[] args) {
		List objs = new ArrayList();
		Contract c1 = new Super();
		Contract c2 = new Sub();  // line n1
		Super s1 = new Sub();
		
		objs.add(c1);
		objs.add(c2);
		objs.add(s1);  // line n2
		
		for(Object itm:objs) {
			System.out.println(itm.getClass().getName());
		}		
	}

}

interface Contract{}
class Super implements Contract{}
class Sub extends Super{}



/*
 * What is the result?
 * A. Super Sub Super
 * B. Contract Contract Super
 * C. Compilation fails at line n1
 * D. Compilation fails at line n2
 * 
 */