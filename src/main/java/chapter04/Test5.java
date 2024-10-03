package chapter04;

public class Test5 {
	
	class L extends Exception {}
	class M extends L {}
	class N extends RuntimeException {} // RuntimeExcetion是unchecked exception,不需try-catch編譯也會過
	
	public void p() throws L { // L繼承Exception,是M的父類別
		throw new M();
	}
	
	public void q() throws N {
		throw new N(); // RuntimeException的所有子類都是unchecked exception編譯會過
	}

	public static void main(String[] args) {
		
		try {
			Test5 t = new Test5();
			t.p(); // 丟出父類L,子類M接不住,編譯報錯
			t.q();
		} catch(M e) {  // line 1:條件中有繼承關係的選項編譯都會報錯,只有(L e)會過
			System.out.println("catch");
		}

	}

}



/*
 *  多重區塊內的條件不可有繼承關係（L為M的父類，彼此繼承）
 * What change on line 1 will make this code compile? 
 * A. Add catch(L N e).
 * B. Add catch(L|M N e).
 * C. Add catch(L e).
 * D. Add catch(N|L|M e).
 * E. Add catch(M|L e).
 * 
*/