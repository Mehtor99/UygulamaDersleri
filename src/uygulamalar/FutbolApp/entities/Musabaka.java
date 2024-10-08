package uygulamalar.FutbolApp.entities;
import uygulamalar.FutbolApp.Databases.MusabakaDB;
import uygulamalar.FutbolApp.model.DatabaseModel;

import java.time.LocalDate;
import java.util.Map;

public class Musabaka extends BaseEntity {
	static int musabakaIDCount = 0;
	
	private Integer evSahibiID;
	private Integer misafirTakimID;
	private Stadyum stadyum;
	private int evSahibiSkor;
	private int misafirTakimSkor;
	private String hakemIsmi;
	private LocalDate musabakaTarihi;
	private Integer ligID;
	private Map<Integer, String> takimIDtoIsim;
	
	
	public Musabaka(Integer evSahibiID, Integer misafirTakimID, Map<Integer, String> takimIDtoIsim) {
		this.evSahibiID = evSahibiID;
		this.misafirTakimID = misafirTakimID;
		this.takimIDtoIsim = takimIDtoIsim;
		this.id = ++musabakaIDCount;
	}
	
	public Integer getEvSahibiID() {
		return evSahibiID;
	}
	
	public void setEvSahibiID(Integer evSahibiID) {
		this.evSahibiID = evSahibiID;
	}
	
	public int getEvSahibiSkor() {
		return evSahibiSkor;
	}
	
	public void setEvSahibiSkor(int evSahibiSkor) {
		this.evSahibiSkor = evSahibiSkor;
	}
	
	public String getHakemIsmi() {
		return hakemIsmi;
	}
	
	public void setHakemIsmi(String hakemIsmi) {
		this.hakemIsmi = hakemIsmi;
	}
	
	public Integer getLigID() {
		return ligID;
	}
	
	public void setLigID(Integer ligID) {
		this.ligID = ligID;
	}
	
	public Integer getMisafirTakimID() {
		return misafirTakimID;
	}
	
	public void setMisafirTakimID(Integer misafirTakimID) {
		this.misafirTakimID = misafirTakimID;
	}
	
	public int getMisafirTakimSkor() {
		return misafirTakimSkor;
	}
	
	public void setMisafirTakimSkor(int misafirTakimSkor) {
		this.misafirTakimSkor = misafirTakimSkor;
	}
	
	public static int getMusabakaIDCOunt() {
		return musabakaIDCount;
	}
	
	public static void setMusabakaIDCOunt(int musabakaIDCOunt) {
		Musabaka.musabakaIDCount = musabakaIDCOunt;
	}
	
	public LocalDate getMusabakaTarihi() {
		return musabakaTarihi;
	}
	
	public void setMusabakaTarihi(LocalDate musabakaTarihi) {
		this.musabakaTarihi = musabakaTarihi;
	}
	
	public Stadyum getStadyum() {
		return stadyum;
	}
	
	public void setStadyum(Stadyum stadyum) {
		this.stadyum = stadyum;
	}
	
	public String toStringFikstur() {
		String evSahibiIsim = takimIDtoIsim.getOrDefault(evSahibiID, "BAY");
		String misafirTakimIsim = takimIDtoIsim.getOrDefault(misafirTakimID, "BAY");
		return evSahibiIsim + " VS " + misafirTakimIsim + ", Tarih: " + musabakaTarihi;
	}
	
	@Override
	public String toString() {
		return "Musabaka{" + "evSahibiID=" + getEvSahibiID() + ", misafirTakimID=" + getMisafirTakimID() + ", stadyum" + "='" + getStadyum() + '\'' + ", evSahibiSkor=" + getEvSahibiSkor() + ", misafirTakimSkor=" + getMisafirTakimSkor() + ", hakemIsmi='" + getHakemIsmi() + '\'' + ", musabakaTarihi=" + getMusabakaTarihi() + ", ligID=" + getLigID() + ", id=" + getId() + '}';
	}
}