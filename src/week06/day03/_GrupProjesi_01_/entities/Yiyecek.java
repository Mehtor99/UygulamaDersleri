package week06.day03._GrupProjesi_01_.entities;


import week06.day03._GrupProjesi_01_.utilities.enums.EKategori;
import week06.day03._GrupProjesi_01_.utilities.enums.EYiyecekTipi;

public class Yiyecek extends Urun{
		private EYiyecekTipi yiyecekTipi;
		
		public Yiyecek(String ad, Double fiyat, String aciklama, EKategori kategori, Integer adet, EYiyecekTipi yiyecekTipi) {
			super(ad, fiyat, aciklama, kategori, adet);
			this.yiyecekTipi = yiyecekTipi;
		}
		
		public EYiyecekTipi getYiyecekTipi() {
			return yiyecekTipi;
		}
		
		public void setYiyecekTipi(EYiyecekTipi yiyecekTipi) {
			this.yiyecekTipi = yiyecekTipi;
		}
		
		@Override
		public String toString() {
			return super.ozetBilgileri();
		}
		
		@Override
		public String urunDetayBilgisi() {
			return super.urunDetayBilgisi()+" yiyecek tipi : "+getYiyecekTipi();
		}
}