package uygulamalar.FutbolApp.Databases;

import uygulamalar.FutbolApp.entities.Menajer;
import uygulamalar.FutbolApp.utilities.DatabaseManager;

import java.util.Optional;

public class MenajerDB extends DatabaseManager<Menajer> {
	public Optional<Menajer> menajerIdVeSifreKontrol(int id, String sifre){
		return veriListesi.stream()
		                  .filter(menajer -> menajer.getId()==id&& menajer.getSifre().equals(sifre))
		                  .findFirst();
	}
	
	
}