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
	
	public Optional<Futbolcu> isimSoyisimeGoreBul(String isim, String soyisim){
		return veriListesi.stream()
				.filter(futbolcu -> futbolcu.getIsim().equalsIgnoreCase(isim)&&futbolcu.getSoyIsim().equalsIgnoreCase(soyisim))
				.findFirst();
	}
	
	public List<Futbolcu> mevkiBul(EMevki mevki){
		return veriListesi.stream()
				.filter(futbolcu -> futbolcu.getMevki().equals(mevki))
				.collect(Collectors.toList());
	}
	
	public List<Futbolcu> takimIdyeGoreFutbolculariListele(Integer takimId){
		return veriListesi.stream()
				.filter(futbolcu -> futbolcu.getTakimID().equals(takimId))
				.collect(Collectors.toList());
	}
	
	
	
	//? id'ye göre futbolcu silme
	public boolean fulbolcuSil(int id){
		return veriListesi.removeIf(futbolcu ->futbolcu.getId() == id);
	}
	
	
	
	
	
}