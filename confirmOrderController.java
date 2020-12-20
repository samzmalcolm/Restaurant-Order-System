package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class confirmOrderController {
// all or some components of FXML file / GUI
    @FXML TextField tableNumberText;
    @FXML TextField dinnerNumbers;

    @FXML Label totalLabel;

    @FXML Label emptyTable;
    @FXML Label emptyDinner;
    @FXML Label invalidTable;
    @FXML Label invalidDinner;

    @FXML TableView<order> tableViewOrder;
    @FXML Label errorLabel;


    @FXML private TableColumn<order, String> colomn1;
    @FXML private TableColumn<order, Double> colomn2;

    @FXML Button orderConfirmBack;


// this function is used at a back button of confirmation item
    public void Back_confirmOrder_Menu(ActionEvent event)
    {
        Parent root = null;
        try {
            // load Menu Fxml Gui and go back to menu GUI
            root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            Scene starterScene = new Scene(root);
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(starterScene);
            window.show();

        } catch (IOException e) {

        }

    }

    public void initAll()
    {
        // clear everything in confirmation GUI
            tableNumberText.setText("");
            dinnerNumbers.setText("");
            emptyTable.setVisible(false);
            emptyDinner.setVisible(false);
            invalidTable.setVisible(false);
            invalidDinner.setVisible(false);


            errorLabel.setVisible(false);
            totalLabel.setText("00.00");


            //object of bill to get data arraylist to populate tableview in confirmation GUI
            Bill temp = new Bill();
            PopulateTableView(temp.billItems);
            PopulateTotalBill();

    }
       // this function populates the table View
      public void PopulateTableView(ArrayList<order> c)
      {
          // clear previous table View
          tableViewOrder.getItems().clear();
          // setting coloumn propertiies
          colomn1.setCellValueFactory(new PropertyValueFactory<order, String>("Name"));
          colomn2.setCellValueFactory(new PropertyValueFactory<order, Double>("Price"));

          // creating a observable arrayList to populate table View
          ObservableList<order> order = FXCollections.observableArrayList(c);

          // populate table
          tableViewOrder.getItems().addAll(order);
      }

      // set the total bill label in GUI
      public void PopulateTotalBill()
      {
          // calculate total from arralist<order> prices
          Bill temp = new Bill();
          int x= temp.billItems.size();
          if(x>0)
          {
              double total=0.0;
              for (int i = 0; i < x; i++)
              {
                  String u = totalLabel.getText();
                  double y= Double.parseDouble(u);
                  y=y+temp.billItems.get(i).getPrice();
                  totalLabel.setText(String.valueOf(String.format("%.2f",y)));
              }

          }

      }

      // validation on confirm button
      public void OrderConfirmation(ActionEvent event) {

        // setting every error null
          emptyTable.setVisible(false);
          emptyDinner.setVisible(false);
          invalidTable.setVisible(false);
          invalidDinner.setVisible(false);

          // getting table number
          String TnT = tableNumberText.getText();
            // getting dinner number
          String TdN = dinnerNumbers.getText();

          // conversion of string to double
          String x = totalLabel.getText();
          double y = Double.parseDouble(x);
          // check for Zero Order Item
          if (y <= 0) {
              errorLabel.setVisible(true);
          }else if ("".equals(TnT))
          {
              // check for empty table number
                    emptyTable.setVisible(true);

          }else
              if("".equals(TdN)){
                  // check for empty dinner number
              emptyDinner.setVisible(true);
          }else
              if(! TnT.matches("\\d{0,9}?"))
          {
              // check for valid table number
                    invalidTable.setVisible(true);
          }else
              if(! TdN.matches("\\d{0,9}?")){
                  // check for valid table number
                    invalidDinner.setVisible(true);
          }else {

                  // if everything good, clear everthing and send order farward and reset for new customer
                  Bill temp = new Bill();
                  temp.clearBills();

                  Parent root = null;
                  try {

                      FXMLLoader loader= new FXMLLoader();
                      loader.setLocation(getClass().getResource("SuccessMessage.fxml"));
                      root = loader.load();


                      Scene starterScene = new Scene(root);


                      SuccessController controller= loader.getController();
                      controller.SetTable(TnT);

                      Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();



                      window.setScene(starterScene);
                      window.show();

                  } catch (IOException e) {

                  }
              }
          }
      }







