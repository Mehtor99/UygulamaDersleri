package week03.day2;

import javax.swing.*;

/*
7- Dizide 13 sayısına denk gelene kadar devam edelim. 13 sayısı bulunduktan sonra ondan bir
 sonraki gelen sayı 13 değil ise 13'den sonra gelen sayıyı toplama ekleyelim.
-> 1, 13, 13, 13, 5, 13
 */
public class Question007 {
	public static void main(String[] args) {
	int[] arr = new int[]{1, 13, 13, 13, 5,13};
	int total =0;
		for (int i = 0; i <arr.length-1 ; i++) {
			if (arr[i]==13  &&  arr[i+1]!=13){
				total+=arr[i+1];
			}
		}
		System.out.println("total: "+total);
	}
}