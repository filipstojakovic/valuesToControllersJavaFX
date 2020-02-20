package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class MainController
{
    @FXML
    private TextField textField;

    @FXML
    void buttonClicked(ActionEvent event)
    {
        try
        {
            FXMLLoader loader=new FXMLLoader(getClass().getResource("../fxmls/SecoundController.fxml"));
            Parent root = (Parent)loader.load();

            SecoundController secoundController= loader.getController();
            secoundController.myFucntion(textField.getText());

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        }catch(Exception ex)
        {
           ex.printStackTrace();
        }


    }

}
