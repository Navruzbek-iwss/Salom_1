package package1;

/**
 * Created by User on 003 03.04.17.
 */
public class BirMain
{
    public static void main(String[] args) {
        Bir bir = new Bir();
        bir.test();
        bir.test(2);
        bir.test(4.6);
        bir.test(2,7,5);
        bir.test(2,3);
        int  result = bir.test(4,5);
        System.out.println("Result = " + result);
    }
}
