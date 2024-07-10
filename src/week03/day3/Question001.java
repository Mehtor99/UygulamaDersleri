package week03.day3;

import java.util.Scanner;

/*- İki sayıyla 4 işlem yapabilen bir hesap makinesi uygulaması yapalım.
Uygulama kullanıcı çıkış yapmadıgı sürece çalışmaya devam edecek.
4 işlem için metotlardan faydalanalım.

 */
public class Question001 {
	public static void main(String[] args) {
		menu();
	}
	
	private static void menu() {   //bu methodu public yaparsak projemizin herhangi bir yerinden ismi ile erişebiliriz.
		Scanner scanner = new Scanner(System.in);
		boolean menuStatus = true;
		int selection;
		int[] numberArr;
		while(menuStatus) {
			System.out.println("### CALCULATOR ###");
			System.out.println("1- Summation");
			System.out.println("2- Subtraction");
			System.out.println("3- Multiplication");
			System.out.println("4- Division");
			System.out.println("0- Exit");
			try {
				selection = scanner.nextInt();
			}
			catch (Exception e){
				System.out.println("\nPlease enter a valid value!\n");
				continue;
			}finally {
				scanner.nextLine();
		}
			
			switch(selection){
				case 1:{
					System.out.println("\n### SUMMATION ###");
					sumTwoNumbers(getTwoNumberFromUser());
					break;
				}
				case 2:{
					System.out.println("\n### SUBTRACTION ###");
					numberArr = getTwoNumberFromUser();
					subtractTwoNumbers(numberArr[0],numberArr[1]);
					break;
				}
				case 3:{
					System.out.println("\n### MULTIPLICATION ###");
					int total = multiplyTwoNumbers();
					break;
				}
				case 4:{
					System.out.println("\n### DIVISION ###");
					numberArr = getTwoNumberFromUser();
					double div = divideTwoNumbers(numberArr[0],numberArr[1]);
					System.out.println(numberArr[0]+" / "+numberArr[1]+" = "+div +"\n");
					break;
				
				}
				case 0:{
				menuStatus = false;
					System.out.println("Thanks for using me!");
				}
				default:{
					System.out.println("\nPlease select a valid option!\n");
				}
			}
		
		
	}
	}
	
	private static int[] getTwoNumberFromUser(){
		int[] numberArr = new int[2];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		numberArr[0] = scanner.nextInt();
		System.out.println("Please enter the second number:  ");
		numberArr[1] = scanner.nextInt();
		return numberArr;
	}
	
	private static int sumTwoNumbers(int[] numberArr){
		int number1 = numberArr[0];
		int number2 = numberArr[1];
		int sum = number1+number2;
		System.out.println(number1+" + "+number2+" = "+sum+ "\n");
		return sum;
	}
	
	private static void subtractTwoNumbers(int number1,int number2){
		int sub = number1-number2;
		System.out.println(number1 + " - " + number2 + " = " + sub + "\n");
	}
	
	private static int multiplyTwoNumbers(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the first number : ");
		int number1 = scanner.nextInt();
		System.out.print("Please enter the second number : ");
		int number2 = scanner.nextInt();
		int total = number1 *number2;
		System.out.println(number1 + " x " + number2 + " = " + total + "\n");
		return total;
	}
	
	private static double divideTwoNumbers(int number1, int number2){
		double div = ((double)number1/number2);
		return div;
	}
	
}