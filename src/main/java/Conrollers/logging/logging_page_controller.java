package Conrollers.logging;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class logging_page_controller {

    loggingController loggingController = new loggingController();

    @FXML
    private Button btnlogin;

    @FXML
    private AnchorPane btnsubbmit;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private TextField txtusername;

    @FXML
    void btnloginaction(ActionEvent event) {
        if (loggingController.checkUserNameandPassword(txtusername.getText(), txtpassword.getText())){
            Stage stage = new Stage();
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/View/homepage.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.show();
        }

    }


}
