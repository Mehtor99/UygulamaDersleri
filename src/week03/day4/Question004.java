package week03.day4;
/*
4- Dizideki elemanlar arasýndaki farkýn en küçük olduðu deðer nedir?
int[] array = { 1, 5, -4, 3 };
 */
public class Question004 {
	public static void main(String[] args) {
		int[] array= {1,5,-4,3,2};
		System.out.println(smallestGap(array));
		
	}
	public static int smallestGap(int[] numbers){
		int minGap = Integer.MAX_VALUE;
		for (int i = 0;i< numbers.length-1;i++){
			for (int j = i+1; j < numbers.length ; j++) {
				if (Math.abs(numbers[i]-numbers[j])<minGap){
					minGap = Math.abs(numbers[i]-numbers[j]);
				}
			}
		}
		return minGap;
	}
}