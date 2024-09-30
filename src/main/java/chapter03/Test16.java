package chapter03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test16 {

	public static void main(String[] args) {
		Foo f1 = new Foo(); // 自調用
		Foo f2 = new Bar(); // 多型
		Bar b1 = new Bar(); // 自調用
		List<String> li = new ArrayList<>();
		b1.foo(li); // Bar自調用, 相同List, Hola Mundo! - H 
		f2.foo(li); // 多型, Overirde父類同參Collection, Hello World! - C
		f1.foo(li); // Foo自調用, Bonjour le monde! - B
	}

}

class Foo {
	public void foo(Collection arg) {
		System.out.println("Bonjour le monde!");
	}
}

class Bar extends Foo {
	public void foo(Collection arg) {
		System.out.println("Hello World!");
	}
	public void foo(List arg) {
		System.out.println("Hola Mundo!");
	}
}

/*
 *  Which three are correct? ( choose three.)
 *  A. b1.foo(li) prints Hello World!
 *  B. f1.foo(li) prints Bonjour le monde!
 *  C. f2.foo(li) prints Hello World!
 *  D. f1.foo(li) prints Hola Mundo!
 *  E. b1.foo(li) prints Bonjour le monde!
 *  F. f2.foo(li) prints Hola Mundo!
 *  G. f2.foo(li) prints Bonjour le monde!
 *  H. b1.foo(li) prints Hola Mundo! 
 *  
 */

