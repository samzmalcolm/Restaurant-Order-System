package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class dessertsController {

    @FXML Button dessertButton1;
    @FXML Button dessertButton2;
    @FXML  Button dessertButton3;
    @FXML  Button dessertButton4;


    // back button functionality, go to main menu
    public void Back_dessert_Menu(ActionEvent event)
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
     // setting the information from class objects to GUI and gos to Info panel
    public void setInfoDessert2(ActionEvent event)
    {
        Parent root = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("info.fxml"));
            root = loader.load();


            Scene starterScene = new Scene(root);


            infoController controller= loader.getController();
            MenuData temp= new MenuData();
            String c= String.valueOf(temp.desserts.get(1).getCalories());
            String d= String.valueOf(temp.desserts.get(1).getPrice());
            controller.setLabel("Desserts",temp.desserts.get(1).getName(),c,d);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }

    // setting the information from class objects to GUI and gos to Info panel
    public void setInfoDessert3(ActionEvent event)
    {
        Parent root = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("info.fxml"));
            root = loader.load();


            Scene starterScene = new Scene(root);


            infoController controller= loader.getController();
            MenuData temp= new MenuData();
            String c= String.valueOf(temp.desserts.get(2).getCalories());
            String d= String.valueOf(temp.desserts.get(2).getPrice());
            controller.setLabel("Desserts",temp.desserts.get(2).getName(),c,d);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }
    // setting the information from class objects to GUI and gos to Info panel
    public void setInfoDessert4(ActionEvent event)
    {
        Parent root = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("info.fxml"));
            root = loader.load();


            Scene starterScene = new Scene(root);


            infoController controller= loader.getController();
            MenuData temp= new MenuData();
            String c= String.valueOf(temp.desserts.get(3).getCalories());
            String d= String.valueOf(temp.desserts.get(3).getPrice());
            controller.setLabel("Desserts",temp.desserts.get(3).getName(),c,d);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }
    // setting the information from class objects to GUI and gos to Info panel
    public void setInfoDessert1(ActionEvent event)
    {
        Parent root = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("info.fxml"));
            root = loader.load();


            Scene starterScene = new Scene(root);


            infoController controller= loader.getController();
            MenuData temp= new MenuData();
            String c= String.valueOf(temp.desserts.get(0).getCalories());
            String d= String.valueOf(temp.desserts.get(0).getPrice());
            controller.setLabel("Desserts",temp.desserts.get(0).getName(),c,d);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }


    // initialize all the buttons by the dessert names from arraylist of Main Menu
    public void initializeButtonNames()
    {
        MenuData temp = new MenuData();
        dessertButton1.setText(temp.desserts.get(0).getName());
        dessertButton2.setText(temp.desserts.get(1).getName());
        dessertButton3.setText(temp.desserts.get(2).getName());
        dessertButton4.setText(temp.desserts.get(3).getName());


    }
}
