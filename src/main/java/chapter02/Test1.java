package chapter02;
import java.util.ArrayList;

public class Test1 {
	
	// JDK10出現var區域變數類型推定宣告需給初值, 否則無法推定
	// 不可用於成員變數與方法參數及回傳值
//	var employee = new ArrayList<Employee>();  // 類別內,方法外 = 物件變數, 需指定型別不可推定宣告
	public var display() {
		
		var a = 100;
		var b = 100.1;
		var c = "Hello World";
		var employee = new Employee();
		var offices = new ArrayList();
		offices.add("Chicago");
		offices.add("Bangalore");
		for(var office : offices) {
			System.out.println("Employee Location : " + office);
		}
		
		// var陣列宣告注意事項 = 只須給變數名稱及值, 不須宣告型別
		// var[] numbers = new int[5];
		// 或 var numers[] = new int[5]; 都不對
		
		// 應用：
		var numbers = new int[5]; // 推定為int陣列, 宣告不加[]否則視為無效類型
		
	}

	public static void main(String[] args) {
		
		new Test1().display();

	}
	
	class Employee{
		
	}

}
