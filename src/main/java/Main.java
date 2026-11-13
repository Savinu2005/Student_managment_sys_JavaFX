<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        Starter.main(args);
=======
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();

    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/View/logging_page.fxml"))));
        stage.show();

>>>>>>> fed16670c883e971da283c5276cd38b1b20b6a3d
    }
}