package week06.day03._GrupProjesi_01_.kullaniciIslemleri.entities;


import java.time.LocalDate;

public class SMS extends Message {
    private static int smsCount = 0;
    
    public SMS() {
        this.smsCount++;
        this.id = smsCount;
        this.gonderilmeTarihi = LocalDate.now();
    }
    
    @Override
    public String toString() {
        return "SMS{" + "id=" + getId() +
                ", alici=" + getAlici() +
                ", icerik='" + getIcerik() +
                '\'' + ", gonderici=" + getGonderici() +
                ", gonderilmeTarihi=" + getGonderilmeTarihi() + '}';
    }
}