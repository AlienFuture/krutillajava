package csapat3.krutillazs.beadando.Modules;

import csapat3.krutillazs.beadando.Enums.ConfigKey;
import csapat3.krutillazs.beadando.Enums.LogType;
import csapat3.krutillazs.beadando.Utils.Logger;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;


public class DatabaseManager {
    protected static Connection _connection;
    private static DatabaseManager _instance;

    public static DatabaseManager getInstance() {
        if(_instance == null) {
            _instance = new DatabaseManager();
           Logger.log("Initializing Database manager Instance", LogType.INFO);
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
            Logger.log("Could not connect to database because of " + ex.getMessage(), LogType.INFO);
        }
    }

    public Connection getConnection() {
        return _connection;
    }
}
