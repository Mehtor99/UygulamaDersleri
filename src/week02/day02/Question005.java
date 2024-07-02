package week02.day02;

public class Question005 {
	/*
    5- 1'den 100'e kadar olan çift sayıların toplamının,
     tek sayıların toplamına olan oranını bulan program.
     */
	public static void main(String[] args) {
		int evenNumber = 0, oddNumber = 0;
		
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenNumber = evenNumber + i;
			}
			else {
				oddNumber = oddNumber + i;
			}
		}
		double ratio = (double)evenNumber/oddNumber;   //iki int elemanla yapilan islem int geleceğinden doubleye cast ettik.
		System.out.println("Cift sayilarin toplaminin tek sayilarin toplamina orani: "+ratio);
		System.out.println(evenNumber+"   "+oddNumber);
	}
}