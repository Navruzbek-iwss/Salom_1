package package4;

/**
 * Created by User on 018 18.04.17.
 */
public class Rectangle extends Shape
{
    private double length;
    private double width;
    Rectangle()
    {
        this.length = 1.0;
        this.width = 1.0;
    }
    Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    Rectangle(String color, boolean filled, double length, double width)
    {
        super(color,filled);
        this.length = length;
        this.width = width;
    }
    public void setLength(double length)
    {
        this.length = length;
    }
    public double getLength()
    {
        return length;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public double getWidth()
    {
        return width;
    }
    public double getArea()
    {
        return length*width;
    }
    public double getPerimetr()
    {
        return 2*(length+width);
    }
    public String toString()
    {
        return "Rectangle[" + super.toString() + ", length = " + getLength() + ", width = " + getWidth() + "]";
    }
}
