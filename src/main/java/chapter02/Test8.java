package chapter02;

public class Test8 {

	public static void main(String[] args) {
		
		int i = 10;
		do {
			for(int j=i/2; j>0; j--) {
				System.out.print(j + " ");
			}
			i -= 2;
		} while (i > 0);
		
	}

}
