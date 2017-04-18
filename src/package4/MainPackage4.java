package package4;

/**
 * Created by User on 016 16.04.17.
 */
public class MainPackage4
{
    public static void main(String[] args) {
        Circle circle = new Circle(3,"blue");
        Cylinder cylinder = new Cylinder(2,"red",3);
        Point2D point2D = new Point2D(3,4);
        Point3D point3D = new Point3D(6,7,8);
        Person person = new Person("Navruzbek","Yunusobod");
        Student student = new Student("Navruzbek","Yunusobod","Java",1995,10000);
        Staff staff = new Staff("Nodirbek","Yunusobod","Bedil",10000);
        Shape shape = new Shape("blue",true);
        Circlee circlee = new Circlee(4);
        Rectangle rectangle = new Rectangle("pink",true,3,5);

        System.out.println(circle);
        System.out.println(cylinder);
        System.out.println(point2D);
        System.out.println(point3D);
        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);
        System.out.println(shape);
        System.out.println(circlee);
        System.out.println(rectangle);
    }
}
