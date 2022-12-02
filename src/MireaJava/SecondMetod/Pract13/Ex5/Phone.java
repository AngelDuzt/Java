package MireaJava.SecondMetod.Pract13.Ex5;

public class Phone {
    private String code;
    private String city;
    private String triplet;
    private String quadruple;

    public Phone(String phone) {
        if (phone.startsWith("8")) {
            code = "+7";
        } else {
            code = phone.substring(0, phone.length() - 10);
        }
        city = phone.substring(phone.length() - 10, phone.length() - 7);
        triplet = phone.substring(phone.length() - 7, phone.length() - 4);
        quadruple = phone.substring(phone.length() - 4);
    }

    @Override
    public String toString() {
        return code + city + "-" + triplet + "-" + quadruple;
    }

    public static void main(String[] args) {
        System.out.println(new Phone("88256757999"));
        System.out.println(new Phone("+79031569149"));
    }
}
