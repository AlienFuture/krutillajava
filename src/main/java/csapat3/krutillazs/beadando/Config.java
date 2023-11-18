package csapat3.krutillazs.beadando;

import csapat3.krutillazs.beadando.Enums.ConfigKey;
import csapat3.krutillazs.beadando.Interfaces.IContainer;
import csapat3.krutillazs.beadando.Utils.Array;
import io.github.cdimascio.dotenv.Dotenv;

public final class Config {
    public static String get(String config) {
        Dotenv dotenv = Dotenv.load();
        IContainer container = IContainer.getInstance();

        Array Array = container.resolve(Array.class).setArray(ConfigKey.getAcceptedConfigs());

        if (!Array.has(config)) {
            throw new Error("Config is not supported. Supported list: " + String.join(", ", ConfigKey.getAcceptedConfigs()));
        }

        return dotenv.get(config);
    }
}
