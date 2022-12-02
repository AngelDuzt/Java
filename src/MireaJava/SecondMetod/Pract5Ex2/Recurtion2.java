package MireaJava.SecondMetod.Pract5Ex2;

import java.util.Scanner;

public class Recurtion2 {

    protected int sumChisel = 0;

    public int recurtion(int n){
        if(n > 0) {
            sumChisel += n % 10;
            n /= 10;
            return recurtion(n);
        }
        else{
            return 1;
        }
    }
    protected int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Recurtion2 obj = new Recurtion2();
        obj.recurtion(x);
        System.out.println("Сумма цифр числа равна: " + obj.sumChisel);
    }
}
