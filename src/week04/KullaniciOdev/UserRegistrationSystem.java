package week04.KullaniciOdev;


import java.util.Scanner;
import java.util.SortedMap;

import static week04.KullaniciOdev.UserPrivateList.userArray;


public class UserRegistrationSystem {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*   User user1 = new User();
		     user1.setName("Mehmet");
		     System.out.println(user1.getName());  */
		menu();
	}
	
	public static void menu() {
		int selection = 0;     //TODO try-catch ile dene
		do {
			System.out.println("### KULLANICI MENÜSÜ ###");
			System.out.println("1--Kayit Ol.");
			System.out.println("2--Giris Yap. ");
			System.out.println("3--Sifremi Unuttum");
			System.out.println("4--Userlarý Listele");
			System.out.println("0-- Cikis");
			System.out.print("Bir secim yapiniz : ");
			selection = sc.nextInt();
			sc.nextLine();
			status(selection);
			
		} while (selection != 0);
		
	}
	
	private static void status(int selection) {
		switch (selection) {
			case 1: {
				userRegisration();
				break;
			}
			case 2: {
				girisYap();
				break;
			}
			case 3: {
				sifreYenile();
				break;
			}
			case 4: {
				UserDB.userListele();
				break;
			}
			case 0: {
				System.out.println("Cikis Yapidi.");
				selection = 0;
				break;
			}
			default: {
				System.out.println("\n! Geçerli bir seçim yapýnýz !\n");
				break;
			}
		}
	}
	
	private static void sifreYenile() {
		boolean dogrulama = false;
		System.out.println("### Sýfre Yenileme Ekrani ###");
		System.out.println("Kullanici Adinizi Giriniz: ");
		String kullaniciAdi = sc.nextLine();
		System.out.println("Tc'nizi giriniz: ");
		String tc = sc.nextLine();
		int index = UserDB.userIndexBul(kullaniciAdi);
		dogrulama = UserDB.sifreYenilemeKontrol(kullaniciAdi, tc);
		if (dogrulama) {
			String yeniSifre = sifreAl();
			UserDB.sifreDegistir(index, yeniSifre);
		}
	}
	
	
	private static void girisYap() {
		boolean bilgilerDogruMu = false;
		for (int i = 0; i < 3; i++) {
			System.out.println("### Giris Ekrani ###");
			System.out.println("Kullanici adinizi giriniz: ");
			String kullaniciAdi = sc.nextLine();
			System.out.println("Sifrenizi giriniz: ");
			String sifre = sc.nextLine();
			bilgilerDogruMu = UserDB.girisKontrol(kullaniciAdi, sifre);
			if (bilgilerDogruMu) {
				System.out.println("Giriþ yapidi.");
				return;
			}
			else {
				System.out.println("Bilgiler hatalý tekrar deneyiniz!!");
			}
		}
		System.out.println("3 yanlýþ deneme yaptýnýz ,daha sonra tekrar deneyin.");
	}
	
	private static void userRegisration() {
		User user = new User();
		
		user.setEmail1(emailAl());
		user.setUserName1(kullaniciAdiAl());
		user.setTcNumber1(tcAl());
		user.setSifre(sifreAl());
		
		UserDB.save(user);
	}
	
	private static String sifreAl() {
		System.out.println("Þifre giriniz: ");
		String sifre = sc.nextLine();
		return sifre;
	}
	
	private static String tcAl() {
		boolean tcVarMi = false;
		while (true) {
			System.out.println("TC giriniz: ");
			String tc = sc.nextLine();
			tcVarMi = UserDB.tcKontrol(tc);
			if (tcVarMi) {
				System.out.println("TC zaten kullanýlýyor.");
				continue;
			}
			return tc;
		}
	}
	
	private static String kullaniciAdiAl() {
		boolean kullaniciAdiVarMi = false;
		while (true) {
			System.out.println("Kullanýcý adý giriniz: ");
			String kullaniciAdi = sc.nextLine();
			kullaniciAdiVarMi = UserDB.kullaniciAdiKontrol(kullaniciAdi);
			if (kullaniciAdiVarMi) {
				System.out.println("kullanici Adi zaten kullanýlýyor");
				continue;
			}
			return kullaniciAdi;
		}
	}

//	private static String setUserName() {
//
//	}
	
	private static String emailAl() {
		boolean emailVarMi = false;
		while (true) {
			System.out.println("email adresinizi giriniz: ");
			String email = sc.nextLine();
			emailVarMi = UserDB.emailKontrol(email);
			if (emailVarMi) {
				System.out.println("eMail zaten kullanýlýyor!");
				continue;
			}
			return email;
		}
	}
	
	private static String getPhoneNumber() {
		System.out.println("Telefon numaranizi giriniz: +90 ");
		String phoneNumber = sc.nextLine();
		return phoneNumber;
	}
	
	private static String[] getNameSurname() {
		String[] nameSurname = new String[2];
		System.out.println("Adýnýzý giriniz: ");
		nameSurname[0] = sc.nextLine();
		System.out.println("Soyadýnýzý giriniz: ");
		nameSurname[1] = sc.nextLine();
		return nameSurname;
	}
}