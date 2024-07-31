package week06.day01.interfaceOrnekler.Question01;

public class Muhendis extends Calisan implements SahaCalismasiYapabilir,MaasaGoreUnvanAlabilir{
	
	
	public Muhendis(String isim, String soyisim,double maas) {
		this.setIsim(isim);
		this.setSoyisim(soyisim);
		this.setMaas(maas);
		setUnvan(maas);
	}
	
	
	
	@Override
	public boolean sahaCalismasiYap() {
		System.out.println("Muhendis saha calismasi yurutuyor.");
		return true;
	}
	
	
	@Override
	public void setUnvan(double maas) {
		if (maas>=50000){
			this.setUnvan("Uzman Muhendis");
		}
		else if (maas>40000) {
			this.setUnvan("Kidemli Muhendis");
		}
		else if (maas>30000) {
			this.setUnvan("Muhendis");
		}else{
			this.setUnvan("Stajyer Muhendis");
		}
	}
	@Override
	public void setMaas(double maas){
		super.setMaas(maas);
		setUnvan((maas));
	}
	
	@Override
	public String toString() {
		return this.getClass().getSuperclass().getSimpleName()
				+"Muhendis{" +
				"isim='" + getIsim() + '\'' +
				", maas=" + getMaas() +
				", soyIsim='" + getSoyisim() + '\'' +
				", unvan='" + getUnvan() + '\'' + '}';
	}
}