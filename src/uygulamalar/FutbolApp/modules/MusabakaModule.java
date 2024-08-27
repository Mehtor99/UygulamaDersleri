package uygulamalar.FutbolApp.modules;

import uygulamalar.FutbolApp.entities.Istatistik;
import uygulamalar.FutbolApp.entities.Lig;
import uygulamalar.FutbolApp.entities.Musabaka;
import uygulamalar.FutbolApp.entities.Takim;
import uygulamalar.FutbolApp.model.DatabaseModel;
import uygulamalar.FutbolApp.model.LigModel;
import uygulamalar.FutbolApp.utilities.FiksturGenerator;
import uygulamalar.FutbolApp.utilities.enums.EBolge;
import uygulamalar.FutbolApp.utilities.enums.EKume;
import uygulamalar.FutbolApp.utilities.enums.ERenkler;

import java.time.LocalDate;
import java.util.*;

public class MusabakaModule {
	private static DatabaseModel databaseModel;
	private static final Scanner scanner = new Scanner(System.in);
	private static LigModel ligModel = new LigModel(databaseModel);
	
	private static Lig trendYolSuperLig;
	private static Map<Integer, String> takimIdToNameMap;
	private Map<Integer, Integer> puanTablosu;
	
	
	public static void musabakaModule(DatabaseModel dbModel) {
		
		databaseModel = dbModel;
		
		int opt;
		do {
			opt = musabakaMenu();
			musabakaMenuOpsiyonlari(opt);
		} while (opt != 0);
	}
	
	
	private static int musabakaMenu() {
		System.out.println("-----Musabaka Menu-------");
		System.out.println("1-Fiksturu Goruntule");
		
		
		System.out.println("2-Puan tablosunu Goruntule");
		System.out.println("0-C�k�s Yap");
		System.out.print("Seciminiz");
		int opt = scanner.nextInt();
		scanner.nextLine();
		return opt;
		
	}
	
	private static int musabakaMenuOpsiyonlari(int opt) {
		switch (opt) {
			case 1: {
				ligModel.fiksturOlustur(databaseModel);
				break;
			}
			case 2: {
				
				puanTablosu();
				
				break;
			}
			case 0: {
				System.out.println("Ana menuye d�n�l�yor...");
			}
			default:
				System.out.println("l�tfen gecerli bir secim yap�n�z");
		}
		
		return opt;
	}
	
	private static void puanTablosu() {
		
		Takim takim1 =
				new Takim("Galatasaray", 1, ERenkler.KIRMIZI_SARI, "Dursun �zbek", "1905", databaseModel.takimDB);
		Takim takim2 = new Takim("Fenerbah�e", 2, ERenkler.SARI_LACIVERT, "Ali Ko�", "1907", databaseModel.takimDB);
		Takim takim3 = new Takim("Be�ikta�", 3, ERenkler.SIYAH_BEYAZ, "Ahmet Nur �ebi", "1903", databaseModel.takimDB);
		Takim takim4 = new Takim("Trabzonspor", 4, ERenkler.BORDO_MAVI, "Ahmet A�ao�lu", "1967",
		                         databaseModel.takimDB);
		Takim takim5 =
				new Takim("Ba�ak�ehir", 5, ERenkler.CIFT_KIRMIZI, "G�ksel G�m��da�", "2014", databaseModel.takimDB);
		Takim takim6 =
				new Takim("Alanyaspor", 6, ERenkler.TURUNCU_LACIVERT, "Hasan �avu�o�lu", "1948",
				          databaseModel.takimDB);
		Takim takim7 =
				new Takim("Antalyaspor", 7, ERenkler.SERITLI_KIRMIZI, "Aziz �etin", "1966", databaseModel.takimDB);
		Takim takim8 = new Takim("Konyaspor", 8, ERenkler.YESIL_BEYAZ, "Hilmi Kulluk�u", "1922",
		                         databaseModel.takimDB);
		Takim takim9 =
				new Takim("Sivasspor", 9, ERenkler.KIRMIZI_BEYAZ, "Mecnun Otyakmaz", "1967", databaseModel.takimDB);
		Takim takim10 =
				new Takim("�aykur Rizespor", 10, ERenkler.YESIL_MAVI, "�brahim Turgut", "1953", databaseModel.takimDB);
		Takim takim11 =
				new Takim("Gaziantep FK", 11, ERenkler.CIFT_KIRMIZI, "Adil K�r�k��", "1969", databaseModel.takimDB);
		Takim takim12 =
				new Takim("�stanbul Ba�ak�ehir", 12, ERenkler.CIFT_KIRMIZI, "G�ksel G�m��da�", "2014",
				          databaseModel.takimDB);
		Takim takim13 =
				new Takim("MKE Ankarag�c�", 13, ERenkler.SIYAH_KIRMIZI, "Fatih Mert", "1910", databaseModel.takimDB);
		Takim takim14 =
				new Takim("Gen�lerbirli�i", 14, ERenkler.KIRMIZI_SIYAH, "Murat Cavcav", "1923", databaseModel.takimDB);
		Takim takim15 =
				new Takim("Kayserispor", 15, ERenkler.KIRMIZI_SIYAH, "Berna G�zba��", "1966", databaseModel.takimDB);
		Takim takim16 =
				new Takim("Yeni Malatyaspor", 16, ERenkler.YESIL_SIYAH, "Adil Gevrek", "1986", databaseModel.takimDB);
		Takim takim17 = new Takim("G�ztepe", 17, ERenkler.CIFT_KIRMIZI, "Mehmet Sepil", "1925", databaseModel.takimDB);
		Takim takim18 = new Takim("Denizlispor", 18, ERenkler.CIFT_KIRMIZI, "Ali �pek", "1966", databaseModel.takimDB);
		Takim takim19 =
				new Takim("Bodrum FK", 19, ERenkler.YESIL_BEYAZ, "Fikret �zt�rk", "1931", databaseModel.takimDB);
		
		
		Lig trendYolSuperLig =
				new Lig("Trendyol S�per Lig", "sezon1", EKume.TRENDYOL_SUPER_LIG, EBolge.TURKIYE, databaseModel.ligDB,
				        LocalDate.of(2024, 8, 20));
		
		trendYolSuperLig.getTakimIDList()
		                .addAll(List.of(takim1.getId(), takim2.getId(), takim3.getId(), takim4.getId(), takim5.getId()
				                , takim6.getId(), takim7.getId(), takim8.getId(), takim9.getId(), takim10.getId(),
				                        takim11.getId(), takim12.getId(), takim13.getId(), takim14.getId(),
				                        takim15.getId(), takim16.getId(), takim17.getId(), takim18.getId(),
				                        takim19.getId()));
		
		
		Map<Integer, String> takimIdToNameMap = new HashMap<>();
		takimIdToNameMap.put(takim1.getId(), takim1.getTakimIsim());
		takimIdToNameMap.put(takim2.getId(), takim2.getTakimIsim());
		takimIdToNameMap.put(takim3.getId(), takim3.getTakimIsim());
		takimIdToNameMap.put(takim4.getId(), takim4.getTakimIsim());
		takimIdToNameMap.put(takim5.getId(), takim5.getTakimIsim());
		takimIdToNameMap.put(takim6.getId(), takim6.getTakimIsim());
		takimIdToNameMap.put(takim7.getId(), takim7.getTakimIsim());
		takimIdToNameMap.put(takim8.getId(), takim8.getTakimIsim());
		takimIdToNameMap.put(takim9.getId(), takim9.getTakimIsim());
		takimIdToNameMap.put(takim10.getId(), takim10.getTakimIsim());
		takimIdToNameMap.put(takim11.getId(), takim11.getTakimIsim());
		takimIdToNameMap.put(takim12.getId(), takim12.getTakimIsim());
		takimIdToNameMap.put(takim13.getId(), takim13.getTakimIsim());
		takimIdToNameMap.put(takim14.getId(), takim14.getTakimIsim());
		takimIdToNameMap.put(takim15.getId(), takim15.getTakimIsim());
		takimIdToNameMap.put(takim16.getId(), takim16.getTakimIsim());
		takimIdToNameMap.put(takim17.getId(), takim17.getTakimIsim());
		takimIdToNameMap.put(takim18.getId(), takim18.getTakimIsim());
		takimIdToNameMap.put(takim19.getId(), takim19.getTakimIsim());
		
		
		FiksturGenerator fiksturGenerator =
				new FiksturGenerator(trendYolSuperLig.getTakimIDList(), LocalDate.of(2024, 8, 20), takimIdToNameMap);
		fiksturGenerator.generateFikstur();
		
		fiksturGenerator.puanTablosunuGuncelle();
		fiksturGenerator.puanTablosunuYazdir();
	}
	
//	public void macSonucuIsle(Istatistik evsahibiIstatistik, Istatistik misafirIstatistik, int evsahibiGol,
//	                          int misafirGol) {
//		puanTablosu = new HashMap<>();
//		evsahibiIstatistik.setAtilanGol(evsahibiIstatistik.getAtilanGol() + evsahibiGol);
//		misafirIstatistik.setAtilanGol(misafirIstatistik.getAtilanGol() + misafirGol);
//
//		if (evsahibiGol > misafirGol) {
//
//			evsahibiIstatistik.setGalibiyet(evsahibiIstatistik.getGalibiyet() + 1);
//			misafirIstatistik.setMaglubiyet(misafirIstatistik.getMaglubiyet() + 1);
//		}
//		else if (evsahibiGol < misafirGol) {
//			misafirIstatistik.setGalibiyet(misafirIstatistik.getGalibiyet() + 1);
//			evsahibiIstatistik.setMaglubiyet(evsahibiIstatistik.getMaglubiyet() + 1);
//		}
//		else {
//			evsahibiIstatistik.setBeraberlik(evsahibiIstatistik.getBeraberlik() + 1);
//			misafirIstatistik.setBeraberlik(misafirIstatistik.getBeraberlik() + 1);
//		}
//		databaseModel.istatistikDB.update(evsahibiIstatistik);
//		databaseModel.istatistikDB.update(misafirIstatistik);
//
//		puanTablosu.put(evsahibiIstatistik.getTakimID(), puanHesapla(evsahibiIstatistik));
//		puanTablosu.put(misafirIstatistik.getTakimID(), puanHesapla(misafirIstatistik));
//	}
//
//	private int puanHesapla(Istatistik istatistik) {
//		return istatistik.getGalibiyet() * 3 + istatistik.getBeraberlik();
//	}
	
//	public List<Musabaka> macYaptir(List<Integer[]> fikstur, Lig lig, DatabaseModel databaseModel) {
//		List<Musabaka> musabakaListesi = new ArrayList<>();
//		List<Integer> takimIDListesi = lig.getTakimIDList();
//		for (Integer[] item : fikstur) {
//			Musabaka musabaka = new Musabaka(databaseModel);
//			if (item[0] < takimIDListesi.size() && item[1] < takimIDListesi.size()) {
//				musabaka.setEvSahibiID(takimIDListesi.get(item[0]));
//				musabaka.setMisafirTakimID(takimIDListesi.get(item[1]));
//			}
//		}
//		return musabakaListesi;
//	}
	
//	public static void generateMusabakaVeFikstur(DatabaseModel databaseModel,Lig lig){
//		FiksturGenerator fiksturGenerator = new FiksturGenerator();
//		int takimSayisi = lig.getTakimIDList().size();
//		int matchesPerWeek = takimSayisi/2;
//
//		List<Integer[]> idIleFiksturListesi = fiksturGenerator.generateFikstur();
//
//		List<Musabaka> matches = macYaptir(databaseModel, idIleFiksturListesi, lig);//Mac nesnesi yarattigimiz yer.
//
//		gunleriAta(lig,musabakalar);
//	}
	
}