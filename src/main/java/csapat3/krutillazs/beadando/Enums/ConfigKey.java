package csapat3.krutillazs.beadando.Enums;

import csapat3.krutillazs.beadando.Config;

public enum ConfigKey {
    HOST("DB_HOST"),
    USERNAME("DB_USERNAME"),
    PASSWORD("DB_PASSWORD");

    private final String key;

    ConfigKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }

    public String getValue() {
        return Config.get(this);
    }
}
