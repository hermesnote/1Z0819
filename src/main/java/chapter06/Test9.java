package chapter06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test9 {

	public static void main(String[] args) {
		
		List<Book> books = Arrays.asList(new Book("Beginning with Java", 2), new Book("A Guide to Java Tour", 3));
		// [["Beginning with Java", 2],["A Guide to Java Tour", 3]] by asList with "fixed"
		Collections.sort(books, new Book()); // 自然排序books:遞增, 自定排序new Book():遞減
		System.out.println(books);
		
	}

}

class Book implements Comparator<Book>{
	
	String name;
	double price;
	public Book() {
		
	}
	
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public int compare(Book b1, Book b2) {
		return b1.name.compareTo(b2.name); // name排序:b1 to b2 遞增, b2 to b1 遞減
	}
	
	public String toString() {
		return name+":"+price;
	}
	
}


/*
 * What is the result?
 * A. [A Guide to Java Tour:3.0, Beginning with Java:2.0]
 * B. [Beginning with Java:2.0, A Guide to Java Tour:3.0]
 * C. A compilation error occurs because thr Book class does not override the abstract method compareTo().
 * D. An Exception is thrown at run time.
 * 
 */