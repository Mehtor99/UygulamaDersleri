package uygulamalar.FutbolApp.Databases;

import uygulamalar.FutbolApp.entities.Futbolcu;
import uygulamalar.FutbolApp.entities.Menajer;
import uygulamalar.FutbolApp.utilities.enums.ERenkler;
import uygulamalar.FutbolApp.entities.Takim;
import uygulamalar.FutbolApp.utilities.DatabaseManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TakimDB extends DatabaseManager<Takim> {
	private static final TakimDB instance = new TakimDB();
	
	private TakimDB() {}
	
	public static TakimDB getInstance() {
		return instance;
	}

	
	public List<Takim> girilenMetniIcerenleriListele(String kulupIsmi) {
		List<Takim> bulunanList = veriListesi.stream().filter(takim -> takim.getTakimIsim().toLowerCase()
		                                                                    .contains(kulupIsmi.toLowerCase()))
		                                     .toList();
		bulunanList.stream().map(takim -> takim.getId() + " : " + takim.getTakimIsim());
		
		return bulunanList;
	}
	
	public void takimlarIsimIdList() {
		veriListesi.stream().map(takim -> takim.getId() + " : " + takim.getTakimIsim()).collect(Collectors.toList())
		           .forEach(System.out::println);
	}
	
	public void menajerinTakimIdsineGoreTakimBul(int takimid) {
		Optional<Takim> bulunantakim = veriListesi.stream().filter(takim -> takim.getId() == takimid).findFirst();
		System.out.println(bulunantakim.get());
	}
	
}