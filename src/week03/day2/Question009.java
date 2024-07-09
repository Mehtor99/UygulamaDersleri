package week03.day2;
/*
9- 2 Boyutlu Array'de çarpım tablosunu yazdıralım.
 */
public class Question009 {
	public static void main(String[] args) {
		String[][] array = new String[10][10];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <array[0].length ; j++) {
				array[i][j] = (i+1)+ " x " + (j+1) + " = "+ (i+1)*(j+1);
				System.out.println(array[i][j]);
			}
			System.out.println();
		}
	}
}