package week03.day2;

import java.util.Scanner;

/*1- Dışarıdan girilen ülke ismi bizim array'imizde bulunuyor mu? Kontrol edelim.
-> Türkiye, Japonya, Moğolistan, Amerika, Rusya, Çin
 */
public class Question001 {
	public static void main(String[] args) {
		String[] ulkeler = {"Türkiye", "Japonya", "Moğolistan", "Amerika", "Rusya", "Çin"};
		boolean isCountryPresent = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir ülke giriniz: ");
		String enteredCountry = sc.nextLine();
		
		for (String item : ulkeler) {
			if (item.equalsIgnoreCase(enteredCountry)) {
				isCountryPresent = true;
			}
		}
		if (isCountryPresent) {
			System.out.println("ülke mevcut");
		}
		else {
			System.out.println("ülke mevcut değil");
		}
	}
}