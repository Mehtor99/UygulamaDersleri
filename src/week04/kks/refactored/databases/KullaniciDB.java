package week04.kks.refactored.databases;

import week04.kks.refactored.entities.Kullanici;
import week04.kks.refactored.utility.DatabaseManager;

import java.util.ArrayList;

public class KullaniciDB extends DatabaseManager<Kullanici>{
	
	
	
	
	public boolean existsByUsername(String username) {
		for (Kullanici kullanici : veriListesi) {
			if (kullanici.getKullaniciAdi().equals(username)){
				return true;
			}
		}
		return false;
	}
	
	 public boolean existsByTcKimlik(String tcKimlik) {
		for (Kullanici kullanici : veriListesi) {
			if (kullanici.getTcKimlik().equals(tcKimlik)){
				return true;
			}
		}
		return false;
	}
	public boolean existsByEmail(String email) {
		for (Kullanici kullanici : veriListesi) {
			if (kullanici.getEmail().equals(email)){
				return true;
			}
		}
		return false;
	}
	
	public Kullanici findByUsernameAndPassword(String username, String password){
		for (Kullanici kullanici : veriListesi){
			//TODO try catch e al.
			if(kullanici.getKullaniciAdi().equals(username)&& kullanici.getSifre().equals(password)){
				return kullanici;
			}
		}
		return null;
	}
	
	 public Kullanici findByTcEmailPhoneNo(String tcKimlik, String email, String telNo) {
		for (Kullanici kullanici : veriListesi){
			if(kullanici.getTcKimlik().equals(tcKimlik) && kullanici.getEmail().equals(email)&& kullanici.getTelNo().equals(telNo)){
				return kullanici;
			}
		}
		return null;
	}
	
	public Kullanici findByEmail(String aliciMail) {
		for(Kullanici kullanici: veriListesi){
		if (kullanici.getEmail().equals(aliciMail)){
			return kullanici;
		 }
		}
		return null;
	}
	
}