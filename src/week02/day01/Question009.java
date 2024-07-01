package week02.day01;

import java.util.Scanner;

public class Question009 {
	/*
	9) 1 den başlayarak gelen bütün sayıları toplayalım. Toplamımız 50'yi geçene kadar çalışsın.
	 en son toplamı yazdıralım ve bu döngünün kaç kere çalıştığını yazdıralım.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 0, total=0;
		while(total<=50){
			System.out.println("Toplama dahil etmek istediginiz sayiyi giriniz: ");
			int number = sc.nextInt();
			total = total+number;
			counter += 1;
		}
		sc.close();
		System.out.println("Toplam: "+total+"  Dongu "+counter+" kere calisti.");
	}
}