package package1;

/**
 * Created by User on 003 03.04.17.
 */
public class Sakkiz
{
    int outer_x = 100;

    void test()
    {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner
    {
        void display()
        {
            System.out.println("vivod: outer_x = " + outer_x);
        }
    }
}
