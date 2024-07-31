package week06.day01.interfaceOrnekler.Question01;

public class Tekniker extends Calisan implements SahaCalismasiYapabilir{
	
	
	@Override
	public boolean sahaCalismasiYap() {
		System.out.println(this.getClass().getSimpleName() + "saha calismasi yurutuyor." );
		return true;
	}
}