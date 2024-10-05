package chaptere05;

public class StringTest {

	public static void main(String[] args) {
		
		{
			// String, immutable不可變, concat連結(+), String pool, override equals
			String s = "hello";
			s.concat(" java");
//			s = s.concat(" java");
//			s = s+" Java";
			System.out.println(s);
		}
		
		
		{
			// StringBuilder, mutable可變, append連結, non-String pool
			StringBuilder b = new StringBuilder("Hello");
			b.append(" Java");
			System.out.println(b);
		}
		
		{
			String a = "Java"; // String存在heap的String pool
			String b = "Java"; // String pool會先去找有沒有內容一樣的記憶體位置, 若有就直接指向
			System.out.println(a==b); // true
			System.out.println(a.equals(b)); // true
		}
		
		
		{
			String a = new String("Java"); // new必會在heap產生一塊新的記憶體空間
			String b = new String("Java"); // 即使同內容也是產生另一塊新的記憶體空間
			System.out.println(a==b); // 判斷記憶體位置 false
			System.out.println(a.equals(b)); // 判斷內容 true
		}
		
		{
			StringBuilder a = new StringBuilder("Java");
			StringBuilder b = new StringBuilder("Java");
			System.out.println(a==b);  // false
			System.out.println(a.equals(b));  //false ※ StringBuilder的equals一樣調用父類Object equals, 與==同
			System.out.println(a.toString().equals(b.toString())); // true 物件轉型別為String就可以equals比對內容
		}
		
		{
			String a = "java";
			a = a.substring(2);
			System.out.println(a);
		}
		
		{
			StringBuilder a = new StringBuilder("java");
//			String b;
//			a.substring(2); // StringBuilder的substring方法return的是String的類別物件
//			b = a.substring(2); // StringBuilder的return值也是String而不是StringBuilder
			System.out.println(a);
//			System.out.println(b);
		}
		

	}

}
