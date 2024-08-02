package week06.day03._GrupProjesi_01_;

import week06.day03._GrupProjesi_01_.entities.Urun;
import week06.day03._GrupProjesi_01_.utilities.enums.EKategori;

import java.time.LocalDate;
import java.util.List;

public class Satis {
	private LocalDate satisTarihi = LocalDate.now();
	private Integer satisID;
	private List<Sepet> gecmisSiparisList;
	
	@Override
	public String toString() {
		return "Satis{" + "satisTarihi=" + satisTarihi + ", satisID=" + satisID + ", gecmisSiparisList=" + gecmisSiparisList + '}';
	}
}