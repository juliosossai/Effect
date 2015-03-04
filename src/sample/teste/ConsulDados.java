package sample.teste;

import sample.bancoDados.Conexao;

import javax.swing.*;
import java.sql.*;

/**
 * Created by juliosossai on 21/02/2015.
 */
public class ConsulDados {



    public static void main(String arg[]) throws SQLException{

        Connection con = new Conexao().abreConexao();

        String sql = ("Select top(10) cod_municipio, uf, nome from tbmunicipio where uf = 'PR'");

        PreparedStatement stmt = con.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        while(rs.next()) { //Enquanto tiver resultado vai listar.
            System.out.println("|" + rs.getInt("cod_municipio") + " | " + rs.getString("uf") + " | " + rs.getString("nome"));
        }
        rs.close();
        stmt.close();

   }
}
