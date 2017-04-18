package package1;

/**
 * Created by User on 003 03.04.17.
 */
public class BeshMain
{
    public static void main(String[] args) {
        Besh besh = new Besh();

        int a = 12, b = 15;

        System.out.println("Before: " + a + " " + b );

        besh.method(a,b);
        System.out.println("After: " + a + " " + b);
    }
}
