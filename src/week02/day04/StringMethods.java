package week02.day04;
//string işlevsellikleri
public class StringMethods {
	public static void main(String[] args) {
		String value = " Merhaba Dunya ";
		String value2 = "Merhaba Dunya";
		System.out.println(value.charAt(2));
		System.out.println(value.trim());   //white spaceleri siliyor.
		System.out.println(value.charAt(2));
		System.out.println(value2.length());
		System.out.println(value2.indexOf('a')); // a harfinin ilk görüldüğü indeki verir.
		System.out.println(value2.lastIndexOf('a')); //a harfinin görüldüğü son indexi verir.
		System.out.println(value2.substring(5)); //5.karakterden itibaren yazdırıyor. 5. dahil
		System.out.println(value2.substring(0,5));  // 0.indexten 5.indexe kadar olan kısmı getirir.5 dahil değil
		System.out.println(value.equals(value2));    //eşit mi diye bakar ve true false yazdirir
		
		System.out.println(value == " Merhaba Dunya ");
		// value degiskeninin degeri ile ham (raw) " Merhaba Dunya " degerini karsilastiriyor.
		// Farkli bir string degiskeni icerisinde olmayan " Merhaba Dunya " text'i heap'te herhangi bir nesneye karsilik gelmiyor.
		// doyisiyla value degiskeninin degerini aldığı adres, aslında " Merhaba Dunya " yazısının ta kendisi.
		// o yüzden true döner.
		
		System.out.println(value.trim() == value2);   //referansına göre bakıyor.
		System.out.println(value.trim().equals(value2));   //değerine göre bakıyor.
		
		value = value.trim();
		System.out.println(value == value2);
		;
		
	}
}