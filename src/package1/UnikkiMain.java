package package1;

/**
 * Created by User on 004 04.04.17.
 */
public class UnikkiMain
{
    public static void main(String[] args) {
        int mas[] = {1,2,3,4,5};
        for (int i = 0; i < mas.length; i++) {
            Unikki unikki = new Unikki();
            unikki.vtest(mas[i]);
        }
    }
}
