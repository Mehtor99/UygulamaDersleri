package collection_framework.ornekler;

import java.util.HashSet;

/*
1- Bir film uygulamas� i�in String kategori tuttu�umuzu d���n�n.
   Kullan�c�dan kategori al�p bu kategoriyi bir collection yap�s�na ekleyece�imiz bir metot yazal�m.
   Bu metot, e�er kategori daha �nce eklenmemi�se ba�ar�yla eklendi�ine dair bir mesaj d�nd�rmelidir.
   E�er kategori daha �nce eklenmi�se, bununla ilgili bir uyar� mesaj� d�nd�rmelidir.
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