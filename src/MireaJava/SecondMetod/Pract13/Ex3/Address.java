package MireaJava.SecondMetod.Pract13.Ex3;

public class Address {
    String Country;
    String Region;
    String Town;
    String Street;
    String House;
    String Korpus;
    String Kvartira;

    public String getCountry() {
        return Country;
    }

    public String getRegion() {
        return Region;
    }

    public String getTown() {
        return Town;
    }

    public String getStreet() {
        return Street;
    }

    public String getHouse() {
        return House;
    }

    public String getKorpus() {
        return Korpus;
    }

    public String getKvartira() {
        return Kvartira;
    }

    public Address(String[] array) {
        Country = array[0];
        Region = array[1];
        Town = array[2];
        Street = array[3];
        House = array[4];
        Korpus = array[5];
        Kvartira = array[6];


    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public void setTown(String town) {
        Town = town;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public void setHouse(String house) {
        House = house;
    }

    public void setKorpus(String korpus) {
        Korpus = korpus;
    }

    public void setKvartira(String kvartira) {
        Kvartira = kvartira;
    }

    public static void main(String[] args) {
        String address = "Russia,Istrian,Dedovsk,Volokolamskay,60,1,31";
        String[] array = address.split(",");
        Address adr = new Address(array);
    }
}
