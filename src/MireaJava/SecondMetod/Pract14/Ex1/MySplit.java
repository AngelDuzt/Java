package MireaJava.SecondMetod.Pract14.Ex1;

import java.util.Arrays;
import java.util.Scanner;

public class MySplit {
    public static void main(String[] args) {
        System.out.println("Enter string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Enter pattern:");
        String spliter = sc.nextLine();
        System.out.println(Arrays.toString(str.split(spliter)));
    }
}
