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
	
	public Menajer(LocalDate dogumTarihi, String isim, String soyIsim, int takimId, MenajerDB menajerDB) {
		this.dogumTarihi = dogumTarihi;
		this.isim = isim;
		this.soyIsim = soyIsim;
		this.takimId = takimId;
		this.id = manajerIDCount;
		menajerDB.save(this);
		FileIOWriter.menajerleriDosyayaYazdir(menajerDB);
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
		return "Manajer{" + "isim='" + getIsim() + '\'' + ", soyIsim='" + getSoyIsim() + '\'' + ", dogumTarihi=" + getDogumTarihi() + ", id=" + getId() + '}';
	}
}