package package2;

/**
 * Created by User on 011 11.04.17.
 */
public class Box
{
    double width;
    double height;
    double depth;

    Box(Box obj)
    {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }
    Box()
    {
        width = height = depth = -1;
    }

    public Box(double len) {
        width = height = depth = len;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume()
    {
        return width*depth*height;
    }
}
