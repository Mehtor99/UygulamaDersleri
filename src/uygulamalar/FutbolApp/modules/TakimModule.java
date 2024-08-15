package uygulamalar.FutbolApp.modules;

import maratonlar.maraton02.entities.Manager;
import uygulamalar.FutbolApp.Databases.FutbolcuDB;
import uygulamalar.FutbolApp.Databases.LigDB;
import uygulamalar.FutbolApp.Databases.MusabakaDB;
import uygulamalar.FutbolApp.Databases.TakimDB;
import uygulamalar.FutbolApp.entities.Menajer;
import uygulamalar.FutbolApp.utilities.DataGenerator;
import uygulamalar.FutbolApp.utilities.enums.ERenkler;
import uygulamalar.FutbolApp.entities.Takim;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TakimModule {
	private static final FutbolcuDB futbolcuDB = new FutbolcuDB();
	private static final MusabakaDB musabakaDB = new MusabakaDB();
	private static final LigDB ligDB = new LigDB();
	private static final TakimDB takimDB = new TakimDB();
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void menu() {
		DataGenerator.generateTakimlar(takimDB, new LigDB());
		while (true) {
			System.out.println("------TAKIM MENU---------");
			System.out.println("1-Isme göre kulüp ara");
			System.out.println("2-Kulupleri listele");
			System.out.println("0-Çýkýþ yap");
			System.out.print("Seçiminizi yapýnýz: ");
			int secim = scanner.nextInt();
			scanner.nextLine();  // Dummy read to consume newline
			
			switch (secim) {
				case 1:
					ismeGoreAra();
					break;
				case 2:
					listeleTakimlar();
					break;
				case 0:
					scanner.close();
					System.out.println("Çýkýþ yapýlýyor...");
					return;
				default:
					System.out.println("Lütfen geçerli bir seçim yapýnýz.");
					break;
			}
		}
	}
	
	public static void ismeGoreAra() {
		System.out.print("Kulüp ismine giriniz (veya kýsmýný giriniz): ");
		String kulupIsmi = scanner.nextLine();
		List<Takim> takimlar = takimDB.girilenMetniIcerenleriListele(kulupIsmi);
		
		if (takimlar.isEmpty()) {
			System.out.println("Aradýðýnýz kriterlere uygun kulüp bulunamadý.");
		}
		else {
			for (int i = 0; i < takimlar.size(); i++) {
				System.out.println((i + 1) + ". " + takimlar.get(i).getTakimIsim());
			}
		}
	}
	
	public static void listeleTakimlar() {
		List<Takim> takimlar = takimDB.findAll();
		if (takimlar.isEmpty()) {
			System.out.println("Herhangi bir kulüp bulunamadý.");
		}
		else {
			System.out.println("Kulüpler:");
			for (int i = 0; i < takimlar.size(); i++) {
				Takim takim = takimlar.get(i);
				System.out.println((i + 1) + ". " + takim.getTakimIsim() + " - " + takim.getRenkler() + ". " + takim.getBaskanIsmi() + " - " + takim.getKurulusTarihi());
				
			}
		}
	}
//	public static int takimDetayMenu(String takimIsmi){
//		while (true){
//			System.out.println("---Takim Ismi---");
//			System.out.println("1- Takim Detayini Goster");
//			System.out.println("2- Takim Oyunclarini Goster");
//			System.out.println("0- Ana menuye don");
//			System.out.println("Seciminiz:");
//			scanner.nextInt();
//
//		}
//	}
}