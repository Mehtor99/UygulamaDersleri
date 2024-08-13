package uygulamalar.FutbolApp.Databases;

import uygulamalar.FutbolApp.entities.Lig;
import uygulamalar.FutbolApp.utilities.DatabaseManager;

import java.util.Optional;
import java.util.stream.Collectors;

public class LigDB extends DatabaseManager<Lig> {
	
	public Optional<Lig>  ligIsmiBul(String ligIsmi){
		return veriListesi.stream()
				.filter(lig -> lig.getLigIsmi().equalsIgnoreCase(ligIsmi))
				.findFirst();
	}
	//bütün ligleri listeleme
	public void ligleriListele(){
		 veriListesi.stream()
				.collect(Collectors.toList())
				.forEach(System.out::println);
	}
	
}