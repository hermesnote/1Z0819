package chapter02;

public class Test5 {

	public static void main(String[] args) {
		
		char letter = 'b';
		int i = 0;
		switch (letter) {
		
		case 'a' :
			i++;
			break;
		case 'b' :
			i++;
		case 'c'|'d' :
			i++;
		case 'e' :
			i++;
			break;
		case 'f' :
			i++;
			break;
		default :
			System.out.println(letter);
		}
		System.out.println(i);
		
	}

}
