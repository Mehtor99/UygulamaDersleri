package week04.KullaniciOdev;

class UserDB {
	static UserPrivateList userPrivateList = new UserPrivateList();
	
	static User save(User user) {
		return userPrivateList.add(user);
	}
	
	//false ise kay�t yap�lacak, true ise kay�t yap�lmayacak
	public static boolean emailKontrol(String email) {
		User[] kullaniciDizi = userPrivateList.getUserArray();
		if (kullaniciDizi == null) {
			return false;
		}
		for (User user : kullaniciDizi) {
			if (user.getEmail1().equals(email)) {
				return true;
			}
		}
		return false;
	}
	
	public static void userListele() {
		userPrivateList.list();
	}
	
	// false ise kay�t yap�lacak
	public static boolean kullaniciAdiKontrol(String kullaniciAdi) {
		User[] kullaniciDizi = userPrivateList.getUserArray();
		if (kullaniciDizi == null) {
			return false;
		}
		for (int i = 0; i < kullaniciDizi.length; i++) {
			if (kullaniciDizi[i].getUserName1().equals(kullaniciAdi)) {
				return true;
			}
		}
		return false;
	}
	
	//false ise kayit yapilacak
	public static boolean tcKontrol(String tc) {
		User[] kullaniciDizi = userPrivateList.getUserArray();
		if (kullaniciDizi == null) {
			return false;
		}
		for (User user : kullaniciDizi) {
			if (user.getTcNumber1().equals(tc)) {
				return true;    //true d�n�nce kay�t yap�lm�yor.
			}
		}
		return false;
	}
	
	//true d�nerse giri� yap�lacak
	public static boolean girisKontrol(String kullaniciAdi, String sifre) {
		User[] kullaniciDizi = userPrivateList.getUserArray();
		
		int userIndex = userIndexBul(kullaniciAdi);
		if (kullaniciDizi[userIndex].getSifre().equals(sifre)) {
			return true;
		}
		return false;
	}
	
	public static int userIndexBul(String kullaniciAdi) {
		User[] kullaniciDizi = userPrivateList.getUserArray();
		if (kullaniciDizi == null) {
			return -1;
		}
		for (int i = 0; i < kullaniciDizi.length; i++) {
			if (kullaniciDizi[i].getUserName1().equals(kullaniciAdi)) {
				return i;
			}
		}
		return -1;
	}
	
	//true d�nerse sifre yenilemeye izin verevek
	public static boolean sifreYenilemeKontrol(String kullaniciAdi, String tc) {
		User[] kullaniciDizi = userPrivateList.getUserArray();
		int userIndex = userIndexBul(kullaniciAdi);
		if (kullaniciDizi[userIndex].getTcNumber1().equals(tc)) {
			return true;
		}
		return false;
	}
	
	public static void sifreDegistir(int index, String yeniSifre) {
		User[] kullaniciDizi = userPrivateList.getUserArray();
		kullaniciDizi[index].setSifre(yeniSifre);
		System.out.println("�ifre de�i�tirildi.");
	}
}