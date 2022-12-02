package MireaJava.FirstMetod.ExDog;

public class Dog {

    String name;
    int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int PeopleAge(){
        return 7 * age;
    }

    @Override
    public String toString() {
        return name + "dogAge = " + age + "peopleAge = " + 7 * age;
    }
}
