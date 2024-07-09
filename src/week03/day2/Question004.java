package week03.day2;
/*
4- Bir dizide ard arda gelen 2 indexdeki sayı değeri 2 ise true yazdırıp döngüyü sonlandiralim yoksa false yazsin.
-> 2, -256, 2, 1258, 2, 2
 */
public class Question004 {
	public static void main(String[] args) {
		int[] intArray = new int[]{2, -256, 2, 1258, 2, 2};
		
		boolean isRepeating = false;
		for (int i = 0; i <intArray.length-1 ; i++) {
			if (intArray[i]==2 && intArray[i+1]==2){
				isRepeating = true;
				break;
			}
		}
		System.out.println(isRepeating);
		
	}
}