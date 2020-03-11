import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/view/gui.fxml"));
        primaryStage.setTitle("Fahrenheit <--> Celcius Converter");
        Scene scene = new Scene(root, 600, 515);
        scene.getStylesheets().add(getClass().getResource("/resource/sky.css").toExternalForm());
        scene.getStylesheets().add(getClass().getResource("/resource/flatred.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
