package week03.day5;

import java.util.Arrays;

/*
2-
String[] renk = {"Maça", "Kupa", "Karo", "Sinek"};
String[] sayi = {"2","3","4","5","6", "7", "8", "9", "10", "J", "Q", "K", "A"};

Yukarýdaki dizilerden 52'lik bir iskambil destesi üretelim. (Yeni bir dizide)

Örnek Deste Eleman Çýktýsý.
"Maça 6", "Sinek J"

Desteyi Ürettikten Sonra Menü'den oyun seçelim:

Papaz Kaçtý için ; Kupa papaz, Sinek papaz, Karo papaz kartlarýný desteden çýkaralým. Ve destenin çýktýsýný alalým.

Altmýþ Altý için: Her renkte 9, 10, Vale, Dam, Papa ve As dýþýndaki bütün elemanlarý desteden çýkaralým.
 */
public class Question002 {
	public static void main(String[] args) {
		String[] renk = {"Maça", "Kupa", "Karo", "Sinek"};
		String[] sayi = {"2","3","4","5","6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		
		String [] deste = desteOlustur(renk,sayi);
		
		String[] papazKacti = papazKacti(deste);
		System.out.println(Arrays.toString(papazKacti));
	}
	
	private static String[] desteOlustur (String[]renk,String[]sayi){
		String[] deste = new String[renk.length* sayi.length];
		int index =0;
		for (int i = 0; i < renk.length ; i++) {
			for (int j = 0; j < sayi.length ; j++) {
				deste[index] = renk[i]+" "+sayi[j];
				index++;
			}
		}
		return deste;
	}
	
	private static String[]papazKacti(String[] deste){
		String[] papazKacti = new String[deste.length-3];
		int index =0;
		for (String kart:deste){
			if (kart.equals("Karo K") || kart.equals("Kupa K") || kart.equals("Sinek K")){
				continue;
			}else{
				papazKacti[index] = kart;
				index++;
			}
		}
		return papazKacti;
	}
	
}//papaz kaçtýya kadar yaptým 66 yý tamamlamadým.