package week02.day01;

import java.util.Scanner;

public class Question007 {
	 /*
    7- Dışarıdan girilen bir sayının faktoriyelini alalım.
     */
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Faktoriyelini hesaplamak istediginiz sayiyi giriniz: ");
		 int number = sc.nextInt();
		 sc.close();
		 int factorial =1;
		 for (int i=2; i<=number; i++){
			 factorial = factorial*i;
		 }
		 System.out.println("Girilen sayinin faktoriyeli: "+factorial);
		 
	 }
}