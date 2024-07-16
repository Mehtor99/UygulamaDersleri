package week03.day2;
/*3- Dizideki en buyuk 2. sayiyi bulalim.
		-> 120, 130, 125, -256, 16, 1300, 1258, 81, 14
*/

public class Question003 {
	public static void main(String[] args) {
		int [] numberArr = {120,130,125, -256, 16, 1300, 1258, 81, 14};
		
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for (int i = 0; i < numberArr.length ; i++) {
			if (numberArr[i]>max){
				max = numberArr[i];
			}
		}
		for (int i =0; i<numberArr.length;i++){
			if (numberArr[i]<max && secondMax<numberArr[i]){
				secondMax = numberArr[i];
			}
		}
		System.out.println("second max: "+ secondMax);
	}
}