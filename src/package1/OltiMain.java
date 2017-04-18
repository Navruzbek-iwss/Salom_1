package package1;

/**
 * Created by User on 003 03.04.17.
 */
public class OltiMain
{
    public static void main(String[] args) {
        Olti olti = new Olti();
        olti.a = 19;
        olti.b = 23;
        olti.setC(33);

        System.out.println("a , b, c: " + olti.a + " " + olti.b + " " + olti.getC());
    }
}
