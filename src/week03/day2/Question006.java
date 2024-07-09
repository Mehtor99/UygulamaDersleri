package week03.day2;
/*
6- Dizi içerisinde 1 ve 4 sayilarinin kac kere geçtiğini ve 1 sayısının adeti
4 sayısının adetinden büyükse true değilse false yazdıralım.
-> 1,4,5,6,1,1,4,8
 */
public class Question006 {
	public static void main(String[] args) {
	int[] arr1 = new int[]{1,4,5,6,1,1,4,8};
	int oneCount = 0;
	int fourCount =0;
	boolean isOneCountMore;
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 1){
				oneCount++;
			}
			else if (arr1[i] == 4) {
				fourCount++;
			}
		}
		System.out.println("1 adedi: "+oneCount);
		System.out.println("4 adedi: "+fourCount);
		
	
		isOneCountMore=oneCount>fourCount;
		System.out.println(isOneCountMore);
	}
}