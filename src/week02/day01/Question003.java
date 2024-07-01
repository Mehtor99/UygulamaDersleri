package week02.day01;

public class Question003 {
	
	 /*
    3- İki tane string değişken, (isim ve soyisim), bu değişkenleri yazdıralım.

    3.1- bu değişkenleri tek bir çıktıda alt alta yazdıralım.

    3.2- a ve b karakterlerinin değerini ve karakterler değer toplamını yazdıralım.
    * */
	
	public static void main(String[] args) {
		//3
		String name,surname;
		name = "Mehmet";
		surname = "ERTOP";
		
		System.out.println(name+" "+surname);
		
		//3.1
		System.out.println(name+ "\n" +surname);  //    \n  alt satira gecmemize olanak saglar.
		System.out.println("Isim\t\tSoyisim");    //    \t  bir tab boşluk bırakır.
		System.out.println(name+"\t"+surname);
		
		//3.2
		char a = 'a' , b = 'b';
		System.out.println((int) a);
		System.out.println((int) b);
		char aa = (char) (a-32);
		System.out.println(aa);         // harfi buyutmek icin char degerinden 32 cıkarabiliriz.
		System.out.println("Karakterler Toplami: "+(int)(a+b));
		
	}
}