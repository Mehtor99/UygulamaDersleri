package uygulamalar.FutbolApp;

import uygulamalar.FutbolApp.Databases.FutbolcuDB;
import uygulamalar.FutbolApp.Databases.LigDB;
import uygulamalar.FutbolApp.Databases.MusabakaDB;
import uygulamalar.FutbolApp.Databases.TakimDB;
import uygulamalar.FutbolApp.entities.*;
/*
[17:27] Alperen Ikinci (BilgeAdam Boost)
Önemli!
Arkadaþlar toplantýyý sonlandýrýyorum. Yarýn itibariyle entityler hazýr, Database-Entity baðlantýlarý kurulmuþ.
Dolayýsýyla oluþturduðum nesnelerin DB'de kayýt altýna alýndýðý bir yapý bekliyorum. Bu yapýnýn üzerinden devam edeceðiz.
Hepinizin eline saðlýk, yarýn görüþmek üzere!
 */
import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		FutbolcuDB futbolcuDB = new FutbolcuDB();
		MusabakaDB musabakaDB = new MusabakaDB();
		LigDB ligDB = new LigDB();
		TakimDB takimDB = new TakimDB();
		
		Futbolcu futbolcu1 = new Futbolcu("Arda", "Güler", EMevki.FORVET, LocalDate.of(2004, 10, 7), "50M");
		Futbolcu futbolcu2 = new Futbolcu("Mehmet", "Yýlmaz", EMevki.DEFANS, LocalDate.of(1998, 5, 12), "20M");
		Futbolcu futbolcu3 = new Futbolcu("Ayþe", "Demir", EMevki.KALECI, LocalDate.of(1996, 3, 22), "30M");
		Futbolcu futbolcu4 = new Futbolcu("Ali", "Can", EMevki.ORTASAHA, LocalDate.of(1990, 7, 19), "25M");
		Futbolcu futbolcu5 = new Futbolcu("Ege", "Kara", EMevki.FORVET, LocalDate.of(2001, 11, 30), "40M");

//        futbolcuDB.save(futbolcu1);
//        futbolcuDB.save(futbolcu2);
//        futbolcuDB.save(futbolcu3);
//        futbolcuDB.save(futbolcu4);
//        futbolcuDB.save(futbolcu5);
		
		
		Lig lig1 = new Lig("Süper Lig");
		ligDB.save(lig1);
		
		
		Takim takim1 = new Takim("Galatasaray", "Ahmet Eriþ", "Mehmet Ertop", "1905", ERenkler.KIRMIZI_SARI, 100, 1);
		takimDB.save(takim1);
		
		Takim takim2 = new Takim("Fenerbahçe", "Ali Koc", "Ali Kov", "1907", ERenkler.SARI_LACIVERT, 98, 1);
		takimDB.save(takim2);
		
		Takim takim3 = new Takim("Beþiktaþ", "Alper Guler", "Ahmet Eriþ", "1905", ERenkler.SIYAH_BEYAZ, 110, 1);
		takimDB.save(takim3);
		
		
		Musabaka musabaka1 = new Musabaka(takim3, takim2, 2, 3, "Ahmet Cakar", LocalDate.of(2024, 5, 4));
		musabakaDB.save(musabaka1);
		
		
		//System.out.println(takimDB.findAll());
		System.out.println(futbolcuDB.findAll());
		//System.out.println(ligDB.findAll());
		//System.out.println(musabakaDB.findAll());

//        futbolcuDB.futbolcuSil(1);
//        System.out.println(futbolcuDB.findAll());

	}
}