package week02.day02;

import java.util.Scanner;

public class Question003 {
	/*
   3- Klavyeden 0 girilinceye kadar sayı okumaya devam edelim.
   0 girildiğinde sayıların toplamını ve ortalamasını ekrana yazdıralım.
    */
	public static void main(String[] args) {
		int counter=0 ,number=-1,total=0 ;
		double average;
		Scanner sc = new Scanner(System.in);
		
		while(number!=0){
			System.out.print("sayi giriniz:");
		number = sc.nextInt();
		total = total+number;
		counter +=1;
		}
		average =(double) total/(counter-1);
		System.out.println("toplam: "+total+ "  ortalama: "+average);
	}
}