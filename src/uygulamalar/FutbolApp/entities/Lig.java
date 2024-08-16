package uygulamalar.FutbolApp.entities;

import uygulamalar.FutbolApp.Databases.LigDB;
import uygulamalar.FutbolApp.Databases.TakimDB;
import uygulamalar.FutbolApp.utilities.FileIOWriter;
import uygulamalar.FutbolApp.utilities.enums.EBolge;
import uygulamalar.FutbolApp.utilities.enums.EKume;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lig extends BaseEntity {
	static int ligIDCount = 0;
	
	
	private String ligIsmi;
	private List<Integer> takimIdList;
	private List<Integer> takimPuan;
	private String sezon;
	private EKume kume;
	private EBolge bolge;
	
	public Lig(LigDB ligDB) {
		this.id=++ligIDCount;
		takimIdList=new ArrayList<>();
		ligDB.save(this);
		FileIOWriter.ligleriDosyayaYazdir(ligDB);
	}
	
	public Lig(String ligIsmi,LigDB ligDB) {
		this.id=++ligIDCount;
		this.ligIsmi = ligIsmi;
		takimIdList=new ArrayList<>();
		ligDB.save(this);
		FileIOWriter.ligleriDosyayaYazdir(ligDB);
	}
	
	public Lig(String ligIsmi, String sezon, EKume kume, EBolge bolge, LigDB ligDB) {
		this.ligIsmi = ligIsmi;
		this.sezon = sezon;
		this.kume = kume;
		this.bolge = bolge;
		this.id=++ligIDCount;
		takimIdList=new ArrayList<>();
		ligDB.save(this);
		FileIOWriter.ligleriDosyayaYazdir(ligDB);
		
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
	
	public List<Integer> getTakimList() {
		return takimIdList;
	}
	
	public void setTakimList(List<Integer> takimList) {
		this.takimIdList = takimList;
	}
	
	@Override
	public String toString() {
		return "Lig{" + "ligIsmi='" + getLigIsmi() + '\'' + ", takimList=" + getTakimList() + ", id=" + getId() + '}';
	}
}