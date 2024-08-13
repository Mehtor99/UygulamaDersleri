package uygulamalar.FutbolApp.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Musabaka extends BaseEntity {
	static int musabakaIdCount=0;
	
	private Takim evSahibi;
	private Takim misafir;
	private Integer evSahibiSkor;
	private Integer misafirSkor;
	private String hakemIsmi;
	private LocalDate musabakaTarihi;
	
	public Musabaka(Takim evSahibi, Takim misafir, Integer evSahibiSkor, Integer misafirSkor, String hakemIsmi, LocalDate musabakaTarihi) {
		this.evSahibi = evSahibi;
		this.misafir = misafir;
		this.evSahibiSkor = evSahibiSkor;
		this.misafirSkor = misafirSkor;
		this.hakemIsmi = hakemIsmi;
		this.musabakaTarihi = musabakaTarihi;
		this.id = ++musabakaIdCount;
	}
	
	public Takim getEvSahibi() {
		return evSahibi;
	}
	
	public void setEvSahibi(Takim evSahibi) {
		this.evSahibi = evSahibi;
	}
	
	public Takim getMisafir() {
		return misafir;
	}
	
	public void setMisafir(Takim misafir) {
		this.misafir = misafir;
	}
	
	public Integer getEvSahibiSkor() {
		return evSahibiSkor;
	}
	
	public void setEvSahibiSkor(Integer evSahibiSkor) {
		this.evSahibiSkor = evSahibiSkor;
	}
	
	public Integer getMisafirSkor() {
		return misafirSkor;
	}
	
	public void setMisafirSkor(Integer misafirSkor) {
		this.misafirSkor = misafirSkor;
	}
	
	public String getHakemIsmi() {
		return hakemIsmi;
	}
	
	public void setHakemIsmi(String hakemIsmi) {
		this.hakemIsmi = hakemIsmi;
	}
	
	public LocalDate getMusabakaTarihi() {
		return musabakaTarihi;
	}
	
	public void setMusabakaTarihi(LocalDate musabakaTarihi) {
		this.musabakaTarihi = musabakaTarihi;
	}
	
	@Override
	public String toString() {
		return "Musabaka{" + "evSahibi=" + getEvSahibi() + ", misafir=" + getMisafir() + ", evSahibiSkor=" + getEvSahibiSkor() + ", misafirSkor=" + getMisafirSkor() + ", hakemIsmi='" + getHakemIsmi() + '\'' + ", musabakaTarihi=" + getMusabakaTarihi() + ", id=" + getId() + '}';
	}
}