package collection_framework.ornekler;

import java.util.*;

/*
3- Bir kelime içerisindeki harflerin kaç kez tekrar ettiðini bulmanýzý saðlayacak bir program yazalým.
Kullanýcýdan bir kelime girmesini isteyin.
Kullanýcýnýn girdiði bu kelime, harf frekanslarýný bulacaðýnýz kelime olacak.
"merhaba" String'i için örnek çýktý aþaðýdaki gibi olmalýdýr;
m = 1; e = 1; r = 1; h = 1; a = 2; b = 1;
uygulama case sensitive olmamalýdýr.
 */
public class MapOrnek01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] harfler = new char[]{};
		
		System.out.println("Harf frekanslarini ogrenmek istediginiz metni giriniz: ");
		String metin = sc.nextLine();
		harfler =metin.toCharArray();
		
		Map<Character, Integer> harfFrekansMap = new LinkedHashMap<>(); //sonuçta harfler sirali gelsin diye linked
		// kullandým
		for (Character harf : harfler) {
			harfFrekansMap.put(harf, harfFrekansMap.getOrDefault(harf, 0) + 1);
			//getOrDefault kelime zaten varsa 1 artýrýr yoksa 0 alýr ve onu 1 yapar.
		}
		for (Map.Entry<Character, Integer> entry : harfFrekansMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	
}