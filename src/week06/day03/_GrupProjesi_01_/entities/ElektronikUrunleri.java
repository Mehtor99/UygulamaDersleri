package week06.day03._GrupProjesi_01_.entities;

import week06.day03._GrupProjesi_01_.utilities.enums.ECihazTipi;
import week06.day03._GrupProjesi_01_.utilities.enums.EKategori;

public class ElektronikUrunleri extends Urun{
	
	private Integer pilOmru;
	private Double calismaVoltaji;
	private ECihazTipi cihazTipi;
	
	public ElektronikUrunleri(String ad, Double fiyat, String aciklama, EKategori kategori, Integer adet, Integer pilOmru, Double calismaVoltaji, ECihazTipi cihazTipi) {
		super(ad, fiyat, aciklama, kategori, adet);
		this.pilOmru = pilOmru;
		this.calismaVoltaji = calismaVoltaji;
		this.cihazTipi = cihazTipi;
	}
	
	public Integer getPilOmru() {
		return pilOmru;
	}
	
	public void setPilOmru(Integer pilOmru) {
		this.pilOmru = pilOmru;
	}
	
	public Double getCalismaVoltaji() {
		return calismaVoltaji;
	}
	
	public void setCalismaVoltaji(Double calismaVoltaji) {
		this.calismaVoltaji = calismaVoltaji;
	}
	
	
	@Override
	public String toString() {
		return super.ozetBilgileri();
	}
	
	@Override
	public String urunDetayBilgisi() {
		return super.urunDetayBilgisi()+" pilOmru :"+getPilOmru()+" calismaVoltajý : "+getCalismaVoltaji();
	}
}