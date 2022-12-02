package MireaJava.SecondMetod.Pract14.Ex2;

public class IsExample {
    public static void main(String[] args) {
        System.out.println(isThatString("abcdefghijklmnopqrstuv18340"));
        System.out.println(isThatString("abcdefghijklmnoasdfasdpqrstuv18340"));
    }


    public static boolean isThatString(String s) {
        return s.equals("abcdefghijklmnopqrstuv18340");
    }
}
