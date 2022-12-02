package MireaJava.FirstMetod.ExCircle;

public class Circle {

    private double r;

    public void setR(int r) {
        this.r = r;
    }

    public double getR() {
        return r;

    }

    public double Square(){
        return 3.14 * r * r;
    }

    public double Length(){
        return 3.14 * 2 * r;
    }

    public Circle Compare(Circle circle){
        if(this.r > circle.r){
            return this;
        }
        else{
            return circle;
        }
    }
}
