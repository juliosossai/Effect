package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.bancoDados.Conexao;

import java.sql.SQLException;

public class Main extends Application {

    @Override
    public void start(Stage palco) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("SceneBuilder.fxml"));
        palco.setTitle("Lista de Pedido Aberto");
        palco.setScene(new Scene(root, 1200, 680));
        palco.show();
    }




    public static void main(String[] args) throws SQLException {
        launch(args);
        Conexao.abreConexao();
    }
}
