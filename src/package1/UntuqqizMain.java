package package1;

/**
 * Created by User on 008 08.04.17.
 */
public class UntuqqizMain
{
    public static void main(String[] args) {
        Untuqqiz untuqqiz = new Untuqqiz();
        UntuqqizOther untuqqizOther = new UntuqqizOther(2,3,4,5.5);

        System.out.print("volume_Untuqqiz: " + untuqqizOther.volumee());
        System.out.println(" weight: " + untuqqizOther.ww);

        untuqqiz = untuqqizOther;
        System.out.println("volume-package1.Untuqqiz=package1.UntuqqizOther: " + untuqqiz.volumee());

    }
}
  