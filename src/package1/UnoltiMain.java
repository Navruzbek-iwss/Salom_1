package package1;

/**
 * Created by User on 006 06.04.17.
 */
public class UnoltiMain
{
    static void test(int a, int b, int ...k)
    {
        System.out.println("Length: " + (k.length + 2));
        System.out.println("Elements: ");
        System.out.println("a = " + a + " " + " b = " + b);
        System.out.printf("array = { ");
        for (int i : k)
        {
            System.out.printf(i + ", ");
        }
        System.out.printf("}");
        //System.out.println();
    }

    public static void main(String[] args) {
        test(2,3,3,4,5,6,6,8);
    }
}
