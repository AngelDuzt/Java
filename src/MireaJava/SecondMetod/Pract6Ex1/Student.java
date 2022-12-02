package MireaJava.SecondMetod.Pract6Ex1;

public class Student implements Comparable{

    private int iDNumber;
    private int GPA;

    Student(int iDNumber, int GPA){
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    @Override
    public int compareTo(Object o) {
        return this.iDNumber - ((Student)o).iDNumber;
    }
}
