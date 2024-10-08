package week06.day01.interfaceOrnekler.Question01;

public class Calisan {
	protected String isim;
	private String soyisim;
	private String unvan;
	private double maas;
	
	
	public void maasAl(){
		System.out.println("Maas Al�nd�.");
	}
	
	public void izinAl(){
		System.out.println("Izin Alindi.");
	}
	
	public void fazlaMesaiYap(){
		System.out.println("Fazladan mesai yapildi");
	}
	
	public String getIsim() {
		return isim;
	}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public String getSoyisim() {
		return soyisim;
	}
	
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	
	public String getUnvan() {
		return unvan;
	}
	
	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	
	public double getMaas() {
		return maas;
	}
	
	public void setMaas(double maas) {
		this.maas = maas;
	}
	
	@Override
	public String toString() {
		return "Calisan{" + "isim='" + getIsim() + '\'' + ", soyisim='" + getSoyisim() + '\'' + ", unvan='" + getUnvan() + '\'' + ", maas='" + getMaas() + '\'' + '}';
	}
	
	public String toStringTemplate(){
		return  "isim='" + isim + '\'' +
				", soyisim='" + soyisim + '\'' +
				", unvan='" + unvan + '\'' +
				", maas=" + maas;
	}
}