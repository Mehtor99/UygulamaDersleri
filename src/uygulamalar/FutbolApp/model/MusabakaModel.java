package uygulamalar.FutbolApp.model;

import uygulamalar.FutbolApp.Databases.FutbolcuDB;
import uygulamalar.FutbolApp.Databases.LigDB;
import uygulamalar.FutbolApp.Databases.StadyumDB;
import uygulamalar.FutbolApp.Databases.TakimDB;
import uygulamalar.FutbolApp.entities.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class MusabakaModel {
	private static DatabaseModel databaseModel;
	private static TakimDB takimDB;
	private static LigDB ligDB;
	private static FutbolcuDB futbolcuDB;
	
	private Integer musabakaID;
	private Takim evSahibiTakim;
	private Takim misafirTakim;
	private Stadyum stadyum;
	private int evSahibiSkor;
	private int misafirTakimSkor;
	private String hakemIsmi;
	private LocalDate musabakaTarihi;
	private Lig ligID;
	
	
	public MusabakaModel(TakimDB takimDB, LigDB ligDB, FutbolcuDB futbolcuDB, StadyumDB stadyumDB, Musabaka musabaka,
	                     Lig lig) {
		this.takimDB = takimDB;
		this.ligDB = ligDB;
		this.futbolcuDB = futbolcuDB;
		
		this.musabakaID = musabaka.getId();
		this.evSahibiTakim = takimDB.findById(musabaka.getEvSahibiID()).orElse(null);
		this.misafirTakim = takimDB.findById(musabaka.getMisafirTakimID()).orElse(null);
		this.ligID = ligDB.findById(lig.getId()).orElse(null);
		this.stadyum = stadyumDB.findById(musabaka.getId()).orElse(null);
		this.musabakaTarihi = musabaka.getMusabakaTarihi();
		this.evSahibiSkor = musabaka.getEvSahibiSkor();
		this.misafirTakimSkor = musabaka.getMisafirTakimSkor();
		this.hakemIsmi = musabaka.getHakemIsmi();
		
		
	}
	
	
	public void musabakaBilgileriniGoster(){
		System.out.println("------------------------------------");
		System.out.println("Musabaka Bilgileri");
		System.out.println("------------------------------------");
		System.out.println("Musabaka ID           : " + musabakaID);
		System.out.println("Ev Sahibi Takým       : " + (evSahibiTakim != null ? evSahibiTakim.getTakimIsim() : "Bilinmiyor"));
		System.out.println("                VS                    ");
		System.out.println("Misafir Takým         : " + (misafirTakim != null ? misafirTakim.getTakimIsim() : "Bilinmiyor"));
		System.out.println("Stadyum ismi          : " + (stadyum != null ? stadyum.getId() : "Bilinmiyor"));
		System.out.println("Musabaka Tarihi       : " + musabakaTarihi);
		System.out.println("Ev Sahibi Skor        : " + evSahibiSkor);
		System.out.println("Misafir Takým Skor     : " + misafirTakimSkor);
		System.out.println("Hakem Ýsmi            : " + hakemIsmi);
		System.out.println("------------------------------------");
	}
	
	
	
}