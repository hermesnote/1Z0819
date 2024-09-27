package chapter01;

public class Test3 {
	
	public static void main(String[] args) {
	
		if(args.length >= 3) {
			System.out.println(args[0]+args[1]+args[2]);
		} else {
			System.out.println("參數不足!");
		}
	
	}
	
	String[] testArgs = {"Hello World", "Hello", "World"};
	
}
