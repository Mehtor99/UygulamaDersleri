package uygulamalar.FutbolApp.Databases;

import uygulamalar.FutbolApp.entities.ERenkler;
import uygulamalar.FutbolApp.entities.Musabaka;
import uygulamalar.FutbolApp.entities.Takim;
import uygulamalar.FutbolApp.utilities.DatabaseManager;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TakimDB extends DatabaseManager<Takim> {
	
	//ismi girilenn takýmý getirme
	public Optional<Takim> takimiIsmiyleBul(String takimIsmi){
		return veriListesi.stream()
				.filter(takim ->takim.getTakimIsmi().equalsIgnoreCase(takimIsmi))
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
}