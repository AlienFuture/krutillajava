package csapat3.krutillazs.beadando.Services;

import csapat3.krutillazs.beadando.Models.User;
import csapat3.krutillazs.beadando.Modules.DatabaseManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {
    private DatabaseManager databaseManager = DatabaseManager.getInstance();

    public User getUserInformations(String username) throws SQLException
    {
        try {
            String sql = "SELECT username, firstname, lastname FROM users WHERE username = ?";
            PreparedStatement statement = databaseManager.getConnection().prepareStatement(sql);
            statement.setString(1, username);

            ResultSet result = statement.executeQuery();

            if(result.next())
            {
                //return new User(result.getString("username"), result.getString("firstname"), result.getString("lastname"));
            }
        } catch(SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return null;
    }

    public boolean verifyUserLogin(String username, String password) throws SQLException
    {
        try {
            String sql = "SELECT COUNT(*) as found, 'user' as usertype FROM users WHERE username = ? AND password = ?";
            PreparedStatement statement = databaseManager.getConnection().prepareStatement(sql);
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
}
