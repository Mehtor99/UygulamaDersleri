package week04.day03;

class KullaniciDB {     //default class yaptýk.baþka packageden eriþilemesin diye
	
	static KullaniciOzelListe kullaniciOzelListe = new KullaniciOzelListe();
	
	
	static Kullanici save(Kullanici kullanici){
		return kullaniciOzelListe.add(kullanici);
	}
	
	static Kullanici[] findAll(){
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		for(Kullanici kullanici : kullaniciDizisi){
			System.out.println(kullanici);
		}
		return kullaniciDizisi;
	}
	
	
	public static boolean existsByEmail(String email) {
		for (Kullanici kullanici: kullaniciOzelListe.getKullaniciDizisi()){
			if (kullanici.getEmail().equals(email)){
				return true;
			}
		}
		return false;
	}
	
	public static boolean existsByUsername(String kullaniciAdi) {
		for (Kullanici kullanici: kullaniciOzelListe.getKullaniciDizisi()){
			if (kullanici.getKullaniciAdi().equals(kullaniciAdi)){
				return true;
			}
		}
		return false;
	}
	
	public static boolean existsByTcKimlik(String tcKimlik) {
		for (Kullanici kullanici: kullaniciOzelListe.getKullaniciDizisi()){
			if (kullanici.getTcKimlik().equals(tcKimlik)){
				return true;
			}
		}
		return false;
	}
	
	public static Kullanici findByUsernameAndPassword(String username, String password) {
		for (Kullanici kullanici: kullaniciOzelListe.getKullaniciDizisi()){
			if (kullanici.getKullaniciAdi().equals(username) && kullanici.getSifre().equals(password)){
				return kullanici;
			}
		}
		return null;
	}
	
	public static Kullanici findById(int id) {
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		for (Kullanici kullanici:kullaniciDizisi){
			if (kullanici.getId()==id){
				return kullanici;
			}
		}
		return null;
	}
	
	public static Kullanici update(Kullanici kullanici) {
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		int index =0;
		for (Kullanici user:kullaniciDizisi){
			if (user.getId() == kullanici.getId()){
				return kullaniciOzelListe.replace(index,kullanici);
			}
			index++;
		}
		return null;
	}
	
	public static Kullanici findByTcEmailPhoneNo(String tcKimlik, String email, String telNo) {
		for (Kullanici kullanici: kullaniciOzelListe.getKullaniciDizisi()){
			if (kullanici.getTcKimlik().equals(tcKimlik) && kullanici.getEmail().equals(email) && kullanici.getTelNo().equals(telNo)){
				return kullanici;
			}
		}
		return null;
	}
}