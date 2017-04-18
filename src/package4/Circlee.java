package package4;

/**
 * Created by User on 018 18.04.17.
 */
public class Circlee extends Shape
{
    private double radius = 1;
    public Circlee()
    {
        this.radius = -1;
    }
    public Circlee(double radius)
    {
        this.radius = radius;
    }
    public Circlee(String color, boolean filled, double radius)
    {
        super(color,filled);
        this.radius = radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return Math.PI*Math.pow(radius,2);
    }
    public double getPerimetr()
    {
        return 2*Math.PI*radius;
    }
    public String toString()
    {
        return "Circle[" + super.toString() + ", radius = " + getRadius() + ", Area = " + getArea() + ", Perimetr = " + getPerimetr() + "]";
    }
}
