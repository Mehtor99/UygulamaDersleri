package collection_framework.ornekler;

import java.util.*;

/*
3- Bir kelime i�erisindeki harflerin ka� kez tekrar etti�ini bulman�z� sa�layacak bir program yazal�m.
Kullan�c�dan bir kelime girmesini isteyin.
Kullan�c�n�n girdi�i bu kelime, harf frekanslar�n� bulaca��n�z kelime olacak.
"merhaba" String'i i�in �rnek ��kt� a�a��daki gibi olmal�d�r;
m = 1; e = 1; r = 1; h = 1; a = 2; b = 1;
uygulama case sensitive olmamal�d�r.
 */
public class MapOrnek01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] harfler = new char[]{};
		
		System.out.println("Harf frekanslarini ogrenmek istediginiz metni giriniz: ");
		String metin = sc.nextLine();
		harfler =metin.toCharArray();
		
		Map<Character, Integer> harfFrekansMap = new LinkedHashMap<>(); //sonu�ta harfler sirali gelsin diye linked
		// kulland�m
		for (Character harf : harfler) {
			harfFrekansMap.put(harf, harfFrekansMap.getOrDefault(harf, 0) + 1);
			//getOrDefault kelime zaten varsa 1 art�r�r yoksa 0 al�r ve onu 1 yapar.
		}
		for (Map.Entry<Character, Integer> entry : harfFrekansMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	
}