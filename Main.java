package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // load the FXML file and show all the data on it
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        primaryStage.setTitle("Restaurant Order System");
        primaryStage.setScene(new Scene(root, 700, 600));
        primaryStage.show();
        // clearing tha Bill arraylist <order>
        Bill temp= new Bill();
        temp.clearBills();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
