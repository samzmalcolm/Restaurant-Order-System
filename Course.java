package sample;


// main Class that inherits all the courses
public class Course {


    public String name;
    public double price;
    public int calories;

    public Course()
    {
            name="";
            price=0.0;
            calories=0;

    }

    public Course(String a, double b,int c)
    {
        name= a;
        price=b;
        calories=c;
    }


    public void setName(String n)
    {
        name=n;
    }

    public void setPrice(double p)
    {
        price=p;
    }
    public void setCalories(int c)
    {
        calories=c;
    }
    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }
    public int getCalories()
    {
        return calories;
    }

}
