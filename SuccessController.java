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

public class SuccessController {
@FXML Label tableNo;

// go to main menu after successfull entry of order and ready for next customer
    public void SuccessToMenuBack(ActionEvent event)
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

    // setting the table number in last GUI of confirmation Success
    public void SetTable(String c)
    {
        tableNo.setText(c);
    }

}
