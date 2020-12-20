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

public class StarterController {

    @FXML
    Button starterButton1;
    @FXML
    Button starterButton2;
    @FXML
    Button starterButton3;
    @FXML
    Button starterButton4;


    // go back to menu
    public void SatrtersToMenuBack(ActionEvent event)
    {
        Parent Starters = null;
        try {
            Starters = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            Scene starterScene = new Scene(Starters);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(starterScene);
            window.show();

        } catch (IOException e) {

        }

    }

    // setting info of that starter to info GUI
    public void setInfoStarter1(ActionEvent event)
    {
        Parent Starters = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("info.fxml"));
            Starters = loader.load();


            Scene starterScene = new Scene(Starters);


            infoController controller= loader.getController();
            MenuData temp= new MenuData();
            String c= String.valueOf(temp.starters.get(0).getCalories());
            String d= String.valueOf(temp.starters.get(0).getPrice());
            controller.setLabel("Starters",temp.starters.get(0).getName(),c,d);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }

    // setting info of that starter to info GUI
    public void setInfoStarter2(ActionEvent event)
    {
        Parent Starters = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("info.fxml"));
            Starters = loader.load();


            Scene starterScene = new Scene(Starters);


            infoController controller= loader.getController();
            MenuData temp= new MenuData();
            String c= String.valueOf(temp.starters.get(1).getCalories());
            String d= String.valueOf(temp.starters.get(1).getPrice());
            controller.setLabel("Starters",temp.starters.get(1).getName(),c,d);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }

    // setting info of that starter to info GUI
    public void setInfoStarter3(ActionEvent event)
    {
        Parent Starters = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("info.fxml"));
            Starters = loader.load();


            Scene starterScene = new Scene(Starters);


            infoController controller= loader.getController();
            MenuData temp= new MenuData();
            String c= String.valueOf(temp.starters.get(2).getCalories());
            String d= String.valueOf(temp.starters.get(2).getPrice());
            controller.setLabel("Starters",temp.starters.get(2).getName(),c,d);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }



    // setting info of that starter to info GUI
    public void setInfoStarter4(ActionEvent event)
    {
        Parent Starters = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("info.fxml"));
            Starters = loader.load();


            Scene starterScene = new Scene(Starters);


            infoController controller= loader.getController();
            MenuData temp= new MenuData();
            String c= String.valueOf(temp.starters.get(3).getCalories());
            String d= String.valueOf(temp.starters.get(3).getPrice());
            controller.setLabel("Starters",temp.starters.get(3).getName(),c,d);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }

    // initializing the button on the starter GUI by Starter names from main Menu arrayList<starter>

    public void initializeButtonNames()
    {
       MenuData temp = new MenuData();
        starterButton1.setText(temp.starters.get(0).getName());
        starterButton2.setText(temp.starters.get(1).getName());
        starterButton3.setText(temp.starters.get(2).getName());
        starterButton4.setText(temp.starters.get(3).getName());


    }

}
