package week06.day03._GrupProjesi_01_;

import java.util.ArrayList;
import java.util.UUID;

public class Sepet {
	private String sepetId;
	ArrayList<Urun> sepetList = new ArrayList<>();
	
	public Sepet() {
		this.sepetList = new ArrayList();
		this.sepetId = UUID.randomUUID().toString();
	}
	
	public ArrayList<Urun> sepeteUrunEkle(Urun urun){
		sepetList.add(urun);
		return sepetList;
	}
	
	public ArrayList<Urun> sepettekiUrunleriListele(){
		double toplam =0;
		for (int i = 0; i <sepetList.size() ; i++) {
			System.out.println(sepetList.get(i));
			toplam += sepetList.get(i).getFiyat();
			System.out.println("Toplam Fiyat: "+toplam);
		}
		return sepetList;
	}
	
}