package week03.day4;

import java.util.Scanner;

/*
3- Kullanici disaridan bir sayi girecek.

Ornek girdi = 10;
Sirasiyla;
1- 10 + 50
2- (10+50) * 30
3- ((10+50)*30) -40
4- (((10+50)*30) -40) / 20
islemlerini yaptiracagiz.

Bu islemleri tek bir satirda, metotlara, diger metotlari parametre olarak gecerek gerceklestirelim.
 */
public class Question003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = sc.nextInt();
		
		dividebytwenty(subtractForty(multiplyByThirty(addFifty(num))));
		
		
	}
	
	private static void dividebytwenty(int i) {
		double num = (double)i;
		System.out.println("Result: "+((double)i/20));
	}
	
	private static int subtractForty(int i) {
		return i-40;
	}
	
	private static int multiplyByThirty(int i) {
		return i*30;
	}
	
	private static int addFifty(int num) {
		return num+50;
	}
	
}