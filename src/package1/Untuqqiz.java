package package1;

/**
 * Created by User on 008 08.04.17.
 */
public class Untuqqiz
{
    double aa, bb, cc;
    double volumee()
    {
        return aa * bb * cc;
    }

    Untuqqiz()
    {
        aa = bb = cc = -1;
    }
    Untuqqiz(double len)
    {
        aa = bb = cc = len;
    }
    Untuqqiz(double a, double b, double c)
    {
        aa = a;
        bb = b;
        cc = c;
    }
    Untuqqiz(Untuqqiz obj)
    {
        aa = obj.aa;
        bb = obj.bb;
        cc = obj.cc;
    }
}
