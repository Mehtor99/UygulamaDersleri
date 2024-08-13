package uygulamalar.FutbolApp.entities;

import java.time.LocalDate;

public class Futbolcu extends BaseEntity {
	static int idCount = 0;
	
	private String isim;
	private String soyisim;
	private EMevki mevki;
	private LocalDate dogumTarihi;
	private String bonservisBedeli;
	private Integer takimId;
	
	public Futbolcu(String isim, String soyisim, EMevki mevki, LocalDate dogumTarihi, String bonservisBedeli) {
		this.isim = isim;
		this.soyisim = soyisim;
		this.mevki = mevki;
		this.dogumTarihi = dogumTarihi;
		this.bonservisBedeli = bonservisBedeli;
	}
	
	public static int getIdCount() {
		return idCount;
	}
	
	public static void setIdCount(int idCount) {
		Futbolcu.idCount = idCount;
	}
	
	public String getIsim() {
		return isim;
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public String getSoyisim() {
		return soyisim;
	}
	
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	
	public EMevki getMevki() {
		return mevki;
	}
	
	public void setMevki(EMevki mevki) {
		this.mevki = mevki;
	}
	
	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}
	
	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	
	public String getBonservisBedeli() {
		return bonservisBedeli;
	}
	
	public void setBonservisBedeli(String bonservisBedeli) {
		this.bonservisBedeli = bonservisBedeli;
	}
	
	public Integer getTakimId() {
		return takimId;
	}
	
	public void setTakimId(Integer takimId) {
		this.takimId = takimId;
	}
	
	@Override
	public String toString() {
		return "Futbolcu{" + "isim='" + getIsim() + '\'' + ", soyisim='" + getSoyisim() + '\'' + ", mevki=" + getMevki() + ", dogumTarihi=" + getDogumTarihi() + ", bonservisBedeli='" + getBonservisBedeli() + '\'' + ", takimId=" + getTakimId() + ", id=" + getId() + '}';
	}
}