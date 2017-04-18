package package3;

import package2.MainFigure;

/**
 * Created by User on 016 16.04.17.
 */
public class Circle
{
    private double radius = 1.0;
    private String color = "red";

    public Circle()
    {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }
    public Circle(double radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public String getColor()
    {
        return color;
    }
    public String toString()
    {
        return "Circle[radius = " + radius + "; color = " + color + "]";
    }
    public double getArea()
    {
        return Math.PI*Math.pow(radius,2);
    }
}
