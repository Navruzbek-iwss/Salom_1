package package1;

/**
 * Created by User on 003 03.04.17.
 */
public class Ikki
{
    double width;
    double height;
    double depth;

    Ikki()
    {
        width = height = depth = -1;
    }
    Ikki(double len)
    {
        width = height = depth = len;
    }
    Ikki(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }

    double volume()
    {
        return width * height * depth;
    }

    public String toString()
    {
        return "s = " + volume();
    }
}
