package csapat3.krutillazs.beadando.Interfaces;

import csapat3.krutillazs.beadando.Config;

public interface IConfig {
    String HOST = "DB_HOST";
    String USERNAME = "DB_USERNAME";
    String PASSWORD = "DB_PASSWORD";
    String[] ACCEPTED_CONFIGS = new String[] {HOST, USERNAME, PASSWORD};

    static String get(String config) {
        return Config.get(config);
    }
}
