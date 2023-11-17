package csapat3.krutillazs.beadando.Providers;

import csapat3.krutillazs.beadando.Config;
import csapat3.krutillazs.beadando.Modules.DatabaseManager;
import csapat3.krutillazs.beadando.Services.GeneralService;
import csapat3.krutillazs.beadando.Utils.Container;

/**
 * Register services to the container
 */
public final class ContainerProvider {
    public static void init() {
        Container container = Container.getInstance();

        container.register(GeneralService.class, GeneralService::new);
        //container.register(DatabaseManager.class, DatabaseManager::new);
        container.register(Config.class, Config::new);
    }
}
