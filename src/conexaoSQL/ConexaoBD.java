package conexaoSQL;

import java.sql.*;

public class ConexaoBD {
    
    public static Connection conectorBD() {
    Connection conexao = null;
    String driver = "com.mysql.jdbc.Driver";
    
    String url = "jdbc:mysql://localhost:3306/cadastroibms";
    String user = "root";
    String pass = "";
    
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, pass);
            return conexao;
            
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
    }
}
