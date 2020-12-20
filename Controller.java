package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {


    // button on main menu Starter, go to all starter options
    public void goToStarterOptions(ActionEvent event)
    {
        Parent root = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("Starters.fxml"));
            root = loader.load();


            Scene starterScene = new Scene(root);

            StarterController controller= loader.getController();
            controller.initializeButtonNames();



            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(starterScene);
            window.show();

        } catch (IOException e) {
          
        }

    }
    // button on main menu mainCourse, go to all main course options
    public void goToMainCourseOptions(ActionEvent event)
    {
        Parent root = null;
        try {
            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("mainCourses.fxml"));
            root = loader.load();


            Scene starterScene = new Scene(root);


            mainCourseController controller= loader.getController();
            controller.initializeButtonNames();

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(starterScene);
            window.show();

        } catch (IOException e) {

        }

    }

    // button on main menu dessert, go to all dessert options
    public void goToDessertOptions(ActionEvent event)
    {
        Parent root = null;
        try {
            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("desserts.fxml"));
            root = loader.load();


            Scene starterScene = new Scene(root);


            dessertsController controller= loader.getController();
            controller.initializeButtonNames();

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(starterScene);
            window.show();

        } catch (IOException e) {

        }

    }
    // button on main menu drinks, go to all drinks options
    public void goToDrinkOptions(ActionEvent event)
    {
        Parent root = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("drinks.fxml"));
            root = loader.load();


            Scene starterScene = new Scene(root);


            drinkController controller= loader.getController();
            controller.initializeButtonNames();

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }
    // button on main menu confirm order, go to all confirm order options
    public void goToConfirmOrder(ActionEvent event)
    {
        Parent root = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("confirmOrder.fxml"));
            root = loader.load();


            Scene starterScene = new Scene(root);


            confirmOrderController controller= loader.getController();
            controller.initAll();



            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }




}
