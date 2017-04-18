package package1;

/**
 * Created by User on 003 03.04.17.
 */
public class Bir
{
    public void test()
    {
        System.out.println("No parametres!");
    }
    public void test(int a)
    {
        System.out.println("a = " + a);
    }
    public double test(double a)
    {
        System.out.print("a = " + a);
        System.out.println();
        return  a;
    }
    public void test(double a, double b, double c)
    {
        System.out.println("a, b: " + a + " " + b + " " + c);
    }
    int  test(int a, int b)
    {
        return a*b;
    }
}
