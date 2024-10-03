package chapter04;

//public interface Test8 { // Line 1
public abstract class Test8 {
	
//	public void checkValue(Object value) throws IllegalArgumentException;  // Line 2
	public abstract void checkValue(Object value) throws IllegalArgumentException;
	
	public boolean isValueANumber(Object val) {
		if(val instanceof Number) {
			return true;
		} else {
			try {
				Double.parseDouble(val.toString());
				return true;
			} catch(NumberFormatException ex) {
				return false;
			}
		}
	}

}


/*
 * Which two changes need to be made to make this class compile?
 * A. Change Line 1 to a class: public class API{}
 * B. Change Line 1 to extends java.lang.AutoCloseable: public interface API extends AutoCloseable{
 * C. Change Line 2 to an abstract method:
 *    public abstract void checkValue(Object value) throws IllegalArgumentException;
 * D. Change Line 2 access modifier to protected.
 * E. Change Line 1 to an abstract class: public abstract class API
 *  
 */