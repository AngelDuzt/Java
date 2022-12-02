package MireaJava.Ex2.Ex4;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        int size = 0;
        Circle[] array = new Circle[10];
        Scanner sc = new Scanner(System.in);
        while(true){
            double x = sc.nextDouble();
            if(x <= 0){break;}
            double y = sc.nextDouble();
            if(y <= 0){break;}
            Circle obj = new Circle();
            obj.setCentre(x, y);
            obj.setCorner();
            obj.setRvector();
            array[size] = obj;
        }
    }
}
