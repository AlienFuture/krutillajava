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

    public User verifyUserLogin(String username, String password) throws SQLException
    {
        return userRepository.authUser(username, password);
    }
}
