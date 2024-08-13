package uygulamalar.FutbolApp.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Takim extends BaseEntity {
	static int takimCount=0;
	
	private String takimIsmi;
	private String teknikDirektor;
	private String baskanIsmi;
	private String kurulusTarihi;
	private ERenkler renkler;
	private Integer puan;
	private Integer ligId;
	
	
	public Takim(String takimIsmi, String teknikDirektor, String baskanIsmi, String kurulusTarihi, ERenkler renkler, Integer puan, Integer ligId) {
		this.takimIsmi = takimIsmi;
		this.teknikDirektor = teknikDirektor;
		this.baskanIsmi = baskanIsmi;
		this.kurulusTarihi = kurulusTarihi;
		this.renkler = renkler;
		this.puan = puan;
		this.ligId = ligId;
		this.id = ++takimCount;
	}
	
	
	public static int getTakimCount() {
		return takimCount;
	}
	
	public static void setTakimCount(int takimCount) {
		Takim.takimCount = takimCount;
	}
	
	public String getTakimIsmi() {
		return takimIsmi;
	}
	
	public void setTakimIsmi(String takimIsmi) {
		this.takimIsmi = takimIsmi;
	}
	
	public String getTeknikDirektor() {
		return teknikDirektor;
	}
	
	public void setTeknikDirektor(String teknikDirektor) {
		this.teknikDirektor = teknikDirektor;
	}
	
	public String getBaskanIsmi() {
		return baskanIsmi;
	}
	
	public void setBaskanIsmi(String baskanIsmi) {
		this.baskanIsmi = baskanIsmi;
	}
	
	public String getKurulusTarihi() {
		return kurulusTarihi;
	}
	
	public void setKurulusTarihi(String kurulusTarihi) {
		this.kurulusTarihi = kurulusTarihi;
	}
	
	public ERenkler getRenkler() {
		return renkler;
	}
	
	public void setRenkler(ERenkler renkler) {
		this.renkler = renkler;
	}
	
	public Integer getPuan() {
		return puan;
	}
	
	public void setPuan(Integer puan) {
		this.puan = puan;
	}
	
	public Integer getLigId() {
		return ligId;
	}
	
	public void setLigId(Integer ligId) {
		this.ligId = ligId;
	}
	
	@Override
	public String toString() {
		return "Takim{" + "takimIsmi='" + getTakimIsmi() + '\'' + ", teknikDirektor='" + getTeknikDirektor() + '\'' + ", baskanIsmi='" + getBaskanIsmi() + '\'' + ", kurulusTarihi='" + getKurulusTarihi() + '\'' + ", renkler=" + getRenkler() + ", puan=" + getPuan() + ", ligId=" + getLigId() + ", id=" + getId() + '}';
	}
}