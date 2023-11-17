package csapat3.krutillazs.beadando;

import csapat3.krutillazs.beadando.Providers.ContainerProvider;
import csapat3.krutillazs.beadando.Windows.LoginWindow;


public class KrutillazsBeadando {

    public static void main(String[] args) {
        ContainerProvider.init();

        LoginWindow.main(args);
    }
}
