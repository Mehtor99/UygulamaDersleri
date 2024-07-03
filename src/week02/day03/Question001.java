package week02.day03;

import java.util.Scanner;

public class Question001 {
	/*
	- Kullanıcıdan 1'den 7'ye kadar bir sayı isteyelim. Bu sayıya denk gelen haftanın gününü çıktı olarak verelim.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1-7 arasi bir sayi giriniz: ");
		int number = sc.nextInt();
		
		switch (number){
			case 1 :
				System.out.println("pazartesi");
				break;
			case 2 :
				System.out.println("sali");
				break;
			case 3 :
				System.out.println("carsamba");
				break;
			case 4 :
				System.out.println("persembe");
				break;
			case 5 :
				System.out.println("cuma");
				break;
			case 6 :
				System.out.println("cumartesi");
				break;
			case 7 :
				System.out.println("pazar");
				break;
			default:
				System.out.println("Lutfen 1-7 arasinda bir sayi giriniz.");
		}
	}
}