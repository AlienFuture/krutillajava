package csapat3.krutillazs.beadando;

import csapat3.krutillazs.beadando.Interfaces.IConfig;
import csapat3.krutillazs.beadando.Interfaces.IContainer;
import csapat3.krutillazs.beadando.Utils.Array;
import io.github.cdimascio.dotenv.Dotenv;

public final class Config implements IConfig {
    public static String get(String config) {
        Dotenv dotenv = Dotenv.load();
        IContainer container = IContainer.getInstance();

        Array Array = container.resolve(Array.class).setArray(IConfig.ACCEPTED_CONFIGS);

        if (!Array.has(config)) {
            throw new Error("Config is not supported. Supported list: " + String.join(", ", IConfig.ACCEPTED_CONFIGS));
        }

        return dotenv.get(config);
    }
}
