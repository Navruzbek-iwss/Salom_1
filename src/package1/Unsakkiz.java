package package1;

/**
 * Created by User on 007 07.04.17.
 */
public class Unsakkiz
{
    double width;
    double height;
    double depth;

    Unsakkiz()
    {
        width = height = depth = -1;
    }
    Unsakkiz(double len)
    {
        width = height = depth = len;
    }
    Unsakkiz(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    Unsakkiz(Unsakkiz obj)
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
