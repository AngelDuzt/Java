package MireaJava.SecondMetod.Pract11.Ex1;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Dated {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Date = sc.nextLine();
        long taskCompletedTime = System.currentTimeMillis();
        System.out.printf("Developer: %s%n", "Stoka Ivan");
        System.out.printf("Task added at: %s%n", Date);
        System.out.printf("Task completed at: %s", new SimpleDateFormat("dd/MM/yyyy").format(taskCompletedTime));

    }
}
