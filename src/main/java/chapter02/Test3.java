package chapter02;

public class Test3 {

	public static void main(String[] args) {
		
		int x = 0;
		do {
			x++;
			if(x == 1) {
				continue;
			}
			System.out.println(x);
		} while (x < 1);
		
	}

}
