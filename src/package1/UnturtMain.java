package package1;

/**
 * Created by User on 004 04.04.17.
 */
public class UnturtMain
{
    public static void main(String[] args) {
        Unturt unturt = new Unturt();
        unturt.mtest("package1.Bir arg: ",10);
        unturt.mtest("package1.Ikki args",2,4);
        unturt.mtest("package1.Uch args",4,5,6);
        unturt.mtest("No arg");
    }
}
