package uygulamalar.FutbolApp;

import uygulamalar.FutbolApp.Databases.*;
import uygulamalar.FutbolApp.entities.*;
import uygulamalar.FutbolApp.modules.MenajerModule;
import uygulamalar.FutbolApp.modules.TakimModule;
import uygulamalar.FutbolApp.utilities.DataGenerator;
import uygulamalar.FutbolApp.utilities.FileIOReader;
import uygulamalar.FutbolApp.utilities.FileIOWriter;

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
	
	public static void main(String[] args) {
//		DataGenerator.generateData(futbolcuDB,takimDB,ligDB,menajerDB);
//    	FileIOWriter.nesneleriYazdir(futbolcuDB,takimDB,ligDB,menajerDB);
		FileIOReader.nesneleriOku(futbolcuDB,takimDB,ligDB,menajerDB);

		starApplication();
	};
	public static void starApplication(){
		int opt =0;
		do {
		//	TakimModule.takimModule(takimDB,futbolcuDB,ligDB);
			MenajerModule.menajerModule(menajerDB,takimDB,futbolcuDB);
		}while (opt!=0);
	}
	
}