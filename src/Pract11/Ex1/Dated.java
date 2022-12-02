package Pract11.Ex1;
import java.util.Date;

public class Dated {

    public static void main(String[] args) {
        long taskAddedTime = System.currentTimeMillis();
        long taskCompletedTime = taskAddedTime + 24 * 60 * 60 * 1000;
        System.out.printf("Developer: %s%n", "Valentine Yakushev");
        System.out.printf("Task added at: %s%n", new SimpleDateFormat("dd/MM/yyyy").format(taskAddedTime));
        System.out.printf("Task completed at: %s", new SimpleDateFormat("dd/MM/yyyy").format(taskCompletedTime));

    }
}
