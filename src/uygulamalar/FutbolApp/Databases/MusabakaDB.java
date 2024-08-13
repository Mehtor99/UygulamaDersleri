package uygulamalar.FutbolApp.Databases;

import uygulamalar.FutbolApp.entities.Musabaka;
import uygulamalar.FutbolApp.utilities.DatabaseManager;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class MusabakaDB extends DatabaseManager<Musabaka> {
	
	//tarihe göre musabaka bulma
	public List<Musabaka> tarihindekiMusabakalariBul(LocalDate date){
		return veriListesi.stream()
				.filter(musabaka -> musabaka.getMusabakaTarihi().equals(date.atStartOfDay().toLocalDate()))
				.collect(Collectors.toList());
		
	}
	
	///musabaka sil
	public void musabakaIptalEt(int id){
		veriListesi.removeIf(musabaka -> musabaka.getId()==id);
	}
	
}