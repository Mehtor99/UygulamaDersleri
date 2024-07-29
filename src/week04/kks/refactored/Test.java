package week04.kks.refactored;

import week04.kks.refactored.databases.KullaniciDB;
import week04.kks.refactored.databases.MailDB;
import week04.kks.refactored.databases.SMSDB;
import week04.kks.refactored.entities.*;

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