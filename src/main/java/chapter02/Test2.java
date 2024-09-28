package chapter02;

public class Test2 {
	
	public static void main(String[] args) {
		
		int x = 0;
		while(x<10) {
			System.out.println(x++);
		}
		System.out.println("↑1↑1↑1↑1↑1↑1↑1↑1↑1↑1");
		
		int b = 0;
		for(;b<10;) {
			System.out.println(++b);
		}
		System.out.println("↑2↑2↑2↑2↑2↑2↑2↑2↑2↑2");

		// a須初始化
//		for(a;a<10;a++) {
//			System.out.println(a);
//		}
		
		for(int d=0;d<10;) {
			System.out.println(d);
			++d;
		}
		System.out.println("↑3↑3↑3↑3↑3↑3↑3↑3↑3↑3");
		
		
		for(int c=0;;c++) { // 條件式下移if判斷, break跳出程式
			System.out.println(c);
			if(c==0) {
				break;
			}
		}
		System.out.println("↑4↑4↑4↑4↑4↑4↑4↑4↑4↑4");
		
	}

}
