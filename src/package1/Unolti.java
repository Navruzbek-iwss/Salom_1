package package1;

/**
 * Created by User on 004 04.04.17.
 */
public class Unolti
{
    static void lasttest(int ...k)
    {
        System.out.print("Length: " + k.length + " Args: ");
        for (int x: k)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        lasttest(3,4,5,6,7,8,0,5,8,7,7,6,54,54,3,3,2);
        lasttest(1,2,34,55);
        lasttest(3,45,65,2,45,7676,45,213,124,354,36,46,2346,4);
    }
}
