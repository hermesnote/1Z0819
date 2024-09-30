package chapter03;

public interface Test14 {
	
	default void smaplingProcedure() {
		probeProcedure();
		System.out.println("Collect Sample");
		System.out.println("Leave Asteroid");
		System.out.println("Dock with main craft");
	}
	
	default void explosionProbeProcedure() {
		probeProcedure();
		System.out.println("Explode");
	}
	
	// C. 
	default void probeProcedure(){
		 System.out.println("Launch Probe");
		 System.out.println("Land on Asteroid");
	}

}


/*
 * Examine these requirement
 * （檢查這些要求）
 * Eliminate code duplication
 * （排除重複程式碼）
 * Keep constant the number of methods other classes may implement from this interface
 * （確保其它類別可以從此介面實現的方法數量不變=就只能實作題目的兩個方法,不能實作其它方法）
 * Which method can be added to meet these requirement
 * （哪些方法可以被增加來滿足這些要求）
 * 
 * A. 
 * private default void probeProcedure(){
 * 		System.out.println("Launch Probe");
 * 		System.out.println("Land on Asteroid");
 * }
 * 
 * B. 
 * static void probeProcedure(){
 * 		System.out.println("Launch Probe");
 * 		System.out.println("Land on Asteroid");
 * }
 * 
 * C. 
 * private void probeProcedure(){
 * 		System.out.println("Launch Probe");
 * 		System.out.println("Land on Asteroid");
 * }
 * 
 * D. 
 * default void probeProcedure(){
 * 		System.out.println("Launch Probe");
 * 		System.out.println("Land on Asteroid");
 * }
 * 
 * 
 */