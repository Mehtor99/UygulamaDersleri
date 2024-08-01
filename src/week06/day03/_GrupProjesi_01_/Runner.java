package week06.day03._GrupProjesi_01_;

import week06.day03._GrupProjesi_01_.entities.Urun;
import week06.day03._GrupProjesi_01_.utilities.DataGenerator;

import java.util.Scanner;

public class Runner {
	static Scanner scanner = new Scanner(System.in);
	static UrunDB urunDB = new UrunDB();
	static Sepet sepet = new Sepet();
	
	public static void main(String[] args) {
		
		
		DataGenerator.generateProducts();
		menu();
	}
	
	public static void menu() {
		int secim = -1;
		do {
			System.out.println("### SEPET UYGULAMASI ###");
			System.out.println("1- Urunleri Listele");
			System.out.println("2- Sepete Urun Ekle");
			System.out.println("3- Sepeti goruntule");
			System.out.println("4- Sepetten Urun Cikar");
			System.out.println("5- Sepeti onayla");
			System.out.print("Lutfen bir secim yapiniz : ");
			try {
				secim = scanner.nextInt();
			}
			catch (Exception e) {
				System.out.println("Gecerli bir secim yapiniz.");
			}
			finally {
				scanner.nextLine();
			}
			sepetFunctions(secim);
		} while (secim != 0);
	}
	
	private static int sepetFunctions(int secim) {
		switch (secim) {
			case 1: {
				Urun.urunArrayList.forEach(System.out::println);
				break;
			}
			case 2: {
				Urun.urunArrayList.forEach(System.out::println);
				System.out.println("Sepete eklemek istediğiniz urunun id degerini giriniz: ");
				int id = scanner.nextInt();
				eklenecekUrunKontrol(UrunDB.findById(id));
				break;
			}
			case 3: {
				sepet.sepettekiUrunleriListele();
				break;
			}
			case 4: {
				sepet.sepettekiUrunleriListele();
				System.out.println("Sepetten çıkartmak istediginiz urunun id degerini giriniz: ");
				int id = scanner.nextInt();
				silinecekUrunKontrolu(UrunDB.findById(id));
				break;
			}
			case 5: {
				sepet.sepetiOnayla();
			}
			case 0 : {
				System.out.println("Uygulama sonlandiriliyor...");
				break;
			}
			default: {
				System.out.println("Lutfen gecerli bir secim yapiniz.");
				break;
			}
		}
		return secim;
	}
	
	private static Urun silinecekUrunKontrolu(Urun urun) {
		System.out.print("Kac adet silmek istersiniz? ");
		int silinecekAdet = scanner.nextInt();
		
		// Sepette bu urunun adetini bulalım
		int sepetAdeti = 0;
		for (Urun u : sepet.sepetList) {
			if (u.getUrunID().equals(urun.getUrunID())) {
				sepetAdeti++;
			}
		}
		
		if (silinecekAdet <= sepetAdeti) {
			for (int i = 0; i < silinecekAdet; i++) {
				sepet.sepettenUrunCikart(urun);
			}
			urun.setAdet(urun.getAdet() + silinecekAdet);
			System.out.println(urun.getAd() + " adli urunden " + silinecekAdet + " adet sepetten cikarildi.");
			return urun;
		}
		else {
			for (int i = 0; i < sepetAdeti; i++) {
				sepet.sepettenUrunCikart(urun);
			}
			urun.setAdet(urun.getAdet() + sepetAdeti);
			System.out.println("Silmek istediginiz adetten daha az urun bulunuyor. Sepetteki urunlerin tamami " +
					                   "cikarildi.");
		}
		return null;
	}
	
	private static Urun eklenecekUrunKontrol(Urun urun) {
		while (true) {
			System.out.println(urun.urunDetayBilgisi());
			System.out.println("kac adet eklemek istersini : ");
			int adet = scanner.nextInt();
			if (adet > 0) {
				if (adet <= urun.getKategori().getSinir()) {
					if (adet <= urun.getAdet()) {
						for (int j = 0; j < adet; j++) {
							sepet.sepeteUrunEkle(urun);
						}
						//urun.setAdet(urun.getAdet() - adet);
						System.out.println(urun.getAd() + " adli urunden " + adet + " adet eklendi.");
						return urun;
					}
					else {
						System.out.println("Yeterli stok bulunamadi!!!");
					}
					
				}
				else {
					System.out.println("bu urunden en fazla " + urun.getKategori().getSinir() + " adet alinabilir.");
				}
			}
			else {
				System.out.println("Bir urunden en az 1 adet alınabilir.");
			}
		}
	}
}