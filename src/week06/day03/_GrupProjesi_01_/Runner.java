package week06.day03._GrupProjesi_01_;

import java.util.Scanner;

public class Runner {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		GiyimUrunleri urun1 = new GiyimUrunleri("Tisort", 50d, "Aciklama", EKategori.GIYIM, 2, EBeden.L,
		                                        ERenk.KIRMIZI);
		GiyimUrunleri urun2 = new GiyimUrunleri("Pant", 150d, "Aciklama", EKategori.GIYIM, 1, EBeden.L, ERenk.SIYAH);
		GiyimUrunleri urun3 = new GiyimUrunleri("Gomlek", 350d, "Aciklama", EKategori.GIYIM, 3, EBeden.XL, ERenk.MAVI);
		Sepet sepet = new Sepet();
		Urun.urunArrayList.forEach(System.out::println);
		
		sepet.sepeteUrunEkle(urun1);
		sepet.sepeteUrunEkle(urun2);
		System.out.println("###### sepetteki urunler #####");
		sepet.sepettekiUrunleriListele();
		
		
	}
	
	public static void menu() {
		int secim = -1;
		do {
			System.out.println("### SEPET UYGULAMASÝ ###");
			System.out.println("1- Urunleri Listele");
			System.out.println("2- Sepete Urun Ekle");
			System.out.println("3- Sepeti goruntule");
			System.out.println("4- Sepetten Urun Cikar");
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
		switch(secim){
			case 1:{
				Urun.urunArrayList.forEach(System.out::println);
				break;
			}
			case 2:{
				eklenecekUrunKontrol();
				break;
			}
			case 3:{
				
				break;
			}
			case 4:{
				
				break;
			}
			default:{
				System.out.println("Lutfen gecerli bir secim yapiniz.");
				break;
			}
		}
		return secim;
	}
	
	private static Urun eklenecekUrunKontrol(Urun urun) {
		Urun.urunArrayList.forEach(System.out::println);
		System.out.println("Sepete eklemek istediðiniz urunun id degerini giriniz: ");
		int id = scanner.nextInt();
		if (id<=0){
			System.out.println("Lutfen gecerli bir Id giriniz!");
		}
		for (int i = 0; i <Urun.urunArrayList.size() ; i++) {
			if (id==Urun.urunArrayList.get(i).getUrunID()){
				//urun bilgileri yazdir
				//Adet miktari al.
				//adet kontrolü yap.
				//Adet saðlanýyorsa sepete ekle.
			}
		}
		return null;
	}
}