package package3;

/**
 * Created by User on 016 16.04.17.
 */
public class MainAll
{
    public static void main(String[] args) {
        Circle circle = new Circle(5,"yellow");
        Rectangle rectangle = new Rectangle(4.0f, 6.0f);
        Employee employee = new Employee(001,"Navruzbek","Sultanov",10000);
        InvoiceItem invoiceItem = new InvoiceItem("002","product",100,500);
        //Book book = new Book("Book1",name,email,male,50000,100);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(employee);
        System.out.println(invoiceItem);
        //System.out.println(book);

    }
}
