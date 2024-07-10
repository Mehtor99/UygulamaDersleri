package week03.day2;
/*3- Dizideki en buyuk 2. sayiyi bulalim.
		-> 120, 130, 125, -256, 16, 1300, 1258, 81, 14
*/

public class Question003 {
	public static void main(String[] args) {
		int [] intArr1 = new int[]{120, 130, 125, -256, 16, 1300, 1258, 81, 14};
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for (int i = 0; i < intArr1.length; i++) {
			if (intArr1[i]>max){
				max = intArr1[i];
			}
		}
		
		for (int i = 0; i < intArr1.length; i++) {
			if (intArr1[i]<max && intArr1[i]>secondMax){
				secondMax = intArr1[i];
			}
		}
		System.out.println("Second max number: "+secondMax);
		
		
	}
}