package csapat3.krutillazs.beadando.Services;

import csapat3.krutillazs.beadando.Models.User;
import csapat3.krutillazs.beadando.Modules.DatabaseManager;
import csapat3.krutillazs.beadando.Repositories.UserRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {
    private final DatabaseManager databaseManager = DatabaseManager.getInstance();
    private final UserRepository userRepository = new UserRepository();

    public User getUserInformations(String username) throws SQLException
    {
        try {
            String sql = "SELECT username, firstname, lastname FROM users WHERE username = ?";
            PreparedStatement statement = databaseManager.getConnection().prepareStatement(sql);
            statement.setString(1, username);

            ResultSet result = statement.executeQuery();

            if(result.next())
            {
                User user = new User();
                user.setFirstname(result.getString("firstname"));
                user.setLastname(result.getString("lastname"));
                user.setUsername(result.getString("username"));

            }
        } catch(SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return null;
    }

    public User verifyUserLogin(String username, String password) throws SQLException
    {
        return userRepository.authUser(username, password);
    }
}
