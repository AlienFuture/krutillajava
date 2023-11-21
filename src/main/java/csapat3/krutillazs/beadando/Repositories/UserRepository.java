package csapat3.krutillazs.beadando.Repositories;

import csapat3.krutillazs.beadando.Abstracts.AbstractRepository;
import csapat3.krutillazs.beadando.Interfaces.Repository.Addable;
import csapat3.krutillazs.beadando.Interfaces.Repository.Deletable;
import csapat3.krutillazs.beadando.Interfaces.Repository.Updateable;
import csapat3.krutillazs.beadando.Models.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository extends AbstractRepository<User, Integer> implements Addable<User>, Updateable<User>, Deletable<User> {

    @Override
    public void add(User entity) {
        //TODO: Implement this method
    }

    @Override
    public void update(User entity){
        //TODO: Implement this method
    }

    @Override
    public void remove(User entity) {
        //TODO: Implement this method
    }

    @Override
    public User findById(Integer integer) {
        return null;
    }

    @Override
    public User findById(int id) throws SQLException {
        String sql = "SELECT * FROM users WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, id);

        ResultSet queryResult = statement.executeQuery();

        if (queryResult.next()) {
            String firstname = queryResult.getString(User.FIELD_FIRSTNAME);
            String lastname = queryResult.getString(User.FIELD_LASTNAME);
            String created_at = queryResult.getString(User.FIELD_CREATED_AT);
            String updated_at = queryResult.getString(User.FIELD_UPDATED_AT);
            boolean is_deleted = queryResult.getBoolean(User.FIELD_IS_DELETED);

            User user = new User();
            user.setId(id);
            user.setFirstname(firstname);
            user.setLastname(lastname);
            user.setCreatedAt(created_at);
            user.setUpdatedAt(updated_at);
            user.setIsDeleted(is_deleted);

            return user;
        }

        return null;
    }

    @Override
    public List<User> findAll() throws SQLException {
        String sql = "SELECT * FROM users";
        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet queryResult = statement.executeQuery();

        List<User> users = new ArrayList<>();

        while (queryResult.next()) {
            int id = queryResult.getInt(User.FIELD_ID);
            String firstname = queryResult.getString(User.FIELD_FIRSTNAME);
            String lastname = queryResult.getString(User.FIELD_LASTNAME);
            String created_at = queryResult.getString(User.FIELD_CREATED_AT);
            String updated_at = queryResult.getString(User.FIELD_UPDATED_AT);
            boolean is_deleted = queryResult.getBoolean(User.FIELD_IS_DELETED);

            User user = new User();
            user.setId(id);
            user.setFirstname(firstname);
            user.setLastname(lastname);
            user.setCreatedAt(created_at);
            user.setUpdatedAt(updated_at);
            user.setIsDeleted(is_deleted);

            users.add(user);
        }

        return users;
    }

    public User authUser(String username, String password) {
        try {
            String sql = "SELECT COUNT(*) as found, 'user' as usertype FROM users WHERE username = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet result = statement.executeQuery();

            if(result.next())
            {
                if(result.getInt("found") == 1)
                {
                    int id = result.getInt(User.FIELD_ID);
                    String firstname = result.getString(User.FIELD_FIRSTNAME);
                    String lastname = result.getString(User.FIELD_LASTNAME);
                    String created_at = result.getString(User.FIELD_CREATED_AT);
                    String updated_at = result.getString(User.FIELD_UPDATED_AT);
                    boolean is_deleted = result.getBoolean(User.FIELD_IS_DELETED);

                    User user = new User();
                    user.setId(id);
                    user.setUsername(username);
                    user.setFirstname(firstname);
                    user.setLastname(lastname);
                    user.setCreatedAt(created_at);
                    user.setUpdatedAt(updated_at);
                    user.setIsDeleted(is_deleted);

                    return user;
                }
            }
        } catch(SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        return null;
    }
}
