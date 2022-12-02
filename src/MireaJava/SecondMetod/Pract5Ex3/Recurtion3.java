package MireaJava.SecondMetod.Pract5Ex3;

import java.util.Scanner;

public class Recurtion3 {

    public void recurtion(int x, int y){
        if(x == 2){
            System.out.println("Yes");
            return;
        }
        if(x % y == 0){
            System.out.println("No");
            return;
        }
        if(y > Math.sqrt(x)){
            System.out.println("Yes");
            return;
        }
        recurtion(x, y+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Recurtion3 obj = new Recurtion3();
        obj.recurtion(x, 3);
    }
}
