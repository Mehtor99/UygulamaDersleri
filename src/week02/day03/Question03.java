package week02.day03;

import java.util.Scanner;

public class Question03 {
	/*
	3- Girilen sayının mükemmel sayı olup olmadığını gösteren program.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		int number =  sc.nextInt();
		sc.close();
		int total = 0;
		
		for (int i = 1;i<=number/2;i++){
			if (number%i==0){
				total = total+i;
			}
		}
		if (total == number){
			System.out.println("Girdiginiz sayi mukemmel sayidir.");
		}else {
			System.out.println("Girdiginiz sayi mukemmel sayi degildir.");
		}
	}
}