package package1;

/**
 * Created by User on 003 03.04.17.
 */
public class UchMain
{
    public static void main(String[] args) {
        Uch uch1= new Uch(100,222);
        Uch uch2 = new Uch(100,222);
        Uch uch3 = new Uch(10,222);

        System.out.println("obj1 == obj2: " + uch1.equals(uch2));
        System.out.println("obj1 == obj3: " + uch1.equals(uch3));
    }
}
