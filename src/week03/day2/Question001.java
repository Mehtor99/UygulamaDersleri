package week03.day2;

import java.util.Scanner;

/*1- Dışarıdan girilen ülke ismi bizim array'imizde bulunuyor mu? Kontrol edelim.
-> Türkiye, Japonya, Moğolistan, Amerika, Rusya, Çin
 */
public class Question001 {
	public static void main(String[] args) {
		String[] ulkeler = new String[]{"Turkiye", "Japonya", "Mogolistan", "Amerika", "Rusya", "Cin"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Aramak istediginiz ulkeyi giriniz: ");
		String arananUlke = sc.nextLine();
		
		for (int i = 0; i < ulkeler.length; i++) {
			if(ulkeler[i].equalsIgnoreCase(arananUlke)){
				System.out.println("Aranan ulke bulunuyor.");
			}
		}
	}
}