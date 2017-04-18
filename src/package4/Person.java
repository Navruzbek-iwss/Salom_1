package package4;

/**
 * Created by User on 016 16.04.17.
 */
public class Person
{
    private String name;
    private String address;
    public Person(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
    public String getName()
    {
        return name;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getAddress()
    {
        return address;
    }
    public String toString()
    {
        return "Person[name = " + getName() + ", address = " + getAddress() + "]";
    }
}
