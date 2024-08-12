package collection_framework.ornekler.odevSansliNumara;

import java.util.*;
import java.util.stream.Collectors;

public class CaseSansliNumaraBulma {
	static List<Integer> sayilar = new ArrayList<>();
	static Random rand = new Random();
	public static void main(String[] args) {
		
		for (int i = 0; i < 10000; i++) {
			sayilar.add(rand.nextInt(1, 100));
			//System.out.println(sayilar);
		}
		
		Map<Integer, Integer> sayiFrekansMap = new LinkedHashMap<>();
		for (Integer sayi : sayilar) {
			sayiFrekansMap.put(sayi, sayiFrekansMap.getOrDefault(sayi, 0) + 1);
		}
		System.out.println("\nUretilen sayilar ve tekrar saayilari: ");
		for (Map.Entry<Integer, Integer> entry : sayiFrekansMap.entrySet()) {
			System.out.println("sayi: "+entry.getKey() + "  :  " + "Adet: "+entry.getValue());
		}
		
		//Liste oluþturma:tekrar sayilarý kadar o sayýyý ekledik
		List<Integer> sayilarList = new ArrayList<>();
		for (Map.Entry<Integer,Integer> entry : sayiFrekansMap.entrySet() ) {
			for (int i = 0; i <entry.getValue() ; i++) {
				sayilarList.add(entry.getKey());
			}
		}
		//Listeden 10 adet sayi seçmek ,ayný sayi 2 adet kullanýlamamali
		List <Integer> sansliSayiListesi = new ArrayList<>();
		while(sansliSayiListesi.size()<10){
			int sansliIndex = rand.nextInt(sayilarList.size());
			int sansliSayi = sayilarList.get(sansliIndex);
			if (!sansliSayiListesi.contains(sansliSayi)){
				sansliSayiListesi.add(sansliSayi);
			}
			
		}
		System.out.println("Sansli sayilar Listesi: "+sansliSayiListesi);
		
		System.out.println("50den buyuk sansli sayilar: ");
		//4.a
		sansliSayiListesi.stream()
				.filter(sayi -> sayi>50)
				.forEach(System.out::println);
		
		//4.b
		List<Integer> ellidenBuyuksansliSayilar =sansliSayiListesi.stream()
				.filter(sayi-> sayi>50)
				.collect(Collectors.toList());
		
		//4.c  tüm sansli sayilar toplami   //optional ile
		Optional <Integer> sanslisayilarToplami = sansliSayiListesi.stream()
				.reduce(Integer::sum);
		System.out.println("sansli sayilar toplami :"+sanslisayilarToplami);
		
		//4.d  50den buyuk sansli sayilar toplami  //optional da kullanýldý
		Optional<Integer> ellidenBuyuksansliSayilarToplami = sansliSayiListesi.stream()
		                 .filter(sayi -> sayi>50)
				.reduce(Integer::sum);
		System.out.println("50den buyuk sansli sayilar toplami :"+ellidenBuyuksansliSayilarToplami);
		
		
		
	}
}