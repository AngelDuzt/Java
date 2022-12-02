package MireaJava.SecondMetod.Pract12.shape;

public abstract class Shape {
    protected  long colour;
    protected  int x;
    protected  int y;

    public Shape(long colour, int x, int y) {
        this.colour = colour;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public long getColour() {
        return colour;
    }

    public void setColour(long colour) {
        this.colour = colour;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
