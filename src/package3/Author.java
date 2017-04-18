package package3;

/**
 * Created by User on 016 16.04.17.
 */
public class Author
{
    private String name;
    private String email;
    private char gender;

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail()
    {
        return email;
    }
    public void setGender()
    {
        this.gender = gender;
    }
    public char getGender()
    {
        return gender;
    }
    public String toStringTo()
    {
        return "Author[name" + getName() + "; email = " + getEmail() + "; gender = " + getGender() + "]";
    }

}
