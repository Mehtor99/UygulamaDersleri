package uygulamalar.FutbolApp.utilities;

import uygulamalar.FutbolApp.Databases.FutbolcuDB;
import uygulamalar.FutbolApp.Databases.LigDB;
import uygulamalar.FutbolApp.Databases.MenajerDB;
import uygulamalar.FutbolApp.Databases.TakimDB;
import uygulamalar.FutbolApp.entities.Futbolcu;
import uygulamalar.FutbolApp.entities.Lig;
import uygulamalar.FutbolApp.entities.Menajer;
import uygulamalar.FutbolApp.entities.Takim;
import uygulamalar.FutbolApp.utilities.enums.EBolge;
import uygulamalar.FutbolApp.utilities.enums.EKume;
import uygulamalar.FutbolApp.utilities.enums.EMevki;
import uygulamalar.FutbolApp.utilities.enums.ERenkler;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class DataGenerator {
	private static final String[] ISIM={
			"Ahmet", "Mehmet", "Ali", "Anıl", "Hasan", "Murat", "Kemal", "İbrahim", "Oğuz", "Emre", "Serkan", "Barış",
			"Halil", "Berk", "Kaan", "Sinan", "Erdem", "Hakan", "Cihan", "Levent", "Rıza", "Volkan", "Arda", "Sefa", "Fikret", "Can", "Orhan", "Eren", "Burak", "Selim", "Tolga", "Umut", "Uğur", "Özgür", "Taner", "Kadir", "Cem", "Ege", "Bora", "Mert", "Vedat", "Deniz", "Tarık", "Yavuz", "Gökhan", "Koray", "Enes", "Erkan", "Tuncay", "Fırat", "Tamer"
	};
	
	private static final String[] SOYISIM={
			"Özogli", "Kaya", "Demir", "Çelik", "Şahin", "Aydın", "Yıldız", "Arslan", "Doğan", "Güneş", "Öztürk", "Kıl",
			"ıç",	"Kurt", "Koç", "Erdoğan", "Polat", "Avcı", "Aksoy", "Taş", "Ünal", "Durmaz", "Erdem", "Bulut", "Çetin", "Korkmaz", "Keskin", "Tan", "Güler", "Baş", "Bozkurt", "Ergin", "Özdemir", "Can", "Karaca", "Orhan", "Turan", "Kara", "Ay", "Tekin", "Aslan", "Kurtuluş", "Uzun", "Çalışkan", "Yücel", "Dinç", "Boz", "Duman", "Şen", "Eken", "Işık", "Özer"
	};
	public static void rastgeleFutbolcuUret(FutbolcuDB futbolcuDB){
		Random random=new Random();
		int takimID=1;
		for (int i=0;i<18;i++){
			for (int j = 0; j <11 ; j++) {
				Futbolcu futbolcu=new Futbolcu(futbolcuDB);
				switch (j){
					case 0:
						futbolcu.setMevki(EMevki.KALECI);
						break;
					case 1,2,3,4:
						futbolcu.setMevki(EMevki.DEFANS);
						break;
					case 5,6,7,8:
						futbolcu.setMevki(EMevki.ORTASAHA);
						break;
					case 9,10:
						futbolcu.setMevki(EMevki.FORVET);
						break;
				}
				futbolcu.setIsim(ISIM[random.nextInt(0,ISIM.length)]);
				futbolcu.setSoyIsim(SOYISIM[random.nextInt(0,SOYISIM.length)]);
				futbolcu.setBonservisBedeli(random.nextLong(100_000,5_000_000));
				futbolcu.setDogumTarihi(LocalDate.of(random.nextInt(1980, 2005), random.nextInt(1, 13),
				                                     random.nextInt(1,28)));
				futbolcu.setTakimID(takimID);
			}
			takimID++;
		}
		
	}
	
	public static void generateTakimlar(TakimDB takimDB, LigDB ligDB){
		Takim takim1 = new Takim("Galatasaray",  ERenkler.KIRMIZI_SARI, "Dursun Özbek", "1905", takimDB);
		Takim takim2 = new Takim("Fenerbahçe",  ERenkler.SARI_LACIVERT, "Ali Koç", "1907", takimDB);
		Takim takim3 = new Takim("Beşiktaş",  ERenkler.SİYAH_BEYAZ, "Ahmet Nur Çebi", "1903", takimDB);
		Takim takim4 = new Takim("Trabzonspor",  ERenkler.BORDO_MAVİ, "Ahmet Ağaoğlu", "1967", takimDB);
		Takim takim5 = new Takim("Başakşehir",  ERenkler.ÇİFT_KIRMIZI, " Göksel Gümüşdağ", "2014", takimDB);
		Takim takim6 = new Takim("Alanyaspor", ERenkler.TURUNCU_LACIVERT, "Hasan Çavuşoğlu", "1948", takimDB);
		Takim takim7 = new Takim("Antalyaspor",  ERenkler.ŞERİTLİ_KIRMIZI, "Aziz Çetin", "1966", takimDB);
		Takim takim8 = new Takim("Konyaspor",  ERenkler.YEŞİL_BEYAZ, "Hilmi Kullukçu", "1922", takimDB);
		Takim takim9 = new Takim("Sivasspor",  ERenkler.KIRMIZI_BEYAZ, "Mecnun Otyakmaz", "1967", takimDB);
		Takim takim10 = new Takim("Çaykur Rizespor", ERenkler.YEŞİL_MAVİ, "İbrahim Turgut", "1953", takimDB);
		Takim takim11 = new Takim("Gaziantep FK",  ERenkler.ÇİFT_KIRMIZI, "Adil Kürükçü", "1969", takimDB);
		Takim takim12 = new Takim("İstanbul Başakşehir",  ERenkler.ÇİFT_KIRMIZI, " Göksel Gümüşdağ", "2014", takimDB);
		Takim takim13 = new Takim("MKE Ankaragücü",  ERenkler.SİYAH_KIRMIZI, "Fatih Mert", "1910", takimDB);
		Takim takim14 = new Takim("Gençlerbirliği",  ERenkler.KIRMIZI_SIYAH, "Murat Cavcav", "1923", takimDB);
		Takim takim15 = new Takim("Kayserispor",  ERenkler.KIRMIZI_SIYAH, "Berna Gözbaşı", "1966", takimDB);
		Takim takim16 = new Takim("Yeni Malatyaspor",  ERenkler.YEŞİL_SIYAH, "Adil Gevrek", "1986", takimDB);
		Takim takim17 = new Takim("Göztepe",  ERenkler.ÇİFT_KIRMIZI, "Mehmet Sepil", "1925", takimDB);
		Takim takim18 = new Takim("Denizlispor",  ERenkler.ÇİFT_KIRMIZI, "Ali İpek", "1966", takimDB);
		
		Lig turkiyeSuperLigi = new Lig("Türkiye super lig", "sezon1", EKume.SUPER_LIG, EBolge.TURKIYE,ligDB);
		
		turkiyeSuperLigi.getTakimList().addAll(List.of(takim1.getId(), takim2.getId(), takim3.getId(), takim4.getId(), takim5.getId(), takim6.getId(),
		                                               takim7.getId(), takim8.getId(),
		                                               takim9.getId(), takim10.getId(), takim11.getId(), takim12.getId(), takim13.getId(), takim14.getId(), takim15.getId(),
		                                               takim16.getId(), takim17.getId(), takim18.getId()));
	}
	
	
	public static void generateData(FutbolcuDB futbolcuDB, TakimDB takimDB, LigDB ligDB,MenajerDB menajerDB) {
		generateTakimlar(takimDB,ligDB);
		rastgeleFutbolcuUret(futbolcuDB);
		generateManajer(menajerDB);
	}
	
	
	public static void generateManajer(MenajerDB menajerDB){
		final String sifre = "12345678";
		Menajer menajer1 = new Menajer(LocalDate.of(1976, 6, 10), "Okan", "Buruk",sifre ,1,menajerDB);
		Menajer menajer2 = new Menajer(LocalDate.of(1955, 12, 24), "Jorge", "Jesus",sifre , 2,menajerDB);
		Menajer menajer3 = new Menajer(LocalDate.of(1967, 3, 24), "Şenol", "Güneş",sifre , 3, menajerDB);
		Menajer menajer4 = new Menajer(LocalDate.of(1962, 10, 20), "Abdullah", "Avcı",sifre , 4,menajerDB);
		Menajer menajer5 = new Menajer(LocalDate.of(1981, 1, 4), "Emre", "Belözoğlu",sifre , 5,menajerDB);
		Menajer menajer6 = new Menajer(LocalDate.of(1973, 3, 15), "Bülent", "Korkmaz",sifre , 6,menajerDB);
		Menajer menajer7 = new Menajer(LocalDate.of(1964, 3, 23), "Ersun", "Yanal", sifre ,7,menajerDB);
		Menajer menajer8 = new Menajer(LocalDate.of(1974, 8, 16), "İlhan", "Palut", sifre ,8,menajerDB);
		Menajer menajer9 = new Menajer(LocalDate.of(1970, 11, 27), "Rıza", "Çalımbay",sifre , 9,menajerDB);
		Menajer menajer10 = new Menajer(LocalDate.of(1968, 2, 28), "Bülent", "Uygun",sifre , 10,menajerDB);
		Menajer menajer11 = new Menajer(LocalDate.of(1978, 8, 15), "Erol", "Bulut",sifre , 11,menajerDB);
		Menajer menajer12 = new Menajer(LocalDate.of(1981, 1, 4), "Emre", "Belözoğlu",sifre , 12,menajerDB);
		Menajer menajer13 = new Menajer(LocalDate.of(1970, 4, 5), "Çağlar", "Karabıyık",sifre , 13,menajerDB);
		Menajer menajer14 = new Menajer(LocalDate.of(1965, 8, 20), "Yılmaz", "Vural",sifre , 14,menajerDB);
		Menajer menajer15 = new Menajer(LocalDate.of(1980, 10, 27), "Çağdaş", "Atan", sifre ,15,menajerDB);
		Menajer menajer16 = new Menajer(LocalDate.of(1969, 6, 12), "İbrahim", "Üzülmez",sifre , 16,menajerDB);
		Menajer menajer17 = new Menajer(LocalDate.of(1970, 6, 1), "Tamer", "Tuna",sifre , 17,menajerDB);
		Menajer menajer18 = new Menajer(LocalDate.of(1977, 2, 18), "Yücel", "İldiz",sifre , 18,menajerDB);
		
	}
	
}