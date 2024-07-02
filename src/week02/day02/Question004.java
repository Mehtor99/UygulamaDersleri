package week02.day02;

import java.util.Scanner;

public class Question004 {
	/*
  4- Kulanıcının girdiği sayının çarpım tablosunu yazdıran program.
   (Kullanıcı 7 girdiğinde 7'nin çarpım tablosu elemanları görünecek. )
   */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Carpim tablosunu istediginiz rakami giriniz: ");
		int number = sc.nextInt();
		int result;
		
		for (int i = 1; i <= 10; i++) {
			result = i*number;
			System.out.println(number+"*"+i+"= "+result);
		}
	}
}