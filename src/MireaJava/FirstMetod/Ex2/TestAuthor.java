package MireaJava.Ex2;

public class TestAuthor {
    public static void main(String[] args) {
        Author obj = new Author("Valentin", "valentin@mirea.ru", 'M');
        obj.setEmail("Valentin@mail.ru");
        System.out.println(obj.getEmail());
        System.out.println(obj.getName());
        System.out.println(obj.getGender());
    }
}
