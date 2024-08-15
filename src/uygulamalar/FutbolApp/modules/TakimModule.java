package uygulamalar.FutbolApp.modules;

import maratonlar.maraton02.entities.Manager;
import uygulamalar.FutbolApp.Databases.FutbolcuDB;
import uygulamalar.FutbolApp.Databases.LigDB;
import uygulamalar.FutbolApp.Databases.MusabakaDB;
import uygulamalar.FutbolApp.Databases.TakimDB;
import uygulamalar.FutbolApp.entities.Futbolcu;
import uygulamalar.FutbolApp.entities.Menajer;
import uygulamalar.FutbolApp.utilities.DataGenerator;
import uygulamalar.FutbolApp.utilities.enums.ERenkler;
import uygulamalar.FutbolApp.entities.Takim;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TakimModule {
	private static  TakimDB takimDB;
	private static FutbolcuDB futbolcuDB;
	private static final Scanner scanner = new Scanner(System.in);
	
	public static int takimModule(TakimDB takimDB,FutbolcuDB futbolcuDB,LigDB ligDB) {
		TakimModule.futbolcuDB=futbolcuDB;
		TakimModule.takimDB=takimDB;
		int opt=0;
		takimModelMenuOpsiyonlari(takimModelMenu());
		return opt;
	}
	
	public static int takimModelMenu(){
		System.out.println("-----Takim Menu-----");
		System.out.println("1-Isme göre takım ara");
		System.out.println("2-Takimlari listele");
		System.out.print("seciminiz: ");
		int opt=scanner.nextInt();
		scanner.nextLine();
		return opt;
	}
	private static int takimModelMenuOpsiyonlari(int opt) {
		
			switch (opt) {
				case 1: {
					System.out.println("Lutfen bir takim ismi giriniz: ");
					String arananTakim = scanner.nextLine();
					List<Takim> takimList = takimDB.girilenMetniIcerenleriListele(arananTakim);
					if (takimList.isEmpty()){
						System.out.println("Takim Bulunamadi!");
					}
					opt = takimDetayMenuSecenekleri(takimDetayMenu());
					break;
				}
				case 2: {
					System.out.println("#### Takimlar Listesi ####");
					takimDB.takimlarIsimIdList();
					break;
				}
				case 0: {
					System.out.println("Ana menuye donuluyor :)");
					return opt;
				}
				default:
					System.out.println("Lutfen gecerli bir secim yapiniz !!");
			}
			return opt;
		
	}
	
	private static int takimDetayMenuSecenekleri(int opt) {
		switch (opt) {
			case 1: {
				Integer takimId =idAl();
				idyeGoreTakimBul(takimId);
				break;
			}
			case 2: {
				Integer takimId =idAl();
				List<Futbolcu> futbolcuList = futbolcuDB.takimIdyeGoreFutbolcuBul(takimId);
				futbolcuList.forEach(System.out::println);
				break;
			}
			case 0: {
				return opt;
				
			}
			default:
				System.out.println("Gecerli bir secim yapiniz.");
		}
		return opt;
	}
	
	private static void idyeGoreTakimBul(Integer takimId) {
		System.out.println(takimDB.findById(takimId).get()); //sondaki get konsolda
		// optionalden kurtulmaya yaradı.
	}
	
	private static int idAl() {
		System.out.println("Bir takim seciniz(id no ile): ");
		int takimId = scanner.nextInt();
		return takimId;
	}
	
	
	
	
	private static int takimDetayMenu() {
		System.out.println("-----Takim Detay Menu-----");
		System.out.println("1- Takim Detaylari Goruntule ");
		System.out.println("2- Takim Kadrosu Goruntule ");
		System.out.println("0- takimMenu'ye dön");
		System.out.print("seciminiz: ");
		int opt=scanner.nextInt();
		scanner.nextLine();
		return opt;
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