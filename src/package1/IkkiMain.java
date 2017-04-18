package package1;

/**
 * Created by User on 003 03.04.17.
 */
public class IkkiMain
{
    public static void main(String[] args) {
        Ikki ikki1 = new Ikki();
        Ikki ikki2 = new Ikki(8);
        Ikki ikki3 = new Ikki(6,7,8);

        double volume = ikki3.volume();

        System.out.println("S = " + ikki1.volume());
        System.out.println("S = " + ikki2.volume());
        System.out.println("S = " + volume);

        System.out.println("S = " + ikki1);
        System.out.println("S = " + ikki2);
        System.out.println("S = " + volume);
    }
}
