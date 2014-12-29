package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage palco) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        palco.setTitle("Hello World");
        palco.setScene(new Scene(root, 300, 275));
        palco.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
