package chaptere05;

public class Test3 {

	public static void main(String[] args) {
		
		String[][] arr = {{"Red", "White"},{"Black"},{"Blue", "Yellow", "Green", "Violet"}};
		for( int row=0; row<arr.length; row++ ) {
			int column = 0;
			for( ;column<arr[row].length; column++ ) {
				System.out.println("["+row+","+column+"]="+arr[row][column]);
			}
		}
		
	}

}


/*
 * What is the result?
 * A. [0,0]=Red [0,1]=White [1,0]=Black [2,0]=Yellow [2,1]=Green [3,0]=Violet
 * B. [0,0]=Red [1,0]=Black [2,0]=Blue
 * C. java.lang.ArrayIndexOutOfBoundsException thrown
 * D. [0,0]=Red [0,1]=White [1,0]=Black [2,0]=Blue [2,1]=Yellow [2,2]=Green [2,3]=Violet
 * 
 * 
 */