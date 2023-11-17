package csapat3.krutillazs.beadando.Modules;

import csapat3.krutillazs.beadando.Config;
import csapat3.krutillazs.beadando.Models.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DatabaseManager {
    private static Connection _connection;
    
    public void createConnection()  {
        String host = Config.get("DB_HOST");
        String username = Config.get("DB_USERNAME");
        String password = Config.get("DB_PASSWORD");

        try {
            _connection = DriverManager.getConnection(host, username, password);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public boolean verifyUserLogin(String username, String password) throws SQLException
    {
        try {
            String sql = "SELECT COUNT(*) as found, 'user' as usertype FROM users WHERE username = ? AND password = ?";
            PreparedStatement statement = _connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            
            ResultSet result = statement.executeQuery();

            if(result.next())
            {
                if(result.getInt("found") == 1)
                {
                    return true;
                }
            }
        } catch(SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return false;
    }
    
    public User getUserInformations(String username) throws SQLException
    {
        if(! isConnectionAlive()) { return null; }

        try {
            String sql = "SELECT username, firstname, lastname FROM users WHERE username = ?";
            PreparedStatement statement = _connection.prepareStatement(sql);
            statement.setString(1, username);

            ResultSet result = statement.executeQuery();

            if(result.next())
            {
                return new User(result.getString("username"), result.getString("firstname"), result.getString("lastname"));
            }
        } catch(SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return null;
    }

    private boolean isConnectionAlive() {
        try {
            return _connection != null && !_connection.isClosed();
        } catch (SQLException ex) {
            return false;
        }
    }
}
