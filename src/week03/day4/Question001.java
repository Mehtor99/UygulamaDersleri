package week03.day4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*
1- Girilen kelimedeki Turkce karakterleri, Ingilizce karakterlere ceviren bir program yazalım.
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };
 
Örnegin;

Çadır - > Cadir
 */
public class Question001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word =sc.nextLine();
		System.out.println(turkishTransformLetter(word));
		
	}
	public static String turkishTransformLetter(String word){
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };
		
		for (int i = 0; i <turkceKarakter.length ; i++) {
			word = word.replace(turkceKarakter[i],ingilizceKarakter[i]);
		}
	
		return word;
	}
}