package package1;

/**
 * Created by User on 003 03.04.17.
 */
public class Uch
{
    double a, b;
    Uch(double i, double j)
    {
        a = i;
        b = j;
    }

    boolean equals(Uch o)
    {
        if (o.a == a && o.b == b)
            return true;
        else return false;
    }
}
