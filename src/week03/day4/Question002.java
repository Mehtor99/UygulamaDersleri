package week03.day4;

import java.util.Scanner;

/*
2- Kullanicidan 2 ya da 3 adet sayi alacagiz. (Kullanici belirtecek).

2 sayi girilecekse bir metot icerisinde 2 adet sayi alip, toplama islemini yapip sonucu dondurelim.

3 adet sayi girilecekse ayni isimli overloaded bir metot yazalim ve sayilari disaridan parametre olarak overloaded metoda vererek sayilari toplayalim.

Yani;
Main'de kac sayi alacagini ogren. Gelecek sayi miktarina gore kullanacagin metodu sec ve direktiflere gore metodu tasarla.
 */
public class Question002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many number will you enter(2/3): ");
		int selecion = sc.nextInt();
		
		switch (selecion){
			case 2:{
			sumNumbers();
			}
			case 3:{
				System.out.println("Please enter the first number:");
				int num1 = sc.nextInt();
				System.out.println("Please enter the second number:");
				int num2 = sc.nextInt();
				System.out.println("Please enter the third number:");
				int num3 = sc.nextInt();
				int total = sumNumbers(num1,num2,num3);
				System.out.println("Total: "+total);
			}
			default:{
				System.out.println("Please select a valid option!");
				break;
			}
		}
		
	}
	
	public static void sumNumbers(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Please enter the second number: ");
		int num2 = sc.nextInt();
		System.out.println("total = "+(num1+num2));
	}
	public static int sumNumbers(int num1,int num2,int num3){
		int total = num1 + num2 + num3;
		return total;
	}
	
}