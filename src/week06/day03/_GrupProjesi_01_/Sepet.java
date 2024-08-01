package week06.day03._GrupProjesi_01_;

import week06.day03._GrupProjesi_01_.entities.Urun;

import java.util.ArrayList;

public class Sepet {
	private static Integer sepetIdCount =0;
	private Integer sepetId;
	ArrayList<Urun> sepetList = new ArrayList<>();
	ArrayList<Urun>uniqueUrunler;
	ArrayList<Integer>adet;
	
	public Sepet() {
		this.sepetList = new ArrayList();
		this.sepetId = ++sepetIdCount;
		this.adet =new ArrayList<>();
		this.uniqueUrunler =new ArrayList<>();
	}
	
	public ArrayList<Urun> sepettenUrunCikart(Urun urun){
		if(sepetList.remove(urun)) {
			int index = uniqueUrunler.indexOf(urun);
			if (index != -1) {
				int mevcutAdet = adet.get(index);
				if (mevcutAdet > 1) {
					adet.set(index, mevcutAdet - 1);
				} else {
					uniqueUrunler.remove(index);
					adet.remove(index);
				}
			}
		}
		return sepetList;
	}
	
	public ArrayList<Urun> sepeteUrunEkle(Urun urun){
		sepetList.add(urun);
		return sepetList;
	}
	
	public ArrayList<Urun> sepettekiUrunleriListele() {
		uniqueUrunler.clear();
		adet.clear();
		
		for (Urun urun : sepetList) {
			if (uniqueUrunler.contains(urun)) {
				int index = uniqueUrunler.indexOf(urun);
				adet.set(index, adet.get(index) + 1);
			} else {
				uniqueUrunler.add(urun);
				adet.add(1);
			}
		}
		
		double toplam = 0;
		for (int i = 0; i < uniqueUrunler.size(); i++) {
			Urun urun = uniqueUrunler.get(i);
			int urunlerAdet = adet.get(i);
			double fiyat = urun.getFiyat();
			System.out.println("urunAd : " + urun.getAd() + " urun adet : " + urunlerAdet + " birim fiyat : " + fiyat);
			toplam += urun.getFiyat() * urunlerAdet;
		}
		System.out.println(" Toplam fiyat : " + toplam);
		return sepetList;
	}
	public void sepetiOnayla(){
		for (Urun urun : sepetList){
			urun.setAdet(urun.getAdet()-1);
		}
		sepetList.clear();
		System.out.println("Sepet onaylandi satin alim gerceklesti.");
	}
	
}