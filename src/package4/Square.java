package package4;

/**
 * Created by User on 018 18.04.17.
 */
public class Square extends Rectangle
{
    private double side = 1.0;
    Square()
    {
        this.side = -1;
    }
    Square(double side)
    {
        this.side = side;
    }
    Square(String color, boolean filled, double side)
    {
        setColor(color);
        setFilled(filled);
        this.side = side;
    }
    public void setSide(double side)
    {
        this.side = side;
    }
    public double getSide()
    {
        return side;
    }

}
