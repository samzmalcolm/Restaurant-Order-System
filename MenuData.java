package sample;

import java.util.ArrayList;

public class MenuData {

    // data member of class types
    public ArrayList<StarterData> starters = new ArrayList<StarterData>();
    public  ArrayList<mainCourseData> mainCourse = new ArrayList<mainCourseData>();
    public  ArrayList<dessertData> desserts = new ArrayList<dessertData>();
    public ArrayList<drinkData> drinks = new ArrayList<drinkData>();

    public MenuData()
    {
        initStarterObjects();
        initMainCourseObjects();
        initDessertObjects();
        initDrinkObjects();

    }

    public void initStarterObjects()
    {
        // demo data
        String [] StarterNames= {"Egg Drop Soup","Deep Fried Wontons","Spring Rolls","Sesame Prawn Toast"};
        double [] StarterPrice={28.50,22.00,24.00,24.80};
        int [] StarterCalories={600,780,680,800};


               //clear arraylist
                starters.clear();
               for (int i=0; i<4;i++)
               {
                   //making object and adding in arraylist <starter>
                   StarterData temp= new StarterData(StarterNames[i],StarterPrice[i],StarterCalories[i]);
                   starters.add(temp);

               }
    }

    public void initMainCourseObjects()
    {
        String [] mainCourseNames= {"Cauliflower Bolognese","Grilled Burger","Pasta","Chicken Steak","Roast Chicken","Grilled Shrimps"};
        double [] mainCoursePrice={44.45,21.00,28.89,29.99,34.90,49.00};
        int [] mainCourseCalories={900,980,780,990,990,880};

        mainCourse.clear();
        for (int i=0; i<6;i++)
        {
            //making object and adding in arraylist <starter>
            mainCourseData temp= new mainCourseData(mainCourseNames[i],mainCoursePrice[i],mainCourseCalories[i]);
            mainCourse.add(temp);

        }
    }

    public void initDessertObjects()
    {
        String [] dessertNames= {"cheesecake","Custard Jelly","Chocolate Ice Cake","MilkShake"};
        double [] dessertPrice={14.00,18.00,22.90,18.90};
        int [] dessertCalories={600,780,680,800};

        desserts.clear();
        for (int i=0; i<4;i++)
        {
            //making object and adding in arraylist <starter>
            dessertData temp= new dessertData(dessertNames[i],dessertPrice[i],dessertCalories[i]);
            desserts.add(temp);

        }
    }

    public void initDrinkObjects()
    {

        String [] drinkNames= {"Black Coffee","Green Tea","Hot Chocolate","Coke"};
        double [] drinkPrice={14.78,12.00,18.00,8.90};
        int [] drinkCalories={600,780,680,800};

        drinks.clear();
        for (int i=0; i<4;i++)
        {
            //making object and adding in arraylist <starter>
            drinkData temp= new drinkData(drinkNames[i],drinkPrice[i],drinkCalories[i]);
            drinks.add(temp);

        }
    }
}
