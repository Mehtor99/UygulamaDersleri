package week02.day01;

public class Question001 {
	
	 /*
    1- Bir ürünün fiyatında %18 KDV ve %15 KAR olduğunu biliyoruz. Bir ürün fiyatı atansın.
    Bu ürün fiyatından ham fiyatını bulalım.
     */
	
	public static void main(String[] args) {
		float price = 100, rawPrice =0, vatRatio = 0.18f, profitRatio = 0.15f, priceWithoutVat;
		priceWithoutVat = price-(price*vatRatio);
		System.out.println("KDV'siz fiyat: "+priceWithoutVat);
		rawPrice = priceWithoutVat-(priceWithoutVat*profitRatio);
		System.out.println("Ham Fiyat: "+rawPrice);
		
	}
}