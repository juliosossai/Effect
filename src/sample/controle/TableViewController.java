package sample.controle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by juliosossai on 22/02/2015.
 */
public class TableViewController implements Initializable {

    @FXML
    private TableView<Employee> tabDados;

    @FXML
    private TableColumn<Employee, String> chaveFato;
    @FXML
    private TableColumn<Employee, Integer> num_Docto;
    @FXML
    private TableColumn<Employee, String> docto;
    @FXML
    private TableColumn<Employee, String> dataMovto;


    ObservableList<Employee> data = FXCollections.observableArrayList(
            new Employee("000000",123,"PVE","01/02/2014"),
            new Employee("111111",234,"PVE","05/02/2014"),
            new Employee("222222",555,"PVE","07/02/2014")
    );


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        chaveFato.setCellValueFactory(new PropertyValueFactory<Employee, String>("chaveFato"));
        num_Docto.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("num_Docto"));
        docto.setCellValueFactory(new PropertyValueFactory<Employee, String>("docto"));
        dataMovto.setCellValueFactory(new PropertyValueFactory<Employee, String>("dataMovto"));
        tabDados.setItems(data);

    }
}
