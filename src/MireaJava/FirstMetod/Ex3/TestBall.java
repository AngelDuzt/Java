package MireaJava.FirstMetod.Ex3;

public class TestBall {
    public static void main(String[] args) {
        Ball obj = new Ball();
        obj.move(5.2, 7.6);
        System.out.printf("%s ", obj.getX());
        System.out.println(obj.getY());
    }
}
