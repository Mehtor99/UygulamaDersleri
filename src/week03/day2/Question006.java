package week03.day2;
/*
6- Dizi içerisinde 1 ve 4 sayilarinin kac kere geçtiğini ve 1 sayısının adeti
4 sayısının adetinden büyükse true değilse false yazdıralım.
-> 1,4,5,6,1,1,4,8
 */
public class Question006 {
	public static void main(String[] args) {
	int[] numArr = new int[]{1,4,5,6,1,1,4,8};
	int fourCount =0;
	int oneCount = 0;
		
		for (int temp:numArr){
			if (temp == 4){
				fourCount++;
			}
			else if (temp==1) {
				oneCount++;
			}
		}
		
		if (oneCount>fourCount){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}
}