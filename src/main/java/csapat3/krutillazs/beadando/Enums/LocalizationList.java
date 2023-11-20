package csapat3.krutillazs.beadando.Enums;

public enum LocalizationList {
    HU("hu-HU"),
    EN("en-US");

    private final String key;

    LocalizationList(String key) {
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }
}
