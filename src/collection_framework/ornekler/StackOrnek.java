package collection_framework.ornekler;

import java.util.Scanner;
import java.util.Stack;

/*2)(stack ornek) Disaridan bir metin girelim. Girdigimiz metni bir stack'e bir metot araciligiyla atayalim.
Stack<> stack = new Stack();
ihtiyacimiz olacak stack metotlari;
.pop
.push
metotlarin nasil kullanildigini dokumantasyon araciligiyla ogrenebilirsiniz.
sonra girilen kelimenin palindrom kontrolu icin isPalindrome metoduna kelimeyi gonderelim ve stack kullanarak palindrom kontrolümüzü gerceklestirelim
 */
public class StackOrnek {
	
	static Scanner scanner = new Scanner(System.in);
	static Stack<Character> characterStack = new Stack<>();
	
	public static void main(String[] args) {
//		String kelime = "KULLUK";
//		kelimeyiStackeYerlestir(kelime);
//		kelimeyiCharCharYazdir(kelime);
//		System.out.println("\n#####\n");
//		System.out.println(characterStack);
//		stackErit();
		
		
		isPalindrome();
	}
	
	private static void stackErit() {
		while (!characterStack.isEmpty()){
			System.out.println(characterStack.pop());
		}
	}
	
	private static void kelimeyiCharCharYazdir(String kelime) {
		for (int i = 0; i <kelime.length() ; i++) {
			System.out.println(kelime.charAt(i));
		}
	}
	
	private static boolean isPalindrome() {
		String kelime = kelimeyiStackeYerlestir(stringKelimeAl());
		for (int i = 0; i < (kelime.length() / 2); i++) {
			if (kelime.charAt(i) != characterStack.pop()) {
				System.out.println("kelime palinrom değildir!!!");
				return false;
			}
		}
		System.out.println("Kelime Palindromdur!!!");
		return true;
	}

	
	private static String kelimeyiStackeYerlestir(String kelime) {
		for (int i = 0; i < kelime.length(); i++) {
			//mehmet -> mehmet ->LİFO-> temhem
			characterStack.push(kelime.charAt(i));
		}
		return kelime;
	}
	
	private static String stringKelimeAl() {
		System.out.println("Polindrome kontrolü için bir kelime giriniz: ");
		return scanner.nextLine();
	}
}