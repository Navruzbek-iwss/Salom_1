package package4;

/**
 * Created by User on 018 18.04.17.
 */
public class Staff extends Person
{
    private String school;
    private double pay;
    public Staff(String name,String address,String school,double pay)
    {
        super(name,address);
        this.school = school;
        this.pay = pay;
    }
    public void setSchool(String school)
    {
        this.school = school;
    }
    public String getSchool()
    {
        return school;
    }
    public void setPay(double pay)
    {
        this.pay = pay;
    }
    public double getPay()
    {
        return pay;
    }
    public String toString()
    {
        return "Staff[" + super.toString() + ", school = " + getSchool() + ", pay = " + getPay() + "]";
    }
}
