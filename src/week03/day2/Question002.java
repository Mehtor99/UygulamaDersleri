package week03.day2;
/*2- En büyük ve en küçük sayiyi tespit edelim.
-> 0, 120, 5, 85, -256, 16, 1258, 81, 14
 */
public class Question002 {
	public static void main(String[] args) {
	int[] intArr1 = new int[]{ 1300,120, 130, 125, -256, 16, 1258, 81, 14};
	
	int max = Integer.MIN_VALUE;
	int secondMax = Integer.MIN_VALUE;
		
		for (int i = 0; i < intArr1.length; i++) {
			if (max<intArr1[i]){
				max = intArr1[i];
			}
		}
		
		for (int i = 0; i < intArr1.length; i++) {
			if (intArr1[i]<max && intArr1[i]>secondMax){
				secondMax=intArr1[i];
			}
		}
		System.out.println("Max: "+max);
		System.out.println("Second Max: "+secondMax);
	
	}
}