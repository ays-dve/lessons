package lesson9;

public class CircleArea {
    static double pi=3.14;
    double r;


    public CircleArea(double r) {
        this.r = r;
    }

    public double AreaOfCircle() {
        return pi*r*r;
    }

}
