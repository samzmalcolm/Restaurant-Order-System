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

public class mainCourseController {



    @FXML Button mainCourseButton1;
    @FXML  Button mainCourseButton2;
    @FXML  Button mainCourseButton3;
    @FXML  Button mainCourseButton4;
    @FXML  Button mainCourseButton5;
    @FXML  Button mainCourseButton6;


// go back to main menu
    public void BackFromCourseToMenu(ActionEvent event)
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


    // setting info of that object to info GUI
    public void setInfoMainCourse1(ActionEvent event)
    {
        Parent root = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("info.fxml"));
            root = loader.load();


            Scene starterScene = new Scene(root);


            infoController controller= loader.getController();
            MenuData temp= new MenuData();
            String c= String.valueOf(temp.mainCourse.get(0).getCalories());
            String d= String.valueOf(temp.mainCourse.get(0).getPrice());
            controller.setLabel("Main Course",temp.mainCourse.get(0).getName(),c,d);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }

    // setting info of that object to info GUI
    public void setInfoMainCourse2(ActionEvent event)
    {
        Parent root = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("info.fxml"));
            root = loader.load();


            Scene starterScene = new Scene(root);


            infoController controller= loader.getController();
            MenuData temp= new MenuData();
            String c= String.valueOf(temp.mainCourse.get(1).getCalories());
            String d= String.valueOf(temp.mainCourse.get(1).getPrice());
            controller.setLabel("Main Course",temp.mainCourse.get(1).getName(),c,d);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }

    // setting info of that object to info GUI
    public void setInfoMainCourse3(ActionEvent event)
    {
        Parent root = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("info.fxml"));
            root = loader.load();


            Scene starterScene = new Scene(root);


            infoController controller= loader.getController();
            MenuData temp= new MenuData();
            String c= String.valueOf(temp.mainCourse.get(2).getCalories());
            String d= String.valueOf(temp.mainCourse.get(2).getPrice());
            controller.setLabel("Main Course",temp.mainCourse.get(2).getName(),c,d);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }
    // setting info of that object to info GUI
    public void setInfoMainCourse4(ActionEvent event)
    {
        Parent root = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("info.fxml"));
            root = loader.load();


            Scene starterScene = new Scene(root);


            infoController controller= loader.getController();
            MenuData temp= new MenuData();
            String c= String.valueOf(temp.mainCourse.get(3).getCalories());
            String d= String.valueOf(temp.mainCourse.get(3).getPrice());
            controller.setLabel("Main Course",temp.mainCourse.get(3).getName(),c,d);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }

    // setting info of that object to info GUI
    public void setInfoMainCourse5(ActionEvent event)
    {
        Parent root = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("info.fxml"));
            root = loader.load();


            Scene starterScene = new Scene(root);


            infoController controller= loader.getController();
            MenuData temp= new MenuData();
            String c= String.valueOf(temp.mainCourse.get(4).getCalories());
            String d= String.valueOf(temp.mainCourse.get(4).getPrice());
            controller.setLabel("Main Course",temp.mainCourse.get(4).getName(),c,d);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }
    // setting info of that object to info GUI
    public void setInfoMainCourse6(ActionEvent event)
    {
        Parent root = null;
        try {

            FXMLLoader loader= new FXMLLoader();
            loader.setLocation(getClass().getResource("info.fxml"));
            root = loader.load();


            Scene starterScene = new Scene(root);


            infoController controller= loader.getController();
            MenuData temp= new MenuData();
            String c= String.valueOf(temp.mainCourse.get(5).getCalories());
            String d= String.valueOf(temp.mainCourse.get(5).getPrice());
            controller.setLabel("Main Course",temp.mainCourse.get(5).getName(),c,d);

            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



            window.setScene(starterScene);
            window.show();


        } catch (IOException e) {

        }

    }

    // initializing all the buttons of main Course GUI
    public void initializeButtonNames()
    {
        MenuData temp = new MenuData();
        mainCourseButton1.setText(temp.mainCourse.get(0).getName());
        mainCourseButton2.setText(temp.mainCourse.get(1).getName());
        mainCourseButton3.setText(temp.mainCourse.get(2).getName());
        mainCourseButton4.setText(temp.mainCourse.get(3).getName());
        mainCourseButton5.setText(temp.mainCourse.get(4).getName());
        mainCourseButton6.setText(temp.mainCourse.get(5).getName());



    }


}
