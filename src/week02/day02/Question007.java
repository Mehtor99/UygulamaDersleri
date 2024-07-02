package week02.day02;

import java.util.Scanner;

public class Question007 {
	/*
   7- Girilen sayının 5'in kuvveti olup olmadığını bulan program.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		int number = sc.nextInt();
		int tempNumber = number;
		boolean control = true;
		int power=0;
		
		while (control){
			if (tempNumber%5==0){
				tempNumber/=5;
				power+=1;
			}
			else if (tempNumber==1) {
				break;
			}
			else{
				control = false;
			}
		}
		if(control){
			System.out.println("Girdiginiz "+number+" sayisi 5'in "+power+".kuvvetidir.");
		}else {
			System.out.println("Girdiginiz "+number+ " sayisi 5'in kuvveti degildir." );
		}
	
	}
}