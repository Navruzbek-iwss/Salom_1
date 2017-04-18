package package1;

/**
 * Created by User on 004 04.04.17.
 */
public class Unbesh
{
    static void ktest(String msg, int ...a)
    {
        System.out.print(msg + a.length + " Args: ");
        for (int x : a)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
