package week02.day01;

import java.util.Scanner;

public class Question010 {
	/*
	10) Girilen sayının basamakları toplamını ekrana yazdıralım.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Basamaklari toplamini yazdirmak istediğiniz sayiyi giriniz: ");
		int number = sc.nextInt();
		sc.close();
		int digit = 0, total = 0;
		while (number != 0) {
			digit = number % 10;
			number = number / 10;
			total = total + digit;
		}
		System.out.println("Girilen sayinin basasmaklari toplami: " + total);
	}
}