package week06.day01.interfaceOrnekler.Question01;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		CalisanDB calisanDB = new CalisanDB();
		
		InsanKaynaklari insanKaynaklari = new InsanKaynaklari();
		insanKaynaklari.setIsim("Ayse");
		insanKaynaklari.setSoyisim("KAYA");
		insanKaynaklari.setMaas(25000d);
		insanKaynaklari.setUnvan("IK");
		Muhendis muhendis = new Muhendis("Mehmet", "Ertop", 40000);
		OfisCalisani ofisCalisani = new OfisCalisani("Ali", "Veli", 30000);
		Tekniker tekniker = new Tekniker();
		tekniker.setIsim("Ahmet");
		tekniker.setSoyisim("Eris");
		tekniker.setMaas(30000);
		//System.out.println();
		
		//System.out.println(tekniker);
		insanKaynaklari.zamyap(tekniker, 0.25);
		//System.out.println(tekniker);
		
		//System.out.println(ofisCalisani);
		insanKaynaklari.zamyap(ofisCalisani,1.50);
//		System.out.println(ofisCalisani);
//		System.out.println(muhendis);
		insanKaynaklari.zamyap(muhendis,1.5);
//		System.out.println(muhendis);
		insanKaynaklari.zamyap(muhendis,1.25);
		System.out.println(muhendis);

//		CalisanDB.list();

//		CalisanDB.listMaasUnvanaGore();
		CalisanDB.listmaasUnvanaGoreDegil();
	}
}