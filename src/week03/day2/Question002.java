package week03.day2;
/*2- En büyük ve en küçük sayiyi tespit edelim.
-> 0, 120, 5, 85, -256, 16, 1258, 81, 14
 */
public class Question002 {
	public static void main(String[] args) {
	int[] intArr1 = new int[]{ 1300,120, 130, 125, -256, 16, 1258, 81, 14};
	
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
		
		for (int i = 0; i <intArr1.length ; i++) {
			if (intArr1[i]>max){
				max = intArr1[i];
			}
		}
		for (int temp:intArr1){
			if (temp<min){
				min = temp;
			}
		}
		System.out.println("En büyük değer: "+max+"     En küçük değer: "+min);
	
	}
}