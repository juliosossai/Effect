package sample.controle;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.Date;

/**
 * Created by juliosossai on 22/02/2015.
 */
public class Employee {

    private final SimpleStringProperty chaveFato;
    private final SimpleIntegerProperty num_docto;
    private final SimpleStringProperty docto;
    private final SimpleStringProperty dataMovto;

    public Employee(String chaveFato, int num_docto, String docto, String dataMovto) {
        this.chaveFato = new SimpleStringProperty(chaveFato);
        this.num_docto = new SimpleIntegerProperty(num_docto);
        this.docto = new SimpleStringProperty(docto);
        this.dataMovto = new SimpleStringProperty(dataMovto);
    }

    public String getChaveFato(){
        return chaveFato.get();
    }

    public Integer getNum_docto(){
        return num_docto.get();
    }

    public String getDocto(){
        return docto.get();
    }

    public String getDataMovto(){
        return dataMovto.get();
    }


}

