package csapat3.krutillazs.beadando;

import io.github.cdimascio.dotenv.Dotenv;

public final class Config {
    public static String get(String config) {
        Dotenv dotenv = Dotenv.load();

        return dotenv.get(config);
    }
}
