package week02.day03;

import java.util.Scanner;

public class Odev02KullaniciMenusu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hosgeldiniz! / Welcome!\n" + "Lutfen goruntuleme dilini seciniz. / Please select display " + "language.\n" + "1-- Turkish (TR)\n" + "" + "2-- English (EN)");
		int lang = sc.nextInt();
		int menuSecim;
		
		if (lang < 1 || lang > 2) {
			System.out.println("Gecersiz giriş");
		}
		else {
			if (lang == 1) {
				System.out.println("0 -- Cikis Yap\n" + "1--  Merhaba Dunya yazdir.\n" + "2-- Faktoriyel Hesapla.\n" + "3-- Asal sayi kontrolu yap.");
				menuSecim = -1;
				while (menuSecim != 0) {
					System.out.println("Lutfen bir secim yapiniz.");
					menuSecim = sc.nextInt();
					
					if (menuSecim < 0 || menuSecim > 3) {
						System.out.println("Gecersiz giris");
					}
					else {
						if (menuSecim == 0) {
							System.out.println("Program sonlandirilmistir! Gorusmek uzere!");
						}
						else if (menuSecim == 1) {
							System.out.println("Merhaba Dunya :)");
						}
						else if (menuSecim == 2) {
							System.out.println("Faktoriyelini hesaplamak istediginiz sayiyi giriniz: ");
							int sayi = sc.nextInt();
							int faktoriyel = 1;
							for (int i = 2; i <= sayi; i++) {
								faktoriyel = faktoriyel * i;
							}
							System.out.println("Girilen sayinin faktoriyeli: " + faktoriyel);
						}
						else {
							System.out.print("Bir sayi giriniz : ");
							long number = sc.nextLong();
							boolean isPrime = true;
							long sqrt = (long) Math.sqrt(number);
							if (number <= 1 || number % 2 == 0 && number != 2) {
								System.out.println(number + " Asal sayi Degildir.");
							}
							else if (number == 2) {
								System.out.println(number + " Asal sayidir.");
							}
							else {
								for (long i = 3; i <= sqrt; i = i + 2) {
									if (number % i == 0) {
										isPrime = false;
										break;
									}
								}
								
								if (isPrime) {
									System.out.println(number + " Asal sayidir.");
								}
								else {
									System.out.println(number + " Asal sayi Degildir.");
								}
								
							}
						}
						
					}
				}
			}
			
			else {
				//ingilizce versiyon burada olacak.
				System.out.println("0 -- Log Out\n" + "1--  Hello World print.\n" + "2-- Calculate Factorial.\n" + "3-- Check Prime Number.");
				menuSecim = -1;
				while(menuSecim != 0) {
					System.out.println("Please make a selection.");
					menuSecim = sc.nextInt();
					
					if (menuSecim < 0 || menuSecim > 3) {
						System.out.println("Invalid Login !");
					}
					else {
						if (menuSecim == 0) {
							System.out.println("Program has ended! See you later!");
						}
						else if (menuSecim == 1) {
							System.out.println("Hello World :)");
						}
						else if (menuSecim == 2) {
							System.out.println("Please enter the number for which you want to calculate the factorial:");
							int sayi = sc.nextInt();
							int faktoriyel = 1;
							for (int i = 2; i <= sayi; i++) {
								faktoriyel = faktoriyel * i;
							}
							System.out.println("The factorial of the entered number is:\" " + faktoriyel);
						}
						else {
							System.out.print("Please enter a number: ");
							long number = sc.nextLong();
							boolean isPrime = true;
							long sqrt = (long) Math.sqrt(number);
							if (number <= 1 || number % 2 == 0 && number != 2) {
								System.out.println(number + " Is not a prime number. ");
							}
							else if (number == 2) {
								System.out.println(number + " Is a prime number. ");
							}
							else {
								for (long i = 3; i <= sqrt; i = i + 2) {
									if (number % i == 0) {
										isPrime = false;
										break;
									}
								}
								
								if (isPrime) {
									System.out.println(number + " Is a prime number. ");
								}
								else {
									System.out.println(number + " Is not a prime number. ");
								}
								
							}
						}
						
					}
				}
			}
		}
	}
}