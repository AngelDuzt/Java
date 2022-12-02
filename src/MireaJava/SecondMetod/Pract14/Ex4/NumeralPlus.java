package MireaJava.SecondMetod.Pract14.Ex4;

import java.util.regex.Pattern;

public class NumeralPlus {
    public static void main(String[] args) {
        System.out.println(PlusExist("(1 + 8) - 9 / 4"));
        System.out.println(PlusExist("6 / 5 - 2 * 9"));
    }

    public static boolean PlusExist(String s) {
        return Pattern.compile("\\d+\\s*\\+").matcher(s).find();
    }
}
