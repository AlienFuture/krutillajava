package csapat3.krutillazs.beadando.Providers;

import csapat3.krutillazs.beadando.Interfaces.ContainerInterface;
import csapat3.krutillazs.beadando.Services.GeneralService;

/**
 * Register services to the container
 */
public final class ContainerProvider {
    public static void init() {
        ContainerInterface container = ContainerInterface.getInstance();

        container.register(GeneralService.class, GeneralService::new);
        //container.register(DatabaseManager.class, DatabaseManager::new);
    }
}
