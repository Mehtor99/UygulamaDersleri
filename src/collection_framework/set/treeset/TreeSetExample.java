package collection_framework.set.treeset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		Set<Integer> sayiTreeSet = new TreeSet<>();
		sayiTreeSet.addAll(Set.of(1, -10, 20, 30, 3, -13, 100, 60, -6));
		System.out.println("Set.of(1,-10,20,30,3,-13,100,60,-6)");
		System.out.println("TreeSet: "+sayiTreeSet);
		System.out.println("Verileri dogal siralama duzenine göre yerlestirir.");
		System.out.println("null deger eklenmesi NullPointerException ile sonuclanacaktir, " +
				"cunku dogal siralama yapabilmek icin surekli kiyas halindedir. null olan bir degeri kiyaslayamam");
//		sayiTreeSet.add(null);
//		System.out.println(sayiTreeSet);
//		sayiTreeSet.add(null);
		
		System.out.println(Integer.compare(10, 20));
	}
}