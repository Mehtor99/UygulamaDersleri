package week03.day01;

import java.lang.runtime.SwitchBootstraps;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
1- Dışarıdan bir kelime ve bir harf girilsin. Eğer kelimemizde o harf varsa kaç tane olduğunu
ve index numaralarını yazdırın. Eğer harf içermiyorsa "aradığınız harf yok" gibi bir çıktı verin.

2- Dışarıdan bir kelime giriniz. Daha sonra değiştirmek istediğiniz harfi giriniz ve hangi harfle
değiştireceğinizi belirtin. Eğer kelimemiz içerisinde o harf varsa değiştirsin.

3- Dışarıdan girilen bir kelimeyi ters çevirip yazdıralım. Ayrıca bu kelimenin bir palindrom olup
olmadığını kontrol edelim (örneğin: "kek", "iki", "kabak", "saippuakivikauppias").

4- Dışarıdan 5 adet kelime girelim. Her kelimenin a, b veya c ile başlayıp başlamadığını kontrol edelim.
 Ayrı ayrı sayfa açıldığını düşünelim; a ile başlayanlar bir sayfaya, b ile başlayanlar bir sayfaya,
  c ile başlayanlar bir sayfaya yazılsın. Diğer harflerle başlayanlar için ayrı bir sayfa düşünelim.
   Sonrasında girilen 5 adet kelimeyi kontrol ettikten sonra elimizde kaç sayfa olduğunu ekrana yazdıralım.
 
0 - Çıkış
 
 */
public class SoruMenu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int selection;
		boolean menuControl = true;
		while(menuControl){
			System.out.println("\n ---String Operations---");
			System.out.println("1- Count the letters");
			System.out.println("2- Letter replacement");
			System.out.println("3- Polindrome control");
			System.out.println("4- Pagination");
			System.out.println("0- Exit");
			System.out.println("Please choose an option : ");
			try{
				selection = scanner.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nPlease enter an integer value, do not use letter or big numbers ");
				continue;
			}finally{
				scanner.nextLine();
			}
			
			switch(selection){
				case 1:{
					System.out.println("\n### Count The Letters ### ");
					System.out.println("Please enter a word: ");
					String word = scanner.nextLine();
					System.out.println("Please enter a letter : ");
					char letter = scanner.nextLine().charAt(0);
					int count = 0;
					if (!word.contains(String.valueOf(letter))){
						System.out.println("\nThere are no "+letter+" letter in the word you input. ");
						break;
					}
					for (int i = 0; i <word.length() ; i++) {
						if (word.charAt(i) == letter){
							count++;
							System.out.println("There is a "+ letter +" letter at the "+ i +" .index");
						}
					}
					System.out.println("There are amount of "+count+" leter "+letter+" in the word that you've " + "entered.");
					break;
					
				}
				case 2:{
					System.out.println("\n###Letter Replacement");
					System.out.println("Please enter a word: ");
					String word = scanner.nextLine();
					System.out.println("Plese enter a letter to be replaced: ");
					char letterToBeReplaced = scanner.nextLine().charAt(0);
					System.out.println("Please enter a letter to replace: ");
					char letterToReplace = scanner.nextLine().charAt(0);
					String newWord = word.replace(letterToBeReplaced,letterToReplace);
					System.out.println("Old Word: "+word+" New Word: "+newWord);
					break;
				}
				case 3:{
					System.out.println("\n### Palindrome Control###");
					System.out.print("Please enter a word : ");
					String word = scanner.nextLine().toLowerCase();
					String reverseWord = "";
					int right = word.length()-1;
					int left = 0;
					boolean isPalindrome = true;
					while(left<right){
						if (word.charAt(left) != word.charAt(right)){
							isPalindrome = false;
						}
						left++;
						right--;
					}
					if (isPalindrome){
						System.out.println("Is polindrome");
					}else {
						System.out.println("Is not a polindrome");
					}
					break;
				}
				case 4:{
				int a=0 , b=0 , c=0 , d=0 , total=0;
					System.out.println("\n### Pagination ###");
					System.out.println("Please enter 5 words.");
					for (int i = 0; i <5 ; i++) {
						System.out.println("Please enter the "+(i+1)+". word : ");
						String word = scanner.nextLine();
						
						if (word.charAt(0) == 'a'){
							a = 1;
						}
						else if (word.charAt(0) == 'b') {
							b = 1;
						}
						else if (word.charAt(0) == 'c') {
							c = 1;
						}else {
							d+=1;
						}
					}
					total = a+b+c+d;
					System.out.println("Total number of pages is : "+total);
					break;
				}
				case 0:{
					System.out.println("See you around!");
					menuControl = false;
					break;
				}
				default:{
					System.out.println("Please select a valid menu option");
				}
			}
			
		}
		
		
	}
}