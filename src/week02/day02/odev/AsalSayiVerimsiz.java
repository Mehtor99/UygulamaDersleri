package week02.day02.odev;

import java.util.Scanner;

public class AsalSayiVerimsiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Asal sayi sorgulamasi icin bir sayi giriniz: ");
		int number = sc.nextInt();
		sc.close();
		
		long startTime = System.nanoTime();
		
		if (number <= 1) {
			System.out.println("Girdiginiz " + number + " sayisi asal degildir.");
		}
		else if (number % 2 == 0 && number != 2) {
			System.out.println("Girdiginiz " + number + " sayisi asal degildir.");
		}
		else if (number == 2) {
			System.out.println("Girdiginiz " + number + " sayisi asaldir.");
		}
		else if (number < 0) {
			System.out.println("Girdiginiz " + number + " sayisi asal degildir.");
		}
		else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					System.out.println("Girdiginiz " + number + " sayisi asal degildir.");
					i = number;
				}
				else {
					System.out.println("Girdiginiz " + number + " sayisi asaldir.");
					i = number;
				}
			}
			
		}
		
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("Programin calisma suresi: "+duration +" nanosaniye");
		
	}
}