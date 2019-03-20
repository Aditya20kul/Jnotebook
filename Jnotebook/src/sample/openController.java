package sample;

import javafx.fxml.FXML;

import javafx.scene.control.Label;
import  javafx.fxml.Initializable;
public class openController {
@FXML
private Label newfilename;
@FXML
     private void transferMessage(String name) {
        newfilename.setText(name);
    }
}
