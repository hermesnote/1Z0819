package chapter03;

import java.nio.file.Path;
import java.util.Collection;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface A{
	public Iterable a();
}

interface B extends A {
	public Collection a();
}

interface C extends A {
	public Path a();
}

//interface D extends B,C {} // C的Path並不與Iterable有小於或等於的繼承關係




/*
 * interface A {
 * public Iterable a();
 * }
 * 
 * interface B extends A{
 * public Collection a();
 * }
 * 
 * interface C extends A {
 * public Path a();
 * }
 * 
 * Interface D extends B,C {}
 * 
 * Why does D cause a compilation error?
 * 
 * A. D inherits A only from C.
 * B. D inherits A from B and C but the return types are incompatible.
 * C. D extends more than one interface.
 * D. D does not define any method.
*/
