package package2;

/**
 * Created by User on 014 14.04.17.
 */
public class Rectangle extends  Figure
{
    Rectangle(double a, double b)
    {
        super(a,b);
    }
    double area()
    {
        System.out.println("Turtburchak yuzasi:");
        return dim2 * dim1;
    }

}
