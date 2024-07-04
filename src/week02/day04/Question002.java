package week02.day04;

import java.util.Scanner;

//2- Dışarıdan bir değer alacağız. Bu değerin içerisinde kaç tane a harfi oldugunu yazdıracağız.
public class Question002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir kelime giriniz: ");
		String input = sc.nextLine();
		
		int count = 0;
		int index = 0;
		char ch = 'a';
		
		while(index<input.length()){
			if (input.charAt(index) == ch){
				count++;
			}
			index++;
		}
		System.out.println("girilen kelimede "+count+" adet a harfi bulunuyor.");
		
		
		}
		
		}