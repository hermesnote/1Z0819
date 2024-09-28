package chapter02;

public class Test4 {

	public static void main(String[] args) {
				
		for(int i=0;i<args.length;i++ ) {
			System.out.println(i + ")." + args[i]);
			switch (args[i]) {
			case "one" :
				continue;
			case "two" :
				i--;
				continue;
			default :
				break;
			}
		}
		
	}

}
