package week04.day03;

class KullaniciDB {     //default class yapt�k.ba�ka packageden eri�ilemesin diye
	
	static KullaniciOzelListe kullaniciOzelListe = new KullaniciOzelListe();
	
	
	static Kullanici save(Kullanici kullanici){
		return kullaniciOzelListe.add(kullanici);
	}
	
	static Kullanici[] findAll(){
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		for(Kullanici kullanici : kullaniciDizisi){
			System.out.println(kullanici);
		}
		return kullaniciDizisi;
	}
	
	
}