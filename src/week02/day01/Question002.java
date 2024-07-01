package week02.day01;

public class Question002 {
	
	 /*
    2- Türk Lirasınını dolara cevirelim.
    */
	
	public static void main(String[] args) {
	double exchangeRate = 32.38;
	double amount = 200;
	float exchange = (float) (amount/exchangeRate);
		System.out.println(amount+" TL "+exchange+" Dolara esittir.");
	}
}