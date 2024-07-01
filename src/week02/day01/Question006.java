package week02.day01;

import java.util.Scanner;

public class Question006 {
	 /*
    6- Dışarıdan 2 adet tam sayı değeri alalım.
    iki sayının toplamı çift ise true, değil ise false yazdıralım. Bu değerlerin bir de ortalamasını alalım ve yazdıralım.
     */
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Iki sayi giriniz:");
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int total = a+b;
		 sc.close();
		 double average =(double) (a+b)/2;
		 if (total%2==0){
			 System.out.println("true");
		 }else{
			 System.out.println("false");
		 }
		 System.out.println("Ortalama: "+average);
		 
		 
	 }
}