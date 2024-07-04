package week02.day04;

import java.util.Scanner;

//1- Dışarıdan bir string girdisi alalım. Bu stringin her bir harfini, bulunduğu index ile birlikte alt alta yazdıracağım.
public class Question001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir yazi giriniz: ");
		String text = sc.nextLine();
		
		for (int i = 0; i < text.length();i++) {
			System.out.println("index " + i + " :" + text.charAt(i));
		}
	}
	
}