package chapter02;

public class Test6 {

	public static void main(String[] args) {
		
		for(var i = 0; i < 10; i++) {
			switch(i%5) {
			case 2 :
				i *= i;
				break;
			case 3 :
				i++;
				break;
			case 1 :
			case 4 :
				i++;
				continue;
			default :
				break;
			}
			System.out.println(i + "");
			i++;
		}
		
	}

} 


//i=0, print 0
//i=1, i=2, %=2,  i=2x2=4, print 4
//i=5, i=6, %=1(貫穿), i=7, continue回loop++, i=8, %=3, i=9, print 9
//i=10, i=11, 11<10不成立程式結束
