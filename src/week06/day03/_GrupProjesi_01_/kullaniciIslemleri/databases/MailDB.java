package week06.day03._GrupProjesi_01_.kullaniciIslemleri.databases;

import week06.day03._GrupProjesi_01_.kullaniciIslemleri.entities.Kullanici;
import week06.day03._GrupProjesi_01_.kullaniciIslemleri.entities.Mail;
import week06.day03._GrupProjesi_01_.kullaniciIslemleri.utility.DatabaseManager;

import java.util.ArrayList;
import java.util.List;

public class MailDB extends DatabaseManager<Mail> {
	
	
	public  List<Mail> findReceivedByKullanici(Kullanici kullanici) {
		List<Mail> mailsByKullanici = new ArrayList<>();
		for (Mail mail: veriListesi){
			if (mail.getAlici().equals(kullanici)){
				mailsByKullanici.add(mail);
			}
		}
		return mailsByKullanici;
	}
	
	public List<Mail> findSentByKullanici(Kullanici kullanici) {
		List<Mail> mailsByKullanici = new ArrayList<>();
		for (Mail mail: veriListesi){
			if (mail.getGonderici().equals(kullanici)){
				mailsByKullanici.add(mail);
			}
		}
		return mailsByKullanici;
	}
}