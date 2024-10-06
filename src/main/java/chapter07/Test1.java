package chapter07;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	
	 List<? super Short> list1 = new ArrayList<Number>();
	 List<? super Number> list2 = new ArrayList<Integer>();
	 List<? extends Number> list3 = new ArrayList<Byte>();
	 List<? extends Number> list4 = new ArrayList<Object>();
	 List<? super Float> list5 = new ArrayList<Double>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}




/*
 * Which two statements independently compile? (Choose two)
 * A. List<? super Short> list = new ArrayList<Number>();
 * B. List<? super Number> list = new ArrayList<Integer>();
 * C. List<? extends Number> list = new ArrayList<Byte>();
 * D. List<? extends Number> list = new ArrayList<Object>();
 * E. List<? super Float> list = new ArrayList<Double>();
 * 
 */