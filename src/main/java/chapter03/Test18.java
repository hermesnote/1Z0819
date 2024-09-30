package chapter03;

public class Test18 {

	public static void main(String[] args) {
		
		byte x = 12;
		short y = 13;
		new Test18().process(x+y);
		
	}
	
	public void process(byte v) {
		System.out.println("Byte value" + v);
	}
	
//	public void process(Integer v) {
//		System.out.println("Integer value" + v);
//	}
	
	public void process(Short v) {
		System.out.println("Short value" + v);
	}
	
	public void process(Object v) {
		System.out.println("Object value" + v);
	}

}
