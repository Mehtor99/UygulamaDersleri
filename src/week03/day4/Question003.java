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
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number : ");
		int number = scanner.nextInt();
		
		double result = divideByTwenty(minusForty(multiplyByThird(addFiftyToNumber(number))));
		
		System.out.println(result);
	}
	
	private static double divideByTwenty(int number) {
		return  (double) number/20;
	}
	
	private static int minusForty(int number) {
		return number-40;
	}
	
	private static int multiplyByThird(int number) {
		return number*30;
	}
	
	private static int addFiftyToNumber(int number) {
		return number+50;
	}
}