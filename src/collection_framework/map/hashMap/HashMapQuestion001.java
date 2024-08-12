package collection_framework.map.hashMap;

import java.util.HashMap;
import java.util.Map;

//çok katmanlý mapler
public class HashMapQuestion001 {
	public static void main(String[] args) {
		//2 katmanli map
		Map<Integer,Map<Integer,String>> integerMapMap = new HashMap<>();
		Map<Integer,String> integerStringMap = new HashMap<>();
		integerStringMap.put(1,"Merhaba");
		integerStringMap.put(2,"Dunya");
		integerStringMap.put(3,"Ben");
		integerStringMap.put(4,"Uzaydan");
		integerStringMap.put(5,"Geliyorum.");
		
		Map<Integer,String> integerStringMap2 = new HashMap<>();
		integerStringMap2.put(1,"Ne");
		integerStringMap2.put(2,"Mutlu");
		integerStringMap2.put(3,"Turkum");
		integerStringMap2.put(4,"Diyene");
		
		integerMapMap.put(1,integerStringMap);
		integerMapMap.put(2,integerStringMap2);
		
		// Lambda Expression(->) ifadeleri kullanarak Map'leri dolaþma
		integerMapMap.forEach((upperKey,lowerMap) -> {
			System.out.println("key: "+upperKey);
			System.out.println("Value: "+lowerMap);
		  	lowerMap.forEach((innerKey,innerValue) -> {
			    System.out.println("key: "+innerKey);
			    System.out.println("value: "+innerValue);
		    });
		});
		
		//Klasik foreach yöntemi kullanarak Mapleri dolaþmma
		/*for (Map.Entry<Integer,Map<Integer,String>> upperMap : integerMapMap.entrySet()){
			System.out.println("Key: "+upperMap.getKey());
			System.out.println("Value: "+upperMap.getValue());
			for (Map.Entry<Integer,String> lowerMap:upperMap.getValue().entrySet()){
				System.out.println("Inner Key: "+ lowerMap.getKey());
				System.out.println("Inner Value: "+lowerMap.getValue());
			}
		}*/
		
		
		
		System.out.println("\n\n##################################################");
		System.out.println("######### 3 katmanli Map  #########\n");

		Map<String,Map<Integer,Map<Integer,String>>> okulSinifOgrenciMap = new HashMap<>();  //3. katman

		Map<Integer,Map<Integer,String>> sinifOgrenciMap = new HashMap<>();     //2 katman ,3.katmanýn 1.valuesi

		Map<Integer,String> ogrenciMap = new HashMap<>();     //1. katman , 2.katmanýn ilk valuesi
		ogrenciMap.put(1,"Ali");
		ogrenciMap.put(2,"Ahmet");
		ogrenciMap.put(3,"Sena");
		ogrenciMap.put(4,"Sami");
		ogrenciMap.put(5,"Behzat");

		Map<Integer,String> ogrenciMap2 = new HashMap<>();     //1. katman, 2.katmanýn ikinci valuesi
		ogrenciMap2.put(1,"Adnan");
		ogrenciMap2.put(2,"Arslan");
		ogrenciMap2.put(3,"Selim");
		ogrenciMap2.put(4,"Salim");
		ogrenciMap2.put(5,"Betul");

		sinifOgrenciMap.put(1,ogrenciMap);       //2.katmana 1.katman entrylerini girdim
		sinifOgrenciMap.put(2,ogrenciMap2);
		//////////

		Map<Integer,Map<Integer,String>> sinifOgrenciMap2= new HashMap<>();     //2 katman ,3.katmanýn 2.valuesi

		Map<Integer,String> ogrenciMap3 = new HashMap<>();     //1. katman , 2.katmanýn ilk valuesi
		ogrenciMap3.put(1,"Atilla");
		ogrenciMap3.put(2,"Ahmet");
		ogrenciMap3.put(3,"Ayse");
		ogrenciMap3.put(4,"Mehmet");
		ogrenciMap3.put(5,"Elif");

		Map<Integer,String> ogrenciMap4 = new HashMap<>();     //1. katman, 2.katmanýn ikinci valuesi
		ogrenciMap4.put(1,"Esra");
		ogrenciMap4.put(2,"Riza");
		ogrenciMap4.put(3,"Melike");
		ogrenciMap4.put(4,"Tuna");
		ogrenciMap4.put(5,"Bartu");

		sinifOgrenciMap2.put(1,ogrenciMap3);            //2.katmana 1.katman entrylerini girdim
		sinifOgrenciMap2.put(2,ogrenciMap4);
		/////////////
	    okulSinifOgrenciMap.put("ITU",sinifOgrenciMap);     //3.katmana 2.katman entrylerinin iksinide ekledim.
		okulSinifOgrenciMap.put("SDU",sinifOgrenciMap2);

		for (Map.Entry<String,Map<Integer,Map<Integer,String>>> katman3 : okulSinifOgrenciMap.entrySet()){
			System.out.println("katman3Key: "+katman3.getKey());
			System.out.println("katman3Value: "+katman3.getValue());
			for (Map.Entry<Integer,Map<Integer,String>> katman2 : katman3.getValue().entrySet()){
				System.out.println("katman2Key: "+ katman2.getKey());
				System.out.println("katman2Value: "+ katman2.getValue());
				for(Map.Entry<Integer,String> katman1 : katman2.getValue().entrySet()){
					System.out.println("katman1Key: "+katman1.getKey());
					System.out.println("katman1Value: "+katman1.getValue());
				}
			}
		}
		
		/*for (Map.Entry<String, Map<Integer, Map<Integer, String>>> katman3 : okulSinifOgrenciMap.entrySet()) {
			System.out.println("katman3Key: " + katman3.getKey());
			for (Map.Entry<Integer, Map<Integer, String>> katman2 : katman3.getValue().entrySet()) {
				System.out.println("  katman2Key: " + katman2.getKey());
				for (Map.Entry<Integer, String> katman1 : katman2.getValue().entrySet()) {
					System.out.println("katman1Key: " + katman1.getKey() );
					System.out.println("katman1Value: "+ katman1.getValue());
				}
			}
		}*/
		
		
		
		
	}
}