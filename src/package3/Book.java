package package3;

/**
 * Created by User on 016 16.04.17.
 */
public class Book
{
    private String name;
    private Author authors[];
    private double price;
    private int qty = 0;

    public Book(String name, Author authors[], double price)
    {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    public Book(String name, Author authors[], double price, int qty)
    {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    public String getName()
    {
        return name;
    }
    public Author[] getAuthors()
    {
        return authors;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public double getPrice()
    {
        return price;
    }
    public void setQty()
    {
        this.qty = qty;
    }
    public int getQty()
    {
        return qty;
    }
    public String toString()
    {
        return "Book[name = " + getName() + "authors{" + getAuthors() + "}" +  "; price = " + getPrice() + "; qty = " + getQty() +"]";
    }
}
