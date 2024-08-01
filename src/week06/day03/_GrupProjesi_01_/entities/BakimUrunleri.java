package week06.day03._GrupProjesi_01_.entities;

import week06.day03._GrupProjesi_01_.utilities.enums.EBakimUrunleriTipler;
import week06.day03._GrupProjesi_01_.utilities.enums.EKategori;

public class BakimUrunleri extends Urun {
	
	private EBakimUrunleriTipler tipler;
	
	public BakimUrunleri(String ad, Double fiyat, String aciklama, EKategori kategori, Integer adet,
	                     EBakimUrunleriTipler tipler) {
		super(ad, fiyat, aciklama, kategori, adet);
		this.tipler = tipler;
	}
	
	public EBakimUrunleriTipler getTipler() {
		return tipler;
	}
	
	public void setTipler(EBakimUrunleriTipler tipler) {
		this.tipler = tipler;
	}
	
	@Override
	public String toString() {
		return super.ozetBilgileri();
	}
	
	public String urunDetayBilgisi() {
		return super.urunDetayBilgisi() + " tipler : " + getTipler();
	}
}