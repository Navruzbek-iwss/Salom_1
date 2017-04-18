package package1;

/**
 * Created by User on 004 04.04.17.
 */
public class Unturt
{
    static void mtest(String msg, int...v)
    {
        System.out.print(msg + v.length + " Variables: ");
        for (int x : v)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
