package week03.day3;


import java.util.Arrays;

//2- Bir metot yazalım ve bu metot dizi içindeki tek elemanları alıp,
//başka bir diziye atsın ve o diziyi yazdırsın.
public class Question002 {
	public static void main(String[] args) {
	 int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		
	 Question002 question002 = new Question002();
		question002.findOddNumbersInArray(numbers);
	 
	}

	public void findOddNumbersInArray(int[] numbers){
		int[] oddNumArr= new int[countOddNumbers(numbers)];
		int index=0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]%2==1){
				oddNumArr[index]=numbers[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(oddNumArr));
	}
	
	public static int countOddNumbers(int [] numbers){
		int count=0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]%2==1){
				count++;
			}
		}
		return count;
	}
}