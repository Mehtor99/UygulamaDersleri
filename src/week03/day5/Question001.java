package week03.day5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*                                                 !!!!!! GPT !!!!!!

1- Taş - Kağıt - Makas oyunu yapalım.
Her turda skor gösterilecek,
bilgisayar :
oyuncu :
Her turdan sonra bir tur daha oynamak ister misiniz (E/H) seklinde bir soru sorulacak.
Cevap H ise final skor yazdirilacak ve oyun bitirilecek.
 */
public class Question001 {
	
	public static void main(String[] args) {
		
		String[] tkm = {"tas", "kagit", "makas"};
		
		System.out.println("Taş Kağıt Makas oyununa hoş geldiniz!");
		
		application(tkm);
		
		System.out.println("Oyun bitti. Teşekkürler!");
		
	}
	
	private static void application(String[] tkm) {
		Scanner scanner = new Scanner(System.in);
		int userSkor = 0;
		int pcSkor = 0;
		boolean devamKontrol = true;
		
		do {
			String pcSecim = rastgeleSecim(tkm);
			String userSecim = userSecim(scanner);
			
			System.out.println("Bilgisayar: " + pcSecim);
			System.out.println("Oyuncu: " + userSecim);
			
			if (userSecim.equalsIgnoreCase(pcSecim)) {
				System.out.println("BERABERE!");
			} else {
				switch (userSecim) {
					case "tas":
						if (pcSecim.equalsIgnoreCase("kagit")) {
							System.out.println("KAYBETTINIZ!");
							pcSkor++;
						} else {
							System.out.println("KAZANDINIZ!");
							userSkor++;
						}
						break;
					case "kagit":
						if (pcSecim.equalsIgnoreCase("makas")) {
							System.out.println("KAYBETTINIZ!");
							pcSkor++;
						} else {
							System.out.println("KAZANDINIZ!");
							userSkor++;
						}
						break;
					case "makas":
						if (pcSecim.equalsIgnoreCase("tas")) {
							System.out.println("KAYBETTINIZ!");
							pcSkor++;
						} else {
							System.out.println("KAZANDINIZ!");
							userSkor++;
						}
						break;
					default:
						System.out.println("Ge�ersiz se�im!");
				}
			}
			
			System.out.println("Skorlar:");
			System.out.println("Bilgisayar: " + pcSkor);
			System.out.println("Oyuncu: " + userSkor);
			
			System.out.print("Bir tur daha oynamak ister misiniz? (E/H): ");
			String devam = scanner.next();
			
			if (!devam.equalsIgnoreCase("E")) {
				devamKontrol  = false;
			}
			//yukarıdaki if bloğunda devam kontrole değer atamak yerine sadece bloğun içine sadece break; yazıp,
			// ehile içide de true dersek kod kod aynı şekilde çalışır(farklı bir döngü bitirme alternatifi)
			
		} while (devamKontrol);
		
		System.out.println("Final Skorlar:");
		System.out.println("Bilgisayar: " + pcSkor);
		System.out.println("Oyuncu: " + userSkor);
	}
	
	private static String userSecim(Scanner scanner) {
		System.out.print("Ta� i�in 'tas', Ka��t i�in 'kagit', Makas i�in 'makas' giriniz: ");
		String userSecim = scanner.next();
		return userSecim.toLowerCase(); // Kullan�c�n�n se�imini k���k harfe d�n��t�r�yoruz
	}
	
	private static String rastgeleSecim(String[] tkm) {
		Random random = new Random();
		int secimIndex = random.nextInt(tkm.length);
		return tkm[secimIndex];
	}
}