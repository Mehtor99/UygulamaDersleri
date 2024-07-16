package week03.day2;
/*
9- 2 Boyutlu Array'de çarpım tablosunu yazdıralım.
 */
public class Question009 {
	public static void main(String[] args) {
		String[][] mDArr = new String[10][10];
		
		for (int i = 0; i < mDArr.length ; i++) {
			for (int j = 0; j <mDArr[i].length ; j++) {
				System.out.println(mDArr[i][j] = (i+1)+" x "+(j+1)+" = "+(i+1)*(j+1));
			}
			System.out.println();
		}
		
	}
}