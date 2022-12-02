package MireaJava.FirstMetod.ExDog;
import java.util.*;

public class DogTester {
    public static void main(String[] args) {
        Dog[] array = new Dog[10];
        int i = 0;
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();
        array[i] = new Dog(name, age);
    }
}
