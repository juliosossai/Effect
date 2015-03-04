package sample.bancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by juliosossai on 19/02/2015.
 */
public class Conexao {
    private static String URL ="jdbc:sqlserver://localhost;" + "databaseName=SATLPREMOT;";
    private static String usuario = "dbadmin";
    private static String password = "1";
    private static String DRIVER ="com.microsoft.sqlserver.jdbc.SQLServerDriver" ;


    public static Connection abreConexao() throws SQLException {
        try {

            Class.forName(DRIVER);
            Connection con = DriverManager.getConnection(URL, usuario, password);
            return con;


        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
            //throw new SQLException("Erro de conexão: Driver.");

        }

    }

}
