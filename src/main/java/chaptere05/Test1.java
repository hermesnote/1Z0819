package chaptere05;

public class Test1 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder(5);
		String s = "";
		
		if(sb.equals(s)) {
			System.out.println("Match 1");
		} else if (sb.toString().equals(s.toString())) {
			System.out.println("Match 2");
		} else {
			System.out.println("No Match");
		}
		
	}

}




/*
 * What is the result?
 * A. Match 1
 * B. No Match
 * C. Match 2
 * D. A NullPointerException is thrown at runtime.
 * 
 */