package week02.day02.odev;

import java.util.Scanner;

public class AsalSayiOrta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Asal sayi sorgulamasi icin bir sayi giriniz: ");
		int number = sc.nextInt();
		sc.close();
		
		long startTime = System.nanoTime();
		
		boolean isItPrime = true;
		
		if (number <= 1 || (number % 2 == 0 && number != 2) || number < 0) {
			isItPrime = false;
		}
		else if (number == 2) {
			isItPrime = true;
		}
		
		else {
			for (int i = 3; i < (number / 2); i += 2) {
				if (number % i == 0) {
					isItPrime = false;
					i = number;
				}
				else {
					i = number;
				}
			}
		}
		
		if (isItPrime) {
			System.out.println("Girdiginiz " + number + " sayisi asaldir.");
		}
		else {
			System.out.println("Girdiginiz " + number + " sayisi asal degildir.");
		}
		
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("Programin calisma suresi: "+duration+" nanosaniye");
		
	}
}