package chaptere05;

public class Test4 {

	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("ABCD");
		// line 1
		s.replace(s.indexOf("B"), s.indexOf("C"), "Q");
		System.out.println(s);
		
	}

}

/*
 *  Which statement on line 1 can output "AQCD"
 *  A. s.replace(s.indexOf("A"), s.indexOf("C"), "Q");
 *  B. s.replace(s.indexOf("B"), s.indexOf("C"), "Q");
 *  C. s.replace(s.indexOf("B"), s.indexOf("B"), "Q");
 *  D. s.replace(s.indexOf("A"), s.indexOf("B"), "Q");
 */
