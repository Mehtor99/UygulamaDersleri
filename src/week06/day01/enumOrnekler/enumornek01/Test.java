package week06.day01.enumOrnekler.enumornek01;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        UstGiyim ustGiyim = new UstGiyim(EUstGiyim.TSHIRT);
        System.out.println(ustGiyim.getType());
    }
}