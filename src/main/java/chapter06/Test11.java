package chapter06;

import java.util.Set;
import java.util.TreeSet;

public class Test11 {

	public static void main(String[] args) {
		
		Set<Vehicle> vehicles = new TreeSet<>();
		vehicles.add(new Vehicle(10123, "Ford"));
		vehicles.add(new Vehicle(10124, "BMW"));
		System.out.println(vehicles);
		
	}

}

class Vehicle implements Comparable<Vehicle>{
	
	int vno;
	String name;
	public Vehicle(int vno, String name) {
		this.vno = vno;
		this.name = name;
	}
	
	public String toString() {
		return vno+":"+name;
	}

	@Override
	public int compareTo(Vehicle o) {
		// TODO Auto-generated method stub
		return this.vno-o.vno;
	}
	
}



/*
 * What is the result?
 * A. 10123:Ford 10124:BMW
 * B. 10124:BMW 10123:Ford
 * C. A compilation error occurs.
 * D. A ClasscastException is thrown at run time.
 * 
 */