package uygulamalar.FutbolApp.Databases;

import uygulamalar.FutbolApp.utilities.enums.ERenkler;
import uygulamalar.FutbolApp.entities.Takim;
import uygulamalar.FutbolApp.utilities.DatabaseManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TakimDB extends DatabaseManager<Takim> {
	
	//ismi girilenn takýmý getirme
	public Optional<Takim> takimiIsmiyleBul(String takimIsmi){
		return veriListesi.stream()
				.filter(takim ->takim.getTakimIsim().equalsIgnoreCase(takimIsmi))
				.findFirst();
	}
	
	//takýmýn tüm müsakalarýný getirme  ???? hocaya soracaðýz.
	/*public List<Musabaka> musabakalariBul(Takim takim){
		return veriListesi.stream()
				.filter(takim1->takim1.getTakimIsmi().equalsIgnoreCase(takim.getTakimIsmi()))
	}*/
	
	public List<Takim> renklereGoreTakimBul(ERenkler renkler){
		return veriListesi.stream()
				.filter(takim ->takim.getRenkler().equals(renkler))
				.collect(Collectors.toList());
	}
	
	public List<Takim>  girilenMetniIcerenleriListele(String kulupIsmi){
		return veriListesi.stream()
		                  .filter(takim -> takim.getTakimIsim().toLowerCase().contains(kulupIsmi.toLowerCase()))
		                  .collect(Collectors.toList());
	}
	
	public List<Takim> renklereGoreTakimBul2(ERenkler renkler){
		List<Takim> takimRenkleri=new ArrayList<>();
		for (Takim takim:veriListesi){
			if (takim.getRenkler().equals(renkler)){
				takimRenkleri.add(takim);
			}
			
		}
		return takimRenkleri;
		
	}
	
}