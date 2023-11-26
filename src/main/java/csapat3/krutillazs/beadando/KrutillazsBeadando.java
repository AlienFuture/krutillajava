package csapat3.krutillazs.beadando;

import csapat3.krutillazs.beadando.Modules.DatabaseManager;
import csapat3.krutillazs.beadando.Providers.ContainerProvider;
import csapat3.krutillazs.beadando.Utils.Logger;
import csapat3.krutillazs.beadando.Windows.LanguageSelect;

public class KrutillazsBeadando {

    /**
     * ENTRY POINT
     * @param args
     */
    public static void main(String[] args) {
        ContainerProvider.init();

        DatabaseManager databaseManager = DatabaseManager.getInstance();
        databaseManager.createConnection();

        Logger logger = Logger.getInstance();
        logger.log("Application started");

        LanguageSelect.main(args);
    }
}
