package collection_framework.ornekler;

import java.util.*;

/*1)(queue ornek) Ýçerisinde String isimler tutacak bir queue tanýmlayalim. adi biletKuyrugu olsun.
kuyruga 10 kisi ekleyelim ve biletSatis isimli bir metotta 1-15 arasý random sayida kisiye biletleri dagitalim.

Biletini alanlar için; ".. biletini aldý" çýktýsý verelim.
Bilet bittiginde : "Bilet kalmadi..." ciktisi verelim.

Biletini alamayanlari yazdiralim. "... bilet alamadi..."

 */
public class QueueOrnek01 {
	
	static Queue<String> biletSirasi = new LinkedList<>();
	static Random random = new Random();
	
	public static void main(String[] args) {
		sirayaKisiekle();
		biletSatis();
		
		
	}
	
	private static void biletSatis() {
		int biletSayisi =random.nextInt(1,15);
		int satilanBilet=0;
		do{
			System.out.println(biletSirasi.poll() + " biletini aldi.");
			satilanBilet++;
			biletSayisi--;
			if (biletSayisi>0 && biletSirasi.isEmpty()){
				System.out.println("Toplam: "+satilanBilet+" adet bilet satildi... Kalan Bilet "+biletSayisi );
				break;
			}
			else if (biletSayisi == 0) {
				System.out.println("Toplam: "+satilanBilet+" adet bilet satildi... Stoklar tukenmistir...");
				break;
			}
		}while (!biletSirasi.isEmpty());
		
	}
	
	private static void sirayaKisiekle() {
		biletSirasi.add("Alex");
		biletSirasi.add("Alperen");
		biletSirasi.add("Harun");
		biletSirasi.add("Emirhan");
		biletSirasi.add("Mehmet");
		biletSirasi.add("Ahmet");
		biletSirasi.add("Selin");
		biletSirasi.add("Evrim");
		biletSirasi.add("Burak");
		biletSirasi.add("Baris");
	}
}