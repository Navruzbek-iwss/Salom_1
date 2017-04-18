package package1;

/**
 * Created by User on 003 03.04.17.
 */
public class Turt
{
    double width;
    double height;
    double depth;

    Turt()
    {
        width = height = depth = -1;
    }
    Turt(double len)
    {
        width = height = depth = len;
    }
    Turt(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    Turt(Turt obj)
    {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    double volume()
    {
        return width*height*depth;
    }
}
