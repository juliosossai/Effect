package sample.telas;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by juliosossai on 29/12/2014.
 */
public class Informacao extends Application {

    private BorderPane borderPane = new BorderPane();


    @Override
    public void start(Stage palco) throws Exception {
        borderPane.paddingProperty().setValue(new Insets(10));




        palco.setScene(new Scene(borderPane, 1200, 680));
        palco.show();

    }
}
