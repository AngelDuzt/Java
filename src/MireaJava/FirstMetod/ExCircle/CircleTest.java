package MireaJava.Ex2.ExCircle;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle obj1 = new Circle();
        Circle obj2 = new Circle();
        int x = sc.nextInt();
        obj1.setR(x);
        int y = sc.nextInt();
        obj2.setR(y);
        obj1.Compare(obj2);
    }
}
