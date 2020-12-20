package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class drinkController {
    @FXML private Label drinksLabel;

    @FXML Button drinkButton1;
    @FXML Button drinkButton2;
    @FXML Button drinkButton3;
    @FXML Button drinkButton4;



    // back to main menu
    public void BackFromDrinkToMenu(ActionEvent event)
    {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            Scene starterScene = new Scene(root);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(starterScene);
            window.show();

        } catch (IOException e) {

        }


    }

     // setting all the data of that drink in info panel
    public void setInfoDrink1(ActionEvent event)
    {
        Parent root = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("info.fxml"));
            root = loader.load();


            Scene starterScene = new Scene(root);


            infoController controller= loader.getController();
            MenuData temp= new MenuData();
            String c= String.valueOf(temp.drinks.get(0).getCalories());
            String d= String.valueOf(temp.drinks.get(0).getPrice());
            controller.setLabel("Drinks",temp.drinks.get(0).getName(),c,d);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }


    // setting all the data of that drink in info panel
    public void setInfoDrink2(ActionEvent event)
    {
        Parent root = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("info.fxml"));
            root = loader.load();


            Scene starterScene = new Scene(root);


            infoController controller= loader.getController();
            MenuData temp= new MenuData();
            String c= String.valueOf(temp.drinks.get(1).getCalories());
            String d= String.valueOf(temp.drinks.get(1).getPrice());
            controller.setLabel("Drinks",temp.drinks.get(1).getName(),c,d);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }

    // setting all the data of that drink in info panel
    public void setInfoDrink3(ActionEvent event)
    {
        Parent root = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("info.fxml"));
            root = loader.load();


            Scene starterScene = new Scene(root);


            infoController controller= loader.getController();
            MenuData temp= new MenuData();
            String c= String.valueOf(temp.drinks.get(2).getCalories());
            String d= String.valueOf(temp.drinks.get(2).getPrice());
            controller.setLabel("Drinks",temp.drinks.get(2).getName(),c,d);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }

    // setting all the data of that drink in info panel
    public void setInfoDrink4(ActionEvent event)
    {
        Parent root = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("info.fxml"));
            root = loader.load();


            Scene starterScene = new Scene(root);


            infoController controller= loader.getController();
            MenuData temp= new MenuData();
            String c= String.valueOf(temp.drinks.get(3).getCalories());
            String d= String.valueOf(temp.drinks.get(3).getPrice());
            controller.setLabel("Drinks",temp.drinks.get(3).getName(),c,d);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }
   // setting the button by name of drinks from main menu arraylist
    public void initializeButtonNames()
    {
        MenuData temp = new MenuData();
        drinkButton1.setText(temp.drinks.get(0).getName());
        drinkButton2.setText(temp.drinks.get(1).getName());
        drinkButton3.setText(temp.drinks.get(2).getName());
        drinkButton4.setText(temp.drinks.get(3).getName());



    }

}
