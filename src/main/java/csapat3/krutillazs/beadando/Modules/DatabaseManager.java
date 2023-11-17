/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csapat3.krutillazs.beadando.Modules;

import csapat3.krutillazs.beadando.Models.Constants;
import csapat3.krutillazs.beadando.Models.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author balazsvamos
 */
public class DatabaseManager {
    private static Connection _connection;
    
    public static void createConnection() throws SQLException {
     _connection = DriverManager.getConnection(Constants.DBUrl, Constants.DBUsername, Constants.DBPassword);
    }
    
    public static boolean isConnectionAlive()
    {
        try {
        if(_connection != null)
            if(!_connection.isClosed())
                return true;
        return false;
        } catch(SQLException ex) {
            return false;
        }
    }
    
    public static boolean verifyUserLogin(String username, String password) throws SQLException
    {
        if(isConnectionAlive())
        {
            try
            {
                PreparedStatement statement = _connection.prepareStatement("""
                             SELECT COUNT(*) as found, 'user' as usertype FROM users
                             WHERE username = ? AND password = ?
                             """);
                statement.setString(1, username);
                statement.setString(2, password);
            
                ResultSet result = statement.executeQuery();
            
                while(result.next())
                {
                    boolean found = result.getInt(1) > 0;
                    return found;
                
                }
            } catch(SQLException ex)
            {
                return false;
            }
        }
        return false;
    }
    
    public static User getUserInformations(String username) throws SQLException
    {
        if(isConnectionAlive())
        {
            try
            {
                PreparedStatement statement = _connection.prepareStatement("""
                                        SELECT username, firstname, lastname
                                        FROM users
                                        WHERE username = ?
                                        """);
                statement.setString(1, username);
                
                ResultSet result = statement.executeQuery();
                
                while(result.next())
                {
                    return new User(result.getString("username"), result.getString("firstname"), result.getString("lastname"));
                }
            } catch(SQLException ex)
            {
                return null;
            }  
        }
        return null;
    }
}
