package package1;

/**
 * Created by User on 003 03.04.17.
 */
public class TurtMain
{
    public static void main(String[] args) {
        Turt turt = new Turt();
        Turt turt1 = new Turt(5);
        Turt turt2 = new Turt(3,4,5);
        Turt myclone = new Turt(turt2);

        double volume;

        volume = turt.volume();
        System.out.println("S = " + volume);

        volume = turt1.volume();
        System.out.println("S = " + volume);

        volume = turt2.volume();
        System.out.println("S = " + volume);

        volume = myclone.volume();
        System.out.println("S_clone = " + volume);
    }
}
