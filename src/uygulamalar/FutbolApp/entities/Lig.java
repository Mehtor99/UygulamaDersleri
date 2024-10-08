package uygulamalar.FutbolApp.entities;

import uygulamalar.FutbolApp.Databases.LigDB;
import uygulamalar.FutbolApp.Databases.TakimDB;
import uygulamalar.FutbolApp.model.DatabaseModel;
import uygulamalar.FutbolApp.utilities.FileIOWriter;
import uygulamalar.FutbolApp.utilities.enums.EBolge;
import uygulamalar.FutbolApp.utilities.enums.EKume;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lig extends BaseEntity {
	static int ligIDCount = 0;
	private  static DatabaseModel databaseModel=DatabaseModel.getInstance();
	//TODO lig puan listesi
	private String ligIsmi;
	private List<Integer> takimIDList;
	private String sezon;
	private EKume kume;
	private EBolge bolge;
	private LocalDate baslangicTarihi;
	
	
	public Lig(String ligIsmi, String sezon, EKume kume, EBolge bolge, LigDB ligDB,LocalDate baslangicTarihi) {
		this.ligIsmi = ligIsmi;
		this.sezon = sezon;
		this.kume = kume;
		this.bolge = bolge;
		this.id=++ligIDCount;
		this.baslangicTarihi=baslangicTarihi;
		takimIDList=new ArrayList<>();
		ligDB.save(this);
		FileIOWriter.ligleriDosyayaYazdir(databaseModel);
		
	}
	
	public LocalDate getBaslangicTarihi() {
		return baslangicTarihi;
	}
	
	public void setBaslangicTarihi(LocalDate baslangicTarihi) {
		this.baslangicTarihi = baslangicTarihi;
	}
	
	public static int getLigIDCount() {
		return ligIDCount;
	}
	
	public static void setLigIDCount(int ligIDCount) {
		Lig.ligIDCount = ligIDCount;
	}
	
	public String getLigIsmi() {
		return ligIsmi;
	}
	
	public void setLigIsmi(String ligIsmi) {
		this.ligIsmi = ligIsmi;
	}
	
	public List<Integer> getTakimIDList() {
		return takimIDList;
	}
	
	public void setTakimIDList(List<Integer> takimIDList) {
		this.takimIDList = takimIDList;
	}
	
	public String getSezon() {
		return sezon;
	}
	
	public void setSezon(String sezon) {
		this.sezon = sezon;
	}
	
	public EKume getKume() {
		return kume;
	}
	
	public void setKume(EKume kume) {
		this.kume = kume;
	}
	
	public EBolge getBolge() {
		return bolge;
	}
	
	public void setBolge(EBolge bolge) {
		this.bolge = bolge;
	}
	
	@Override
	public String toString() {
		return "Lig{" + "baslangicTarihi=" + getBaslangicTarihi() + ", bolge=" + getBolge() + ", kume=" + getKume() + ", ligIsmi='" + getLigIsmi() + '\'' + ", sezon='" + getSezon() + '\'' + ", takimIDList=" + getTakimIDList() + ", id=" + getId() + '}';
	}
}