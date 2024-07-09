package week03.day2;
/*
5 - Dizideki bütün sayıların toplamını yazdıralım.
Dizinin her bir elemanı için;
çift ise çifttir, tek ise tektir yazdıralım.
-> 0, 120, 5, 85, -256, 16, 1258, 81, 14
 */
public class Question005 {
	public static void main(String[] args) {
		int[] arr1 = new int[]{0, 120, 5, 85, -256, 16, 1258, 81, 14};
		int total =0;
		for (int num : arr1) {
			total += num;
			
			if(num%2==0){
				System.out.println(num + " is even");
			}else{
				System.out.println((num+" is odd"));
			}
			
		}
		System.out.println("total: "+total);
	}
}