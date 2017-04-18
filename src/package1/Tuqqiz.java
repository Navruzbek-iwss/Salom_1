package package1;

/**
 * Created by User on 003 03.04.17.
 */
public class Tuqqiz
{
    int outer_x = 100;
    int counter = 0;

    void test()
    {
        for (int i = 0; i < 10; i++) {

            class Inner
            {
                void display()
                {
                    System.out.println("outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
            counter ++;
        }

    }
}
