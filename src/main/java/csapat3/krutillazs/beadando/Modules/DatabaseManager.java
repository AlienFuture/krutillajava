package csapat3.krutillazs.beadando.Modules;

import csapat3.krutillazs.beadando.Enums.ConfigKey;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;


public class DatabaseManager {
    protected static Connection _connection;
    private static DatabaseManager _instance;

    public static DatabaseManager getInstance() {
        if(_instance == null) {
            _instance = new DatabaseManager();
        }

        return _instance;
    }
    
    public void createConnection()  {
        String host = ConfigKey.HOST.getValue();
        String username = ConfigKey.USERNAME.getValue();
        String password = ConfigKey.PASSWORD.getValue();

        try {
            _connection = DriverManager.getConnection(host, username, password);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return _connection;
    }

    private boolean isConnectionAlive() {
        try {
            return _connection != null && !_connection.isClosed();
        } catch (SQLException ex) {
            return false;
        }
    }
}
