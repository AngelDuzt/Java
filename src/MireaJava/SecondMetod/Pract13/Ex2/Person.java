package MireaJava.SecondMetod.Pract13.Ex2;

public class Person {
    String name;
    String surname;
    String otchestvo;

    public Person(String name,String surname, String otchestvo){
        this.name = name;
        this.surname = surname;
        this.otchestvo = otchestvo;
    }

    public Person(String surname){
        this.surname = surname;
    }

    @Override
    public String toString() {
        return surname + " " + name.charAt(0) + "." + otchestvo.charAt(0) + ".";
    }

    public static void main(String[] args) {
        Person pr = new Person("Ivan", "Stoka", "Pavlovich");
        System.out.println(pr.toString());
    }
}
