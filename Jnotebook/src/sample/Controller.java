package sample;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Loader;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import java.util.Scanner;
import javafx.scene.*;
import javafx.scene.control.TextField;
import java.lang.String;

public class Controller {

    @FXML
    private TextField txt;
    @FXML
    private ListView filelist;
    @FXML
    public void createnew() {
        //System.out.println("Hi");
        Scanner sc = new Scanner(System.in);

        String name = txt.getText();
        System.out.println(name);
        filelist.getItems().add(name+ ".java");
        //openController scene2Controller = loader.getController();
        //Pass whatever data you want. You can have multiple method calls here

        //scene2Controller.transferMessage(name);
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("open.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            //openController openController = fxmlLoader.getController();
           // openController.transferMessage(name);
            Stage stage = new Stage();
            stage.setTitle("second page");
            stage.setScene(new Scene(root1));
            stage.show();
        }
        catch (Exception e)
        {
            System.out.println("Something Went Wrong");
        }



    }


}

