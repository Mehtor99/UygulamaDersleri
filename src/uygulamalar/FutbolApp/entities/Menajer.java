package uygulamalar.FutbolApp.entities;

import uygulamalar.FutbolApp.Databases.MenajerDB;
import uygulamalar.FutbolApp.utilities.FileIOWriter;

import java.time.LocalDate;

public class Menajer extends BaseEntity {
	static int manajerIDCount;
	
	private String isim;
	private String soyIsim;
	//private long sozlesmeBedeli;  byraya sonradan sozlesme entitysi gelecek
	private LocalDate dogumTarihi;
	private Integer takimId=-1;
	private String sifre;
	
	public Menajer(LocalDate dogumTarihi, String isim, String soyIsim,String sifre, int takimId, MenajerDB menajerDB) {
		this.dogumTarihi = dogumTarihi;
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.sifre = sifre;
		this.takimId = takimId;
		this.id = ++manajerIDCount;
		menajerDB.save(this);
		FileIOWriter.menajerleriDosyayaYazdir(menajerDB);
	}
	
	public String getSifre() {
		return sifre;
	}
	
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	
	public static int getManajerIDCount() {
		return manajerIDCount;
	}
	
	public static void setManajerIDCount(int manajerIDCount) {
		Menajer.manajerIDCount = manajerIDCount;
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
	
	public Integer getTakimId() {
		return takimId;
	}
	
	public void setTakimId(Integer takimId) {
		this.takimId = takimId;
	}
	
	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}
	
	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	
	@Override
	public String toString() {
		return "Menajer{" + "isim='" + getIsim() + '\'' + ", soyIsim='" + getSoyIsim() + '\'' + ", dogumTarihi=" + getDogumTarihi() + ", takimId=" + getTakimId() + ", sifre='" + getSifre() + '\'' + ", id=" + getId() + '}';
	}
}