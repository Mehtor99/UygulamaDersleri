package week02.day04;
//-   "Java,React,Spring" String degerinden bir for döngüsü içerisinde Java React ve Spring i ayrı ayrı yazdıralım.
public class Question003 {
	public static void main(String[] args) {
		String value = "Java,React,Spring";
		int index =0;
		
		for(int i= 0;i<value.length();i++){
			if (value.charAt(i) == ','){
				System.out.println(value.substring(index,i));
				index = i+1;
			}
			
		}
		System.out.println(value.substring(index));
		System.out.println("###############################");
		
		for (int i = 0; i<value.length();i++){
			if (value.charAt(i)==','){
				System.out.println();
			}else {
				System.out.print(value.charAt(i));
			}
		}
		System.out.println("###############################");
		
		value = value.replace(",","\n");  //replaceyi kullandığımızda ilk yazdığımız ifadeyi gördüğü yerlere ikinci
		// yazdığımızı yazar ona göre sonuç alırız
		System.out.println(value);
	}
}