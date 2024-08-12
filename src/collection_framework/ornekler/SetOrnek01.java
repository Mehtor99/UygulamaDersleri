package collection_framework.ornekler;

import java.util.HashSet;

/*
1- Bir film uygulamasý için String kategori tuttuðumuzu düþünün.
   Kullanýcýdan kategori alýp bu kategoriyi bir collection yapýsýna ekleyeceðimiz bir metot yazalým.
   Bu metot, eðer kategori daha önce eklenmemiþse baþarýyla eklendiðine dair bir mesaj döndürmelidir.
   Eðer kategori daha önce eklenmiþse, bununla ilgili bir uyarý mesajý döndürmelidir.
 */
public class SetOrnek01 {
	static HashSet<String> kategoriList = new HashSet<>();
	public static void main(String[] args) {
		
		kategoriList.add("Aksiyon");
		
		String kategori2 = "Fantastik";
		kategoriKonrol(kategori2);
		kategoriKonrol("Aksiyon");
		
		kategoriList.forEach(System.out::println);
	}
	
	private static void kategoriKonrol(String kategori) {
		if (kategoriList.add(kategori)){
			System.out.println(kategori + " kategorilere basariyla eklendi");
		}else{
			System.out.println(kategori + " Kategorisi zaten mevcut.");
		}
		
	}
	
}