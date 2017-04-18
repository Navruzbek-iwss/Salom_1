package package2;

/**
 * Created by User on 014 14.04.17.
 */
public class MainFigure
{
    public static void main(String[] args) {
        Figure figure = new Figure(2,3);
        Rectangle rectangle = new Rectangle(4,5);
        Triangle triangle = new Triangle(10,8);
        Figure figref;

        figref = rectangle;
        System.out.println("Yuzasi: " + figref.area());

        figref = triangle;
        System.out.println("Yuzasi: " + figref.area());

        figref = figure;
        System.out.println("Yuzasi: " + figref.area());
    }
}
