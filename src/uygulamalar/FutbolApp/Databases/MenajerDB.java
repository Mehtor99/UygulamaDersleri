package uygulamalar.FutbolApp.Databases;

import uygulamalar.FutbolApp.entities.Menajer;
import uygulamalar.FutbolApp.utilities.DatabaseManager;

import java.util.Optional;

public class MenajerDB extends DatabaseManager<Menajer> {
	private static final MenajerDB instance = new MenajerDB();
	
	private MenajerDB() {}
	
	public static MenajerDB getInstance() {
		return instance;
	}
	public Optional<Menajer> menajerIdVeSifreKontrol(int id, String sifre){
		return veriListesi.stream()
		                  .filter(menajer -> menajer.getId()==id&& menajer.getSifre().equals(sifre))
		                  .findFirst();
	}
}