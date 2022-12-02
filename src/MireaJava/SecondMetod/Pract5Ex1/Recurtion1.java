package MireaJava.SecondMetod.Pract5Ex1;

import java.util.Scanner;

public class Recurtion1 {
    protected  int k, s;
    protected int counter = 0;

    public int getK() {
        return k;
    }

    public int getS() {
        return s;
    }

    public void setK(int k) {
        this.k = k;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int recursion(int n){
        int summachisel = 0;
        int ch = n;
        if(n < Math.pow(10, k)){
            while(n > 0){
                summachisel += n % 10;
                n = n / 10;
            }
            if(summachisel == s){
                counter++;
            }
            n = ch + 1;
            return recursion(n);
        }
        else{
            return 1;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Recurtion1 obj = new Recurtion1();
        obj.setK(x);
        int y = sc.nextInt();
        obj.setS(y);
        int s = 1;
        for(int i = 1; i < x; i++){
            s *= 10;
        }
        obj.recursion(s);
        System.out.println("Количество чисел: " + obj.counter);
    }
}
