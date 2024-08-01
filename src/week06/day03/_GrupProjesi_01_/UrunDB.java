package week06.day03._GrupProjesi_01_;

import week06.day03._GrupProjesi_01_.entities.Urun;

public class UrunDB {
	
	public static Urun findById(int id){
		for (Urun urun : Urun.urunArrayList) {
			if(urun.getUrunID() == id){
				return urun;
			}
		}
		return null;
	}
}