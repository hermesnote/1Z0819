package chapter05;

public class Test2 {

	public static void main(String[] args) {
		
		String s1 = new String("ORACLE"); // String物件
		String s2 = "ORACLE"; // String pool
		String s3 = s1.intern(); // 字串的intern方法, 會先去String pool找有沒有現貨, 雖然是s1.intern, 但String pool有s2現貨, 就取用s2了
		
		System.out.println((s1==s2)+" "); // == 檢查記憶體位置
		System.out.println((s2==s3)+" ");
		System.out.println(s1==s3);
		
	}

}


/*
 * A. false true true
 * B. true false true
 * C. false false true
 * D. false true false
 * 
*/