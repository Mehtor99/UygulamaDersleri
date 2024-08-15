package uygulamalar.FutbolApp.entities;

import uygulamalar.FutbolApp.Databases.FutbolcuDB;
import uygulamalar.FutbolApp.utilities.enums.EMevki;

import java.time.LocalDate;

public class Futbolcu extends BaseEntity{
	static int futbolcuIdCount=0;
	
	private String isim;
	private String soyIsim;
	private LocalDate dogumTarihi;
	private Long bonservisBedeli;
	private EMevki mevki;
	private Integer takimID;
	
	public Futbolcu(String isim, String soyIsim, LocalDate dogumTarihi, Long bonservisBedeli, EMevki mevki,
	                FutbolcuDB futbolcuDB) {
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.dogumTarihi = dogumTarihi;
		this.bonservisBedeli = bonservisBedeli;
		this.mevki = mevki;
		this.id=++futbolcuIdCount;
		futbolcuDB.save(this);
		
	}
	
	public Futbolcu(FutbolcuDB futbolcuDB) {
		futbolcuDB.save(this);
		this.id=++futbolcuIdCount;
	}
	
	public static int getFutbolcuIdCount() {
		return futbolcuIdCount;
	}
	
	public static void setFutbolcuIdCount(int futbolcuIdCount) {
		Futbolcu.futbolcuIdCount = futbolcuIdCount;
	}
	
	public String getIsim() {
		return isim;
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public String getSoyIsim() {
		return soyIsim;
	}
	
	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}
	
	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}
	
	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	
	public Long getBonservisBedeli() {
		return bonservisBedeli;
	}
	
	public void setBonservisBedeli(Long bonservisBedeli) {
		this.bonservisBedeli = bonservisBedeli;
	}
	
	public EMevki getMevki() {
		return mevki;
	}
	
	public void setMevki(EMevki mevki) {
		this.mevki = mevki;
	}
	
	public Integer getTakimID() {
		return takimID;
	}
	
	public void setTakimID(Integer takimID) {
		this.takimID = takimID;
	}
	
	@Override
	public String toString() {
		return "Futbolcu{" + "isim='" + getIsim() + '\'' + ", soyIsim='" + getSoyIsim() + '\'' + ", dogumTarihi=" + getDogumTarihi() + ", bonservisBedeli='" + getBonservisBedeli() + '\'' + ", mevki=" + getMevki() + ", takimID=" + getTakimID() + ", id=" + getId() + '}';
	}
}