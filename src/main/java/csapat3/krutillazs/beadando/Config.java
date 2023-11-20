package csapat3.krutillazs.beadando;

import csapat3.krutillazs.beadando.Enums.ConfigKey;
import io.github.cdimascio.dotenv.Dotenv;

public final class Config {
    public static String get(ConfigKey config) {
        Dotenv dotenv = Dotenv.load();

        return dotenv.get(config.getKey());
    }
}
