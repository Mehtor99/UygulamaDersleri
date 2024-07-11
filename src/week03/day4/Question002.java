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
		System.out.println("Kac sayiyi toplamak istersiniz(2 || 3): ");
		int toplanacakSayiAdedi = sc.nextInt();
		if (toplanacakSayiAdedi == 2) {
			System.out.println(sayiToplama());
		}
		else if (toplanacakSayiAdedi == 3) {
			System.out.println(" 3 Adet sayi giriniz: ");
			System.out.println(sayiToplama(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		
		}
		else {
			System.out.println("Gecersiz giris!!!");
		}
		
		
			
		}
	public static int sayiToplama(){
		Scanner sc =new Scanner(System.in);
		System.out.println("ilk sayiyi giriniz: ");
		int num1 = sc.nextInt();
		System.out.println("ilk sayiyi giriniz: ");
		int num2 = sc.nextInt();
		int total = num1 + num2;
		return total;
	}
	
	public static int sayiToplama(int sayi1, int sayi2,int sayi3){
		int total = sayi1+sayi2+sayi3;
		return total;
	}
	
}