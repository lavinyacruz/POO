package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL="jdcp:mysql://localhost:3306/noeMeuSistema";
    private static final String USUARIO="root";
    private static final String SENHA="admin";

    public static Connection getConnetion() throws SQLException{
        return DriverManager.getConnection(URL,USUARIO,SENHA);
    }
}
