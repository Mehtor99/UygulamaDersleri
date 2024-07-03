package week02.day03;

import java.util.Scanner;

public class Question004 {
	/*
	Klavyeden 0 ile 100 arasında (0-100 dahil) 5 adet sayıyı kullanıcıdan alacağım.
	Aldığım sayılardan en büyük ve en küçük olanları yazdıran program.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		int number;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		while (i<=5){
			System.out.println("Lutfen "+ i +". sayiyi giriniz: ");
			number = scanner.nextInt();
			if (number >= 0 && number<= 100){
				if (number>max){
					max = number;
			    }
				if (number<min){
					min = number;
				}
				i++;
			}else {
				System.out.println("Lutfen gecerli bir sayi giriniz ! (0 - 100)");
			}
		} System.out.println("Max = "+ max + "\nMin = " + min);
		
		
		
		/* uzun ve verimsiz yol.
		Scanner sc = new Scanner(System.in);
		System.out.println("0-100 arasinda 5 adet sayi giriniz:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		
		int max = 0, min = 0;
		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			max = num1;
		}
		else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			max = num2;
		}
		else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
			max = num3;
		}
		else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
			max = num4;
		}
		else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
			max = num5;
		}
		System.out.println("En Buyuk Sayi: " + max);
		
		
		
		if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
			min = num1;
		}
		else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
			min = num2;
		}
		else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5) {
			min = num3;
		}
		else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5) {
			min = num4;
		}
		else if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4) {
			min = num5;
		}
		System.out.println("Girilen en kucuk sayi: " + min);
		
		 */
		
		
	}
}