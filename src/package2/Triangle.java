package package2;

/**
 * Created by User on 014 14.04.17.
 */
public class Triangle extends Figure
{
    Triangle(double a, double b)
    {
        super(a,b);
    }
    double area()
    {
        System.out.println("Uchburchak yuzasi:");
        return (dim1*dim2)/2;
    }
}
