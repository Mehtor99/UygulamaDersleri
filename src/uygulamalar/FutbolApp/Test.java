package uygulamalar.FutbolApp;

import uygulamalar.FutbolApp.Databases.*;
import uygulamalar.FutbolApp.entities.*;
import uygulamalar.FutbolApp.model.DatabaseModel;
import uygulamalar.FutbolApp.model.LigModel;
import uygulamalar.FutbolApp.model.MusabakaModel;
import uygulamalar.FutbolApp.modules.MenajerModule;
import uygulamalar.FutbolApp.modules.TakimModule;
import uygulamalar.FutbolApp.utilities.DataGenerator;
import uygulamalar.FutbolApp.utilities.FiksturGenerator;
import uygulamalar.FutbolApp.utilities.FileIOReader;
import uygulamalar.FutbolApp.utilities.FileIOWriter;
import uygulamalar.FutbolApp.utilities.enums.EBolge;
import uygulamalar.FutbolApp.utilities.enums.EKume;
import uygulamalar.FutbolApp.utilities.enums.ERenkler;

import java.time.LocalDate;
import java.util.*;

/*
[17:27] Alperen Ikinci (BilgeAdam Boost)
Önemli!
Arkadaşlar toplantıyı sonlandırıyorum. Yarın itibariyle entityler hazır, Database-Entity bağlantıları kurulmuş.
Dolayısıyla oluşturduğum nesnelerin DB'de kayıt altına alındığı bir yapı bekliyorum. Bu yapının üzerinden devam edeceğiz.
Hepinizin eline sağlık, yarın görüşmek üzere!
 */



public class Test {
	private static DatabaseModel databaseModel = DatabaseModel.getInstance();
	private static Scanner scanner = new Scanner(System.in);
	private static LigModel ligModel = new LigModel(databaseModel);
	
	
	public static void main(String[] args) {

//		DataGenerator.generateData(databaseModel);
//		FileIOWriter.nesneleriYazdir(databaseModel);
//		FileIOReader.nesneleriOku(databaseModel);

//		startApplication();
		
		Map<Integer, String> takimIDtoIsim = new HashMap<>();
		takimIDtoIsim.put(1, "Galatasaray");
		takimIDtoIsim.put(2, "Fenerbahçe");
		takimIDtoIsim.put(3, "Beşiktaş");
		takimIDtoIsim.put(4, "Trabzonspor");
		takimIDtoIsim.put(5, "Başakşehir");
		takimIDtoIsim.put(6, "Alanyaspor");
		takimIDtoIsim.put(7, "Antalyaspor");
		takimIDtoIsim.put(8, "Konyaspor");
		takimIDtoIsim.put(9, "Sivasspor");
		takimIDtoIsim.put(10, "Çaykur Rizespor");
		takimIDtoIsim.put(11, "Gaziantep FK");
		takimIDtoIsim.put(12, "İstanbul Başakşehir");
		takimIDtoIsim.put(13, "MKE Ankaragücü");
		takimIDtoIsim.put(14, "Gençlerbirliği");
		takimIDtoIsim.put(15, "Kayserispor");
		takimIDtoIsim.put(16, "Yeni Malatyaspor");
		takimIDtoIsim.put(17, "Göztepe");
		takimIDtoIsim.put(18, "Denizlispor");
		takimIDtoIsim.put(19, "Bodrum FK");
		
		// Takım ID listesini oluştur
		List<Integer> takimIDleri = new ArrayList<>(takimIDtoIsim.keySet());
		
		// Sezon başlangıç tarihi
		LocalDate sezonBaslangic = LocalDate.of(2024, 8, 30);
		
		// FiksturGenerator nesnesini oluştur ve fikstürü oluştur
		FiksturGenerator fiksturGenerator = new FiksturGenerator(takimIDleri, sezonBaslangic, takimIDtoIsim);
		fiksturGenerator.generateFikstur();
		
		// Fikstürü yazdır
		fiksturGenerator.fiksturuYazdir();
		
		// Puan tablosunu güncelle ve yazdır
		fiksturGenerator.puanTablosunuGuncelle();
		fiksturGenerator.puanTablosunuYazdir();
	
	}
	
	
	public static void startApplication() {
		int opt = 0;
		do {
			opt = futbolAppMenuOpsiyonlari(futbolAppMenu());
		} while (opt != 0);
	}
	
	private static int futbolAppMenu() {
		System.out.println("### Futbol App Ana Menu ###");
		System.out.println("1- Menajer Islemleri");
		System.out.println("2- Takim Islemleri");
		System.out.println("3- Musabaka Islemleri");
		System.out.println("4- Fiksturu goruntule");
		System.out.println("0- Cikis");
		System.out.println("Secimiz: ");
		int opt = scanner.nextInt();
		scanner.nextLine();
		return opt;
	}
	
	private static int futbolAppMenuOpsiyonlari(int opt) {
		switch (opt) {
			case 1: {
				MenajerModule.menajerModule(databaseModel);
				break;
			}
			case 2: {
				TakimModule.takimModule(databaseModel);
				break;
			}
			case 3:{
			
			}
			case 4:{
				ligModel.fiksturOlustur(databaseModel);
				break;
			}
			case 0: {
				System.out.println("FutbolApp kapatiliyor...");
				break;
			}
			default: {
				System.out.println("Gecerli bir secim yapiniz !!");
			}
		}
		return opt;
	}
}