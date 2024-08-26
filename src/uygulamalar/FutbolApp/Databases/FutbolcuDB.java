package uygulamalar.FutbolApp.Databases;

import uygulamalar.FutbolApp.entities.Takim;
import uygulamalar.FutbolApp.utilities.enums.EMevki;
import uygulamalar.FutbolApp.entities.Futbolcu;
import uygulamalar.FutbolApp.utilities.DatabaseManager;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FutbolcuDB extends DatabaseManager<Futbolcu> {
	
	private static final FutbolcuDB instance = new FutbolcuDB();
	
	private FutbolcuDB() {}
	
	public static FutbolcuDB getInstance() {
		return instance;
	}
	
	public List<Futbolcu> takimIdyeGoreFutbolcuBul(Integer takimId){
		return veriListesi.stream()
		                  .filter(futbolcu -> futbolcu.getTakimID().equals(takimId))
		                  .collect(Collectors.toList());
	}
	
	public List<Futbolcu> takimIdyeGoreFutbolculariListele(int takimId) {
		return veriListesi.stream()
		                  .filter(futbolcu -> futbolcu.getTakimID().equals(takimId))
		                  .collect(Collectors.toList());
	}
}