package package1;

/**
 * Created by User on 006 06.04.17.
 */
public class Unyetti
{
    static void test(int s[])
    {
        System.out.println("Array_length: " + s.length + "; name: test(int s[])");
        System.out.print("Elements: ");
        for (int i : s)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void test(boolean s[])
    {
        System.out.println("Array_length: " + s.length + "; name: test(boolean s[])");
        System.out.print("Elements: ");
        for (boolean i : s)
        {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,9,4,2,4,6};
        boolean b[] = {true,true,false,true};
        test(a);
        test(b);
    }
}
