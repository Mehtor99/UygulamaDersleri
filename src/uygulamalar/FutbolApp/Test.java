package uygulamalar.FutbolApp;

import uygulamalar.FutbolApp.Databases.*;
import uygulamalar.FutbolApp.entities.*;
import uygulamalar.FutbolApp.modules.MenajerModule;
import uygulamalar.FutbolApp.modules.TakimModule;
import uygulamalar.FutbolApp.utilities.DataGenerator;
import uygulamalar.FutbolApp.utilities.FileIOReader;
import uygulamalar.FutbolApp.utilities.FileIOWriter;

import java.util.Scanner;

/*
[17:27] Alperen Ikinci (BilgeAdam Boost)
Önemli!
Arkadaşlar toplantıyı sonlandırıyorum. Yarın itibariyle entityler hazır, Database-Entity bağlantıları kurulmuş.
Dolayısıyla oluşturduğum nesnelerin DB'de kayıt altına alındığı bir yapı bekliyorum. Bu yapının üzerinden devam edeceğiz.
Hepinizin eline sağlık, yarın görüşmek üzere!
 */



public class Test {
	private static FutbolcuDB futbolcuDB = new FutbolcuDB();
	private static TakimDB takimDB=new TakimDB();
	private static LigDB ligDB = new LigDB();
	private static MenajerDB menajerDB=new MenajerDB();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
//		DataGenerator.generateData(futbolcuDB,takimDB,ligDB,menajerDB);
//    	FileIOWriter.nesneleriYazdir(futbolcuDB,takimDB,ligDB,menajerDB);
		FileIOReader.nesneleriOku(futbolcuDB,takimDB,ligDB,menajerDB);

		startApplication();
	};
	public static void startApplication(){
		int opt =0;
		do {
			opt = futbolAppMenuOpsiyonlari(futbolAppMenu());
		}while (opt!=0);
	}
	
	private static int futbolAppMenu(){
		System.out.println("### Futbol App Ana Menu ###");
		System.out.println("1- Menajer Islemleri");
		System.out.println("2- Takim Islemleri");
		System.out.println("0- Cikis");
		System.out.println("Secimiz: ");
		int opt = scanner.nextInt();scanner.nextLine();
		return opt;
	}
	
	private static int futbolAppMenuOpsiyonlari(int opt){
		switch (opt){
			case 1:{
				MenajerModule.menajerModule(menajerDB,takimDB,futbolcuDB);
				break;
			}
			case 2: {
				TakimModule.takimModule(takimDB,futbolcuDB,ligDB);
				break;
			}
			case 0: {
				System.out.println("FutbolApp kapatiliyor...");
				break;
			}
			default:{
				System.out.println("Gecerli bir secim yapiniz !!");
			}
		}
		return opt;
	}
	
}