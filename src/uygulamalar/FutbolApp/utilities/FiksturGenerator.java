package uygulamalar.FutbolApp.utilities;

import uygulamalar.FutbolApp.Databases.TakimDB;
import uygulamalar.FutbolApp.entities.Istatistik;
import uygulamalar.FutbolApp.entities.Musabaka;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class FiksturGenerator {
	private List<Integer> takimIDleri;
	private List<DayOfWeek> gunler;
	private static Map<Integer, List<Musabaka>> fikstur = new HashMap<>();
	private LocalDate sezonBaslangic;
	private Map<Integer, String> takimIDtoIsim;
	private Map<Integer, Istatistik> takimIstatistikleri = new HashMap<>();
	
	public FiksturGenerator(List<Integer> takimIDleri, LocalDate sezonBaslangic, Map<Integer, String> takimIDtoIsim) {
		this.takimIDleri = takimIDleri;
		this.sezonBaslangic = sezonBaslangic;
		this.takimIDtoIsim = takimIDtoIsim;
		this.gunler = Arrays.asList(DayOfWeek.FRIDAY, DayOfWeek.SATURDAY, DayOfWeek.SUNDAY, DayOfWeek.MONDAY);
		initializeIstatistikler();
	}
	
	private void initializeIstatistikler() {
		for (Integer takimID : takimIDleri) {
			takimIstatistikleri.put(takimID, new Istatistik());
		}
	}
	
	public void generateFikstur() {
		int takimSayisi = takimIDleri.size();
		boolean tekMi = takimSayisi % 2 != 0;
		
		if (tekMi) {
			takimIDleri.add(-1); // "BAY" i�in -1 kullanarak i�aretleyelim
			takimSayisi++;
		}
		
		// �lk yar�
		for (int hafta = 0; hafta < takimSayisi - 1; hafta++) {
			List<Musabaka> musabakalar = new ArrayList<>();
			
			for (int i = 0; i < takimSayisi / 2; i++) {
				Integer evSahibi, misafirTakim;
				
				if (hafta % 2 == 0) {
					evSahibi = takimIDleri.get(i);
					misafirTakim = takimIDleri.get(takimSayisi - 1 - i);
				} else {
					evSahibi = takimIDleri.get(takimSayisi - 1 - i);
					misafirTakim = takimIDleri.get(i);
				}
				
				if (evSahibi != -1 && misafirTakim != -1) { // BAY hafta kontrol�
					musabakalar.add(new Musabaka(evSahibi, misafirTakim, takimIDtoIsim));
				}
			}
			
			fikstur.put(hafta + 1, musabakalar);
			takimIDleri.add(1, takimIDleri.remove(takimIDleri.size() - 1));
		}
		
		// �kinci yar�
		for (int hafta = 0; hafta < takimSayisi - 1; hafta++) {
			List<Musabaka> musabakalar = new ArrayList<>();
			
			for (int i = 0; i < takimSayisi / 2; i++) {
				Integer evSahibi, misafirTakim;
				
				if (hafta % 2 == 0) {
					evSahibi = takimIDleri.get(takimSayisi - 1 - i);
					misafirTakim = takimIDleri.get(i);
				} else {
					evSahibi = takimIDleri.get(i);
					misafirTakim = takimIDleri.get(takimSayisi - 1 - i);
				}
				
				if (evSahibi != -1 && misafirTakim != -1) { // BAY hafta kontrol�
					musabakalar.add(new Musabaka(evSahibi, misafirTakim, takimIDtoIsim));
				}
			}
			
			fikstur.put(hafta + takimSayisi, musabakalar);
			takimIDleri.add(1, takimIDleri.remove(takimIDleri.size() - 1));
		}
		gunleriAta();
		
		
	}
	
	private void gunleriAta() {
		Random random = new Random();
		for (int hafta = 1; hafta <= fikstur.size(); hafta++) {
			List<Musabaka> musabakalar = fikstur.get(hafta);
			Collections.shuffle(musabakalar);
			for (Musabaka musabaka : musabakalar) {
				DayOfWeek gun = gunler.get(random.nextInt(gunler.size()));
				LocalDate musabakaTarihi = sezonBaslangic.plusWeeks(hafta - 1).with(gun);
				musabaka.setMusabakaTarihi(musabakaTarihi);
			}
			musabakalar.sort(Comparator.comparing(Musabaka::getMusabakaTarihi));
		}
	}
	
	public void puanTablosunuGuncelle() {
		Random random = new Random();
		for (List<Musabaka> musabakalar : fikstur.values()) {
			for (Musabaka musabaka : musabakalar) {
				int evSahibiGol = random.nextInt(5);
				int misafirTakimGol = random.nextInt(5);
				
				Integer evSahibi = musabaka.getEvSahibiID();
				Integer misafirTakim = musabaka.getMisafirTakimID();
				
				if (evSahibiGol > misafirTakimGol) {
					takimIstatistikleri.get(evSahibi).galibiyetEkle();
					takimIstatistikleri.get(misafirTakim).maglubiyetEkle();
				} else if (misafirTakimGol > evSahibiGol) {
					takimIstatistikleri.get(misafirTakim).galibiyetEkle();
					takimIstatistikleri.get(evSahibi).maglubiyetEkle();
				} else {
					takimIstatistikleri.get(evSahibi).beraberlikEkle();
					takimIstatistikleri.get(misafirTakim).beraberlikEkle();
				}
				
				takimIstatistikleri.get(evSahibi).golEkle(evSahibiGol, misafirTakimGol);
				takimIstatistikleri.get(misafirTakim).golEkle(misafirTakimGol, evSahibiGol);
			}
		}
	}
	
	public void puanTablosunuYazdir() {
		System.out.println("Puan Tablosu:");
		System.out.printf("%-20s %-3s %-3s %-3s %-3s %-3s %-3s %-3s%n",
		                  "Tak�m �smi", "G", "B", "M", "AG", "YG", "AV", "Puan");
		
		takimIstatistikleri.entrySet().stream()
		                   .sorted((e1, e2) -> Integer.compare(e2.getValue().getPuan(), e1.getValue().getPuan()))
		                   .forEach(entry -> {
			                   String takimIsmi = takimIDtoIsim.get(entry.getKey());
			                   Istatistik istatistik = entry.getValue();
			                   System.out.printf("%-20s %-3d %-3d %-3d %-3d %-3d %-3d %-3d%n",
			                                     takimIsmi,
			                                     istatistik.getGalibiyet(),
			                                     istatistik.getBeraberlik(),
			                                     istatistik.getMaglubiyet(),
			                                     istatistik.getAtilanGol(),
			                                     istatistik.getYenilenGol(),
			                                     istatistik.getAveraj(),
			                                     istatistik.getPuan());
		                   });
	}
	
	public void fiksturuYazdir() {
		for (Map.Entry<Integer, List<Musabaka>> entry : fikstur.entrySet()) {
			Integer hafta = entry.getKey();
			List<Musabaka> musabakalar = entry.getValue();
			System.out.println("Hafta: " + hafta);
			for (Musabaka musabaka : musabakalar) {
				System.out.println(musabaka.toStringFikstur());
			}
			System.out.println();
		}
		
	}
}