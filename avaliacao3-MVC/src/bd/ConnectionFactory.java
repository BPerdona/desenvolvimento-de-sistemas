
package bd;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionFactory {
    
    private static final String url = "jdbc:mysql://localhost:3306/exemplo";
    private static final String login = "aula";
    private static final String senha = "senha123";
    
    public static Connection getConnection(){
        try{
            Connection connection = DriverManager.getConnection(url, login, senha);
            return connection;
        }
        catch(SQLException ex){
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}