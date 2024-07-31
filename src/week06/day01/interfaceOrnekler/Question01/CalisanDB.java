package week06.day01.interfaceOrnekler.Question01;

import java.util.ArrayList;
import java.util.List;

public class CalisanDB {
	static ArrayList<Calisan> calisanlar=new ArrayList<>();
	
	static void list(){
		calisanlar.forEach(System.out::println);
	}
	
	static void listMaasUnvanaGore(){
		for (Calisan calisan:calisanlar){
			if (calisan instanceof MaasaGoreUnvanAlabilir){
				System.out.println(calisan);
			}
		}
	}

	static void listmaasUnvanaGoreDegil(){
		for (Calisan calisan:calisanlar){
			if(!(calisan instanceof MaasaGoreUnvanAlabilir) && !(calisan instanceof SahaCalismasiYapabilir)){
				System.out.println(calisan);
			}
		}
	}
}