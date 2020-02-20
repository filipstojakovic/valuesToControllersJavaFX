package cripto;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

// TODO: implements Initializable
public class SecoundController implements Initializable
{
    @FXML
    private Label myLable;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
    }

    public void myFucntion(String myString)
    {
        myLable.setText(myString);
    }
}
