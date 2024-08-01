package week06.day03._GrupProjesi_01_.kullaniciIslemleri;

import week06.day03._GrupProjesi_01_.kullaniciIslemleri.databases.KullaniciDB;
import week06.day03._GrupProjesi_01_.kullaniciIslemleri.entities.Kullanici;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        
        KullaniciDB kullaniciDB = new KullaniciDB();
        
        Kullanici kullanici = new Kullanici();
        kullanici.setIsim("Mehmet");
        kullanici.setSoyisim("ERTOP");
        Kullanici kullanici1 = new Kullanici();
        kullanici1.setIsim("Tom");
        kullanici1.setSoyisim("RİDDLE");
        kullaniciDB.saveAll(List.of(kullanici, kullanici1));
        System.out.println(kullaniciDB.findAll());
        
        
        kullanici1.setIsim("Marvolo");
        kullaniciDB.update(kullanici1);
        
        
    }
}