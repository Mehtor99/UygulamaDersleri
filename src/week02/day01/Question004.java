package week02.day01;

import java.util.Scanner;

public class Question004 {
	/*
    4- Kullanıcıdan önce yaşını, sonrasında da
    kullanıcının ismini girdi olarak isteyelim. İsmini ve yaşını ekrana yazdıralım.
     */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz: ");
		int age = sc.nextInt();            //sc.nextInt() + "\n"  --> yani nextInt yanında görünmez bir alt satira gecirme kodu var.
		sc.nextLine();                     // -> bu bos nextLine() bir ust satirdaki "\n" i yutacak.
		System.out.println("Lutfen adinizi giriniz: ");   // -> bu nextLine kullanicinin girecegi stringi okur hale gelecek.
		String name = sc.nextLine();
		sc.close();
		System.out.println(name+ " " + age);
		
		
	}
}