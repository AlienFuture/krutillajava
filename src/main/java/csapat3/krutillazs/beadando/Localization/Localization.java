package csapat3.krutillazs.beadando.Localization;

import csapat3.krutillazs.beadando.Enums.LocalizationList;

public class Localization {

    private static final String FALLBACK_LOCALIZATION = "en-US";
    public String localization;
    private static Localization instance = null;

    private Localization() {

    }

    public static Localization getInstance() {
        if (instance == null) {
            instance = new Localization();
        }

        return instance;
    }

    public String getLocalization() {
        // check if localization is set
        if (localization != null) {
            return localization;
        }

        // if not set, return fallback
        return FALLBACK_LOCALIZATION;
    }

    public void setLocalization(LocalizationList localization) {
        this.localization = localization.getKey();
    }
}
