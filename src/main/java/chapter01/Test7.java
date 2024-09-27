package chapter01;

public class Test7 {

	public static void main(String[] args) {
		
		String s = "";
		
		if(Double.parseDouble("11.00f")>11) {
			s += 1;
		}
		
		if (1_7 == Integer.valueOf("17")) {
			s += 2;
		}
		
		if(1024 > 1023L) {
			s += 3;
		}
		
		System.out.println(s);

	}

}
