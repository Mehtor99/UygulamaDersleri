package collection_framework.ornekler;
/*
2-  Disaridan bir String deger alacagiz. Bu String degerdeki her bir harfi kontrol edecegiz.
Tekrar edenleri bir sete ,tekrar etmeyenleri ise baska bir sete atalým..
 */
import java.util.*;

public class SetOrnek02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Character> tekrarliHarfler = new HashSet<>();
		HashSet<Character> tekrarsizHarfler = new HashSet<>();
		System.out.println("Bir metin giriniz: ");
		String metin = sc.nextLine();
		
		for (int i = 0; i < metin.length(); i++) {
			if (!tekrarsizHarfler.add(metin.charAt(i))) {
				tekrarliHarfler.add(metin.charAt(i));
			}
		}
		tekrarsizHarfler.removeAll(tekrarliHarfler);
		System.out.println("tekrarli harfler: "+tekrarliHarfler);
		System.out.println("tekrarsiz harfler: "+tekrarsizHarfler);
		
	}
}