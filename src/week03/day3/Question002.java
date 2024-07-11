package week03.day3;



//2- Bir metot yazalım ve bu metot dizi içindeki tek elemanları alıp,
//başka bir diziye atsın ve o diziyi yazdırsın.
public class Question002 {
	public static void main(String[] args) {
		int[] numberArr = {1,2,3,4,5,6,7,8,9};
		findOddNumbersInArray(numberArr);
		
	}
	
	public static int[] findOddNumbersInArray(int[] numberArr){
	int[] oddNumberArr = new int[findCountOfOddNumbers(numberArr)];
	int i= 0;
		for (int number:numberArr){
			if (number%2 != 0){
				oddNumberArr[i] = number;
				i++;
			}
		}
		printArray(oddNumberArr);
		return oddNumberArr;
	}
	
	public static void printArray(int[] numberArr) {
		System.out.print("{");
		for (int number: numberArr){
			System.out.print(number + ",");
		}
		System.out.print("}");
	}
	
	public static int findCountOfOddNumbers(int[] numberArr){
		int oddCount =0;
		for (int number:numberArr){
			if (number%2==1){
				oddCount++;
			}
		}
		return oddCount;
	}
	
}