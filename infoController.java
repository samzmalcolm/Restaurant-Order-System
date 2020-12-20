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

public class infoController {

    @FXML
    Label label1;
    @FXML
    Label label2;
    @FXML
    Label label3;
    @FXML
    Label label4;


    // go back to main menu
    public void Back_info_Menu(ActionEvent event)
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

    //confirm order of that object which will be opened and go back to main menu
    // and save that info in Bill arraylist<order> for confirm order
    public void OrderObject(ActionEvent event)
    {

        Parent root = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("Menu.fxml"));
            root = loader.load();

            Scene starterScene = new Scene(root);

            double d= Double.parseDouble(label4.getText());
            String c= label2.getText();
            Bill temp= new Bill(c,d);


            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }


    }

    // setting all the labels of Info section
    public void setLabel(String a,String b,String c,String d)
    {
        label1.setText(a);
        label2.setText(b);
        label3.setText(c);
        label4.setText(d);

    }
}
