package uygulamalar.FutbolApp;

import uygulamalar.FutbolApp.Databases.FutbolcuDB;
import uygulamalar.FutbolApp.Databases.LigDB;
import uygulamalar.FutbolApp.Databases.MusabakaDB;
import uygulamalar.FutbolApp.Databases.TakimDB;
import uygulamalar.FutbolApp.entities.*;
import uygulamalar.FutbolApp.utilities.DataGenerator;
import uygulamalar.FutbolApp.utilities.enums.EMevki;
/*
[17:27] Alperen Ikinci (BilgeAdam Boost)
Önemli!
Arkadaşlar toplantıyı sonlandırıyorum. Yarın itibariyle entityler hazır, Database-Entity bağlantıları kurulmuş.
Dolayısıyla oluşturduğum nesnelerin DB'de kayıt altına alındığı bir yapı bekliyorum. Bu yapının üzerinden devam edeceğiz.
Hepinizin eline sağlık, yarın görüşmek üzere!
 */
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import static uygulamalar.FutbolApp.modules.TakimModule.menu;

public class Test {
	private static final FutbolcuDB futbolcuDB = new FutbolcuDB();
	private static final MusabakaDB musabakaDB = new MusabakaDB();
	private static final LigDB ligDB = new LigDB();
	private static final TakimDB takimDB = new TakimDB();
	private static final Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		menu();
		
	}
	
	
}