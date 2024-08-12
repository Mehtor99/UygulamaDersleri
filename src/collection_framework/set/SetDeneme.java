package collection_framework.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDeneme {
	public static void main(String[] args) {
		Set<Set<Integer>> setlerSeti = new HashSet<>();
		Set<Integer> set1 = new HashSet<>(Set.of(2,3));
		Set<Integer> set2 = new HashSet<>(Set.of(2,3));
		setlerSeti.add(set1);
		setlerSeti.add(set2);
		System.out.println(setlerSeti);   //ayn� eleman olarak g�rd� ve eklemedi i�ine eklenen
		                                  // setlerin elemanlar� farkl� olsayd� ikisini de eklerdi
		
		List<List<List<Integer>>> listOfListOfList = new ArrayList<>();
		Set<Set<String>> okulOgrenci = new HashSet<>();
		
		okulOgrenci.add(Set.of("Mehmet", "Alperen", "Ali", "Ayse"));   // java sinifi ogrencileri.
		okulOgrenci.add(Set.of("Ayse", "Fatma", "Ahmet", "Mehmet"));
		System.out.println(okulOgrenci);
	}
}