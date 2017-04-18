package package1;

/**
 * Created by User on 004 04.04.17.
 */
public class Un
{
    public static void main(String[] args) {
        String obj1 = "Birinchi qator";
        String obj2 = "Ikkinchi qator";
        String obj3 = obj1;

        System.out.println("Obj1 Uzunligi: " + obj1.length());
        System.out.println("Obj2 ning 5 index li elementi: " + obj2.charAt(5));
        if (obj1.equals(obj2))
        {
            System.out.println("obj1 == obj2");
        }
        else System.out.println("obj1 != obj2");

        if (obj1.equals(obj3))
            System.out.println("obj1 == obj3");
        else System.out.println("obj1 != obj2");

        System.out.println("===================================");

        String str[] = {"bir","ikki","uch","to'rt"};
        for (int i = 0; i < str.length; i++) {
            System.out.println("str[" + i + "] = " + str[i]);
        }

    }
}
