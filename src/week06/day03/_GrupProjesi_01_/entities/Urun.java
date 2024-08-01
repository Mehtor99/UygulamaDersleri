package week06.day03._GrupProjesi_01_.entities;

import week06.day03._GrupProjesi_01_.utilities.enums.EKategori;

import java.util.ArrayList;

public class Urun {
	private static Integer idCount=0;
	private String ad;
	private Double  fiyat;
	private Integer urunID;
	private String aciklama;
	private EKategori kategori;
	private Integer adet;
	
	public static ArrayList<Urun> urunArrayList = new ArrayList<>();
	
	public Urun(String ad, Double fiyat, String aciklama, EKategori kategori,Integer adet) {
		this.ad = ad;
		this.fiyat = fiyat;
		this.aciklama = aciklama;
		this.kategori = kategori;
		this.urunID = ++idCount;
		this.adet = adet;
		urunArrayList.add(this);
	}
	
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public Double getFiyat() {
		return fiyat;
	}
	
	public void setFiyat(Double fiyat) {
		this.fiyat = fiyat;
	}
	
	public Integer getUrunID() {
		return urunID;
	}
	
	
	public String getAciklama() {
		return aciklama;
	}
	
	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	
	public EKategori getKategori() {
		return kategori;
	}
	
	public void setKategori(EKategori kategori) {
		this.kategori = kategori;
	}
	
	public Integer getAdet() {
		return adet;
	}
	
	public void setAdet(Integer adet) {
		this.adet = adet;
	}
	
	public String ozetBilgileri(){
		return "  id : "+getUrunID()+ '\''+
				", ad : " + getAd()+
				", fiyat : '" + getFiyat() + '\'';
	}
	
	@Override
	public String toString() {
		return "Urun{" + "ad='" + getAd() + '\'' + ", fiyat=" + getFiyat() +  ", aciklama='" + getAciklama() + '\'' + ", kategori=" + getKategori() + '}';
	}
	public String urunDetayBilgisi(){
		return "  id : "+getUrunID()+ '\''+
				"kategori : "+getKategori()+ '\''
				+", ad : " + getAd()
				+ ", fiyat : '" + getFiyat() + '\''
				+ ", adet : '" + getAdet() + '\''
				+ ", aciklama : " + getAciklama();
	}
}