package MireaJava.SecondMetod.Pract3Ex1;

public abstract class Shape {
    protected String color;
    protected  boolean filled;

    public Shape(){}

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String colour) {
        this.color = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();

    @Override
    public String toString() {
        return super.toString();
    }
}
