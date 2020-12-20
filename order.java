package sample;

public class order {

    public  String name;
    public double price;

    public order()
    {
            name = "";
            price= 0.0;
    }

    public order(String c, double p)
    {
        name= c;
        price=p;

    }

    public void setName(String n)
    {
        name=n;
    }

    public void setPrice(double p)
    {
        price=p;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }
}
