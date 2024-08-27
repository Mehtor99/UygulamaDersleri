package uygulamalar.FutbolApp;

import uygulamalar.FutbolApp.Databases.*;
import uygulamalar.FutbolApp.entities.*;
import uygulamalar.FutbolApp.model.DatabaseModel;
import uygulamalar.FutbolApp.model.LigModel;
import uygulamalar.FutbolApp.model.MusabakaModel;
import uygulamalar.FutbolApp.modules.MenajerModule;
import uygulamalar.FutbolApp.modules.MusabakaModule;
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

		startApplication();
	
	
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
		System.out.println("4- ");
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
				MusabakaModule.musabakaModule(databaseModel);
			}
			case 4:{
				
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