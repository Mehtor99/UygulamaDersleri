package week02.day01;

import java.util.Scanner;

public class Question008 {
	/*8
	 1'den başlayarak, kullanıcının girdiği sayıya kadar
	olan (sayı dahil) sayıların 1 fazlasının toplamını ekrana yazdıran program.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayi giriniz: ");
		int number = sc.nextInt();
		sc.close();
		int total = 0;
		for (int i = 1; i<=number;i++){
			total = total+i+1;
		}
		System.out.println("toplama sonucu: "+total);
	}
}