package week06.day01.interfaceOrnekler.Question01;

public class InsanKaynaklari extends Calisan {  //insan kaynaklari is a Calisan
	
	
	public double zamyap(Calisan calisan, double zamOrani) {
		double zamliMaas = 0;
		if (zamOrani <= 1) {
			zamliMaas = calisan.getMaas() + calisan.getMaas() * zamOrani;
		}
		if (zamOrani >= 1) {
			zamliMaas = calisan.getMaas() * zamOrani;
		}
		if(calisan instanceof Muhendis){
			zamliMaas+=1000;
		}else if (calisan instanceof Tekniker){
			zamliMaas+=500;
		}
		//        if (calisan instanceof MaasaGoreUnvanAlabilir){
//            ((MaasaGoreUnvanAlabilir) calisan).setUnvan(zamliMaas);
//        }
		calisan.setMaas(zamliMaas);
		return zamliMaas;
	}
	
	public void unvanBelirle(Calisan calisan) {
		System.out.println("Unvan Belirlendi.");
	}
	
}