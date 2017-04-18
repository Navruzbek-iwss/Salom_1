package package3;

/**
 * Created by User on 016 16.04.17.
 */
public class Rectangle
{
    private float length = 1.0f;
    private float width = 1.0f;
    public Rectangle()
    {
        length = -1;
        width = -1;
    }
    public Rectangle(float length, float width)
    {
        this.length = length;
        this.width = width;
    }
    public void setLength(float length)
    {
        this.length = length;
    }
    public float getLength()
    {
        return length;
    }
    public void setWidth(float width)
    {
        this.width = width;
    }
    public float getWidth()
    {
        return width;
    }
    public double getArea()
    {
        return length*width;
    }
    public double getPerimetr()
    {
        return (2*(length + width));
    }
    public String toString()
    {
        return "Rectangle[length = " + length + "; width = " + width + "]";
    }
}
