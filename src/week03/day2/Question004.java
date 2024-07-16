package week03.day2;
/*
4- Bir dizide ard arda gelen 2 indexdeki sayı değeri 2 ise true yazdırıp döngüyü sonlandiralim yoksa false yazsin.
-> 2, -256, 2, 1258, 2, 2
 */
public class Question004 {
	public static void main(String[] args) {
		int[] arr1 ={2, -256, 2, 1258, 2,2};
		boolean isItRepeating = false;
		
		for (int i = 0; i < arr1.length-1 ; i++) {
			if (arr1[i]==arr1[i+1] && arr1[i]==2){
				isItRepeating = true;
				break;
			}
		}
		System.out.println(isItRepeating);
	}
}