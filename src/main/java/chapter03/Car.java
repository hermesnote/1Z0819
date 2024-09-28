package chapter03;

public class Car extends Automobile{

//	void wheels(int i) { // line 3
	@Override
	void wheels() { // Answer!
		System.out.println(4);
	}

	public static void main(String[] args) {

		Automobile ob = new Car(); // line 4
		ob.wheels();

	}

}

abstract class Automobile{  // line 1
	abstract void wheels();
}



/*
 *
 *
*/