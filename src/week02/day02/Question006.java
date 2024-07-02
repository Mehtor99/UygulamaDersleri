package week02.day02;

import java.util.Scanner;

public class Question006 {
	/*
   6- Telefon kodu ve Email kodumuz olsun (Numerik ve bunları elle girebiliriz)
	Sonrasında kullanıcıdan kodları girmesini isteyeceğiz, e-mail kodu hatalıysa ona
	göre bir mesaj, sms kodu hatalıysa ona göre bir mesaj, ikisi de doğru girildiğinde
	de "Başarıyla giriş yaptınız".
	*/
	public static void main(String[] args) {
		int mailCode = 1234 , phoneCode = 4321;
		Scanner sc = new Scanner(System.in);
		System.out.println("Lutfen Mailinize gelen kodu giriniz: ");
		int inputMailCode = sc.nextInt();
		System.out.println("Lutfen telefonunuza gelen kodu giriniz: ");
		int inputPhoneCode = sc.nextInt();
		
		if (inputPhoneCode==phoneCode && inputMailCode==mailCode){
			System.out.println("Tebrikler basatiyla giris yaptiniz.");
		}
		else if (inputPhoneCode==phoneCode && inputMailCode!=mailCode) {
			System.out.println("Mail kodunuz hatali!!");
		}
		else if (inputPhoneCode!=phoneCode && inputMailCode==mailCode) {
			System.out.println("telefon kodunuz hatali!!");
		}else{
			System.out.println("girdiginiz kodlar hatalidir!!!");
		}
		
		
	}
}