package uygulamalar.FutbolApp.modules;

import uygulamalar.FutbolApp.Databases.FutbolcuDB;
import uygulamalar.FutbolApp.Databases.MenajerDB;
import uygulamalar.FutbolApp.Databases.TakimDB;
import uygulamalar.FutbolApp.entities.Futbolcu;
import uygulamalar.FutbolApp.entities.Menajer;
import uygulamalar.FutbolApp.entities.Takim;
import uygulamalar.FutbolApp.model.DatabaseModel;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MenajerModule {
	private static DatabaseModel databaseModel;
	private static Optional<Menajer> aktifMenajer = Optional.empty();  // aktif menajer bilgisini burada tutuyoruz
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void menajerModule(DatabaseModel dbModel) {
		databaseModel = dbModel;
		
		int opt;
		do {
			
			opt = menajerGirisMenu();
			menajerGirisMenuOpsiyonlari(opt);
		} while (opt != 0);
	}
	
	private static Optional<Menajer> girisYap() {
		MenajerDB menajerDB = databaseModel.menajerDB;
		while (true) {
			System.out.println("lütfen menajer ID giriniz");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.println("lütfen menajer sifrenizi giriniz");
			String sifre = scanner.nextLine();
			Optional<Menajer> menager1 = menajerDB.menajerIdVeSifreKontrol(id, sifre);
			
			if (menager1.isPresent()) {
				aktifMenajer = menager1;
				System.out.println("Baþarili bir þekilde giriþ yaptiniz");
				return menager1;
			}
			else {
				System.out.println("Giris yapilamadi.Lutfen tekrar deneyiniz");
			}
		}
		
	}
	
	private static int menajerGirisMenu() {
		System.out.println("-----Menajer Giris Menu-----");
		System.out.println("1-Giris Yap");
		System.out.println("0-Geri don");
		System.out.print("seciminiz: ");
		int opt = scanner.nextInt();
		scanner.nextLine();
		return opt;
	}
	
	private static int menajerGirisMenuOpsiyonlari(int opt) {
		while (true) {
			switch (opt) {
				case 1: {
					girisYap();
					menajerMenuOpsiyonlari(menajerMenu());
					break;
				}
				case 2: {
					System.out.println("Ana menuye donuluyor");
					break;
				}
				case 0: {
					System.out.println("0--Ust menuye donuluyor ");
					break;
				}
			}
			return opt;
			}
		}
		
		private static int menajerMenu () {
			System.out.println("-----Menajer Menu-----");
			System.out.println("1--Takimimin detaylarini goruntule");
			System.out.println("2--Takimimin futbolcularini goruntule");
			System.out.println("3--Takimlarin ozet bilgilerini goruntule");
			System.out.println("0--Ust menuye don ");
			System.out.print("Seciminiz: ");
			int opt = scanner.nextInt();
			scanner.nextLine();
			return opt;
		}
		
		private static int menajerMenuOpsiyonlari ( int opt){
			switch (opt) {
				case 1: {
					kulubumunDetaylariniGoruntule();
					break;
				}
				case 2: {
					kulubumunFutbolculariniGoruntule();
					break;
				}
				case 3: {
					takimlerinOzetBilgileriniGoruntule();
					takimIdyeGoreFutbolcularOzetBilgi();
					break;
				}
				case 0: {
					System.out.println("Ust menuye donuluyor");
				}
			}
			return opt;
		}
		
		private static void takimIdyeGoreFutbolcularOzetBilgi () {
		FutbolcuDB futbolcuDB = databaseModel.futbolcuDB;
			System.out.println("Futbolcularini goruntulemek istediginiz takimi seciniz:");
			int takimId = scanner.nextInt();
			scanner.nextLine();
			List<Futbolcu> futbolcuList = futbolcuDB.takimIdyeGoreFutbolculariListele(takimId);
			futbolcuList.forEach(futbolcu -> System.out.println(futbolcu.toStringOzet()));
		}
		
		
		private static void takimlerinOzetBilgileriniGoruntule () {
		TakimDB takimDB = databaseModel.takimDB;
			takimDB.takimlarIsimIdList();
		}
		
		private static void kulubumunFutbolculariniGoruntule () {
			FutbolcuDB futbolcuDB = databaseModel.futbolcuDB;
			if (aktifMenajer.isEmpty()) {
				System.out.println("Lutfen giris sayfasindan giris yapiniz !! ");
			}
			List<Futbolcu> takiminFutbolculari =
					futbolcuDB.takimIdyeGoreFutbolculariListele(aktifMenajer.get().getTakimID());
			takiminFutbolculari.forEach(System.out::println);
		}
		
		private static void kulubumunDetaylariniGoruntule () {
			TakimDB takimDB = databaseModel.takimDB;
			if (aktifMenajer.isEmpty()) {
				System.out.println("Lutfen giris sayfasindan giris yapiniz !! ");
			}
			takimDB.menajerinTakimIdsineGoreTakimBul(aktifMenajer.get().getTakimID());
		}
		
	}