package uygulamalar.FutbolApp.entities;

import uygulamalar.FutbolApp.Databases.FutbolcuDB;
import uygulamalar.FutbolApp.Databases.TakimDB;

public class TransferYonetimi {
	private FutbolcuDB futbolcuDB;
	private TakimDB takimDB;
	
	public TransferYonetimi(FutbolcuDB futbolcuDB, TakimDB takimDB) {
		this.futbolcuDB = futbolcuDB;
		this.takimDB = takimDB;
	}
	
	
}