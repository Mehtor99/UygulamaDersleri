package week02.day02;

import java.util.Scanner;
/*
- Dışarıdan taban değeri ve üs isimli 2 tane değişken alınacak. (2 üzeri 5 gibi) tabanın kuvvetini hesaplamak istiyorum.
Hesaplamayı yaptıktan sonra, kullanıcıya ismini soracağım. Sonra çıktı olarak; "kullaniciIsmi + "n üzeri x isleminin sonucu " "
 */
public class Question001 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("taban degerini giriniz: ");
		int base = sc.nextInt();
		System.out.println("Us değerini giriniz: ");
		int exponent = sc.nextInt();
		int reply= 1;
		
		for (int i=1;i<=exponent;i++){
			reply = reply * base;
		}
		
		System.out.print("Adiniz: ");
		sc.nextLine();           //bunun sebebi sayisal değer girdikten sonra metin girerken hata vermesini engellemek
		String name = sc.nextLine();
		sc.close();
		System.out.println("Kullanici Adi: "+name +"    islem sunucu: "+reply );
		
		
	}
}