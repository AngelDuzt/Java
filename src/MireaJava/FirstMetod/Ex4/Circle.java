package MireaJava.FirstMetod.Ex4;

public class Circle {
    private double[] centre = new double[2];
    private double corner = 0;
    private double rvector = 0;

    public void setCentre(double x, double y){
        centre[0] = x;
        centre[1] = y;
    }

    public void setCorner() {
        this.corner = Math.tan(centre[1]/centre[0]);
    }

    public double getCorner() {
        return corner;
    }

    public void setRvector() {
        this.rvector = Math.sqrt(centre[0] * centre[0] + centre[1] * centre[1]);
    }

    public double getRvector() {
        return rvector;
    }
}
