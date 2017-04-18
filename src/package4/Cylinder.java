package package4;

/**
 * Created by User on 016 16.04.17.
 */
public class Cylinder extends Circle
{
    private double height = 1;
    public Cylinder()
    {
        height = -1;
    }
    public Cylinder(double radius)
    {
        super(radius);
    }
    public Cylinder(double radius, double height)
    {
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, String color, double height)
    {
        super(radius,color);
        this.height = height;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public double getHeight()
    {
        return height;
    }
    public double getVolume()
    {
        return 4*Math.PI*Math.pow(getRadius(),2)*getHeight();
    }
    public String toString()
    {
        return "Cylinder[radius = " + getRadius() + "; color = " + getColor() + "; height = " + getHeight() + "; Volume = " + getVolume() + "]";
    }
}
