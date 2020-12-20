package sample;

import java.util.ArrayList;


public class Bill {
    // static arraylist to store order objects like when you order something it will be stored here as a record and
    // after confirmation of order it will be cleared for next customer

    public static ArrayList<order> billItems= new ArrayList<order>();

// constructor
    public Bill()
    {

    }

    // parametrized constructor
    public Bill(String n, double p)
    {
        // order object to store in arraylist
        order temp = new order();
        temp.setName(n);
        temp.setPrice(p);
        billItems.add(temp);
    }


    // clear function for next customer
    public void clearBills()
    {
        billItems.clear();
    }










}
