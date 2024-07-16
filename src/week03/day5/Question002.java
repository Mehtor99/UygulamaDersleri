package week03.day5;

import java.util.Arrays;

/*
2-
String[] renk = {"Ma�a", "Kupa", "Karo", "Sinek"};
String[] sayi = {"2","3","4","5","6", "7", "8", "9", "10", "J", "Q", "K", "A"};

Yukar�daki dizilerden 52'lik bir iskambil destesi �retelim. (Yeni bir dizide)

�rnek Deste Eleman ��kt�s�.
"Ma�a 6", "Sinek J"

Desteyi �rettikten Sonra Men�'den oyun se�elim:

Papaz Ka�t� i�in ; Kupa papaz, Sinek papaz, Karo papaz kartlar�n� desteden ��karal�m. Ve destenin ��kt�s�n� alal�m.

Altm�� Alt� i�in: Her renkte 9, 10, Vale, Dam, Papa ve As d���ndaki b�t�n elemanlar� desteden ��karal�m.
 */
public class Question002 {
	public static void main(String[] args) {
		String[] renk = {"Ma�a", "Kupa", "Karo", "Sinek"};
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
	
}//papaz ka�t�ya kadar yapt�m 66 y� tamamlamad�m.