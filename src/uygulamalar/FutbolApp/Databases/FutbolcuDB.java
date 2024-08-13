package uygulamalar.FutbolApp.Databases;

import uygulamalar.FutbolApp.entities.EMevki;
import uygulamalar.FutbolApp.entities.Futbolcu;
import uygulamalar.FutbolApp.utilities.DatabaseManager;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FutbolcuDB extends DatabaseManager<Futbolcu> {
	
	public Optional<Futbolcu> isimSoyisimeGoreBul(String isim, String soyisim){
		return veriListesi.stream()
				.filter(futbolcu -> futbolcu.getIsim().equalsIgnoreCase(isim)&&futbolcu.getSoyisim().equalsIgnoreCase(soyisim))
				.findFirst();
	}
	
	public List<Futbolcu> mevkiBul(EMevki mevki){
		return veriListesi.stream()
				.filter(futbolcu -> futbolcu.getMevki().equals(mevki))
				.collect(Collectors.toList());
	}
	
	public List<Futbolcu> takimIdyeGoreFutbolcuBul(Integer takimId){
		return veriListesi.stream()
				.filter(futbolcu -> futbolcu.getTakimId().equals(takimId))
				.collect(Collectors.toList());
	}
	
	//? id'ye göre futbolcu silme
	public boolean fulbolcuSil(int id){
		return veriListesi.removeIf(futbolcu ->futbolcu.getId() == id);
	}
	
}