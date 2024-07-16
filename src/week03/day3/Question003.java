package week03.day3;

import java.util.Arrays;

/*3- int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654,
33, 32, 67, 2 }, { 189, 35, 56, 89, 8 } };
Yukarıdaki 2 boyutlu array'i tek boyutlu bir array olarak yazdıran metot.
*/
public class Question003 {
	public static void main(String[] args) {
		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654,
				33, 32, 67, 2 }, { 189, 35, 56, 89, 8 } };
		
		convert2dArrayTo1D(matris);
		
	}
	
	public static void convert2dArrayTo1D(int[][]matris){
		int length = matris.length * matris[0].length;
		int index=0;
		int[] oneDArray = new int[length];
		for (int i = 0; i < matris.length ; i++) {
			for (int j = 0; j <matris[i].length ; j++) {
				oneDArray[index] = matris[i][j] ;
				index++;
			}
		}
		System.out.println(Arrays.toString(oneDArray));
	}
	
}