package csapat3.krutillazs.beadando.ResourceBundle;

import csapat3.krutillazs.beadando.Localization.Localization;


import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleLocalization {

        private static ResourceBundleLocalization instance = null;

        private ResourceBundleLocalization() {

        }

        public static ResourceBundleLocalization getInstance() {
            if (instance == null) {
                instance = new ResourceBundleLocalization();
            }

            return instance;
        }

        public String get(String key) {
            Localization localization = Localization.getInstance();

            Locale.Builder locale = new Locale.Builder().setLanguageTag(localization.getLocalization());

            ResourceBundle resourceBundle = ResourceBundle.getBundle("resource", locale.build());
            System.out.println(resourceBundle.getLocale());

            return resourceBundle.getString(key);
        }
}
