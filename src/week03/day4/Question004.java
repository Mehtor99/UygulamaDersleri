package week03.day4;
/*
4- Dizideki elemanlar arasýndaki farkýn en küçük olduðu deðer nedir?
int[] array = { 1, 5, -4, 3 };
 */
public class Question004 {
	public static void main(String[] args) {
		int[] array = {1,5,-4,-3};
		System.out.println("Min Gap: "+smallestGap(array));
	}
	
	private static int smallestGap(int[] arr) {
		int minGap = Integer.MAX_VALUE;
		int gap;
		for(int i=0;i<arr.length;i++){
			for (int j = i+1; j < arr.length ; j++) {
				gap =Math.abs(arr[i]-arr[j]);
				if (gap<minGap){
					minGap =gap;
				}
			}
		}
		return minGap;
	}
}