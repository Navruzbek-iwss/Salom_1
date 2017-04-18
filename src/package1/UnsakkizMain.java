package package1;

/**
 * Created by User on 007 07.04.17.
 */
public class UnsakkizMain
{
    public static void main(String[] args) {
        Unsakkiz unsakkiz = new Unsakkiz(2,3,4);
        UnsakkizOther unsakkizOther = new UnsakkizOther(6,7,8,9.8);
        double vol;

        vol = unsakkiz.volume();
        System.out.println("unsakkiz: volume = " + vol);

        vol = unsakkizOther.volume();
        System.out.println("unsakkizOther: volume = " + vol);
        System.out.println("unsakkizOther weight: " + unsakkizOther.weight);

    }
}
