package week04.KullaniciOdev;

import java.util.Arrays;

public class UserPrivateList {
    /*
    1- OzelListe isimli bir sinif olusturalim.
    Bu sinif icerisinde sayi dizisi ve dizi boyutu tutsun.
     */
	
	public static User[] userArray;
	private int size;
	
	public User[] getUserArray() {
		return userArray;
	}
	
	/*
	1.1 - OzelListe s�n�f�nda add isimli bir metot yazalim.
	Bu metot kullan�c�n�n d��ar�dan parametre olarak verdi�i int t�r�nde sayiyi alacak ve sayi dizimize ekleyecek.
	 */
	// 0,1,2,3
	public User add(User user) {
		User[] tmp;
		if (userArray == null) {
			userArray = new User[1];
			userArray[0] = user;
			this.size = 1;
		}
		else {
			tmp =
					new User[this.size + 1]; // sayi dizimizin onceki size'�n�n bir fazlasi olacak. Cunku yeni "Bir"
			// elaman
			// ekliyoruz.
			for (int i = 0; i < size; i++) {
				tmp[i] = userArray[i];
			}
			tmp[this.size] = user;
			userArray = tmp;
			this.size++;
		}
		return userArray[size - 1];
	}
	
	/*
	1.2 - OzelListe s�n�f�nda remove isimli bir metot yazalim.
	Bu metot kullan�c�n�n d��ar�dan parametre olarak verdi�i index'i silecek.
	 */
	public void remove(int index) {
		//10,15,20,25 -> Boyut 4, son index 3; 1. index'i cikaracagiz. Gormek istedigimiz sonuc -> 10,20,25 Boyut 3,
		// son index 2;
		//0 ,1 ,2 ,3
		//10,20,25
		if ((this.size - 1) < index) {
			try {
				throw new ArrayIndexOutOfBoundsException("");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Dizide " + index + ". eleman bulunmamakta.");
			}
		}
		else {
			try {
				User[] tmp = new User[this.size - 1];
//            int j = 0;
				for (int i = 0; i < tmp.length; i++) {
					if (i < index) {
						tmp[i] = userArray[i];
					}
					else {
						tmp[i] = userArray[i + 1];
					}
//            if(i != index){
//                tmp[i-j] = sayiDizisi[i];
//            } else {
//                j = 1;
//            }
				}
				userArray = tmp;
				size--;
			}
			catch (NegativeArraySizeException e) {
				System.out.println("Dizide cikarilabilecek eleman bulunmamaktadir. ( Dizi BOS!! ) ");
			}
		}
		
	}
	// 15,20,25,30,35  -> 25 cikarmak istedigimiz deger (index 2)
	// 1. Ad�m i = 0; if: True ->  tmp = { 15, 0, 0, 0};
	// 2. Ad�m i = 1; if: True -> tmp = {15,20,0,0};
	// 3. Ad�m i = 2; if: False -> tmp = {15,20,30,0};
	// 4. Ad�m i = 3; if: False -> tmp = {15,20,30,35};
	// 5. Ad�m i = 4; -> Dongu sonlanir.

    /*
    1.3 - list isimli bir metot daha yazal�m.
    Bu metot listemizi { , , , , } format�nda yazd�rs�n. Son eleman virg�l problemini de ��zelim.
     */
	
	public void list() {
		System.out.print("{");
		for (int i = 0; i < size; i++) {
			System.out.print(userArray[i]);
			if (i != size - 1) {
				System.out.print(",");
			}
		}
		System.out.println("}");
	}

    /*
     1.4 - addAll isimli bir metot yazal�m.
     D��ar�dan dizi als�n, ald��� dizinin elemanlar�n�n hepsini say� dizimize eklesin.
     */
	
	public void addAll(User[] userArray) {
		for (int i = 0; i < userArray.length; i++) {
			add(userArray[i]);
		}
	}
	
	public void removeAllIndexes(int[] indexesToBeRemoved) {
		Arrays.sort(indexesToBeRemoved);
		for (int i = indexesToBeRemoved.length - 1; i >= 0; i--) {
			remove(indexesToBeRemoved[i]);
		}
	}
}