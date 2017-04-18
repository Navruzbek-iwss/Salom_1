package package4;

/**
 * Created by User on 018 18.04.17.
 */
public class Shape
{
    private String color = "red";
    private boolean filled = true;
    public Shape()
    {
        this.color = "yellow";
        this.filled = true;
    }
    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public String getColor()
    {
        return color;
    }
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    public boolean isFilled()
    {
        return filled;
    }

    @Override
    public String toString()
    {
        return "[color = " + getColor() + ", filled = " + isFilled() + "]";
    }
}
