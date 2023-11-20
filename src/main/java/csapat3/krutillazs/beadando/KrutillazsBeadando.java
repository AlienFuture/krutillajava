package csapat3.krutillazs.beadando;

import csapat3.krutillazs.beadando.Providers.ContainerProvider;
import csapat3.krutillazs.beadando.Windows.LanguageSelect;

public class KrutillazsBeadando {

    public static void main(String[] args) {
        ContainerProvider.init();

        LanguageSelect.main(args);
    }
}
