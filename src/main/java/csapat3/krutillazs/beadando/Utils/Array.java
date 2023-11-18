package csapat3.krutillazs.beadando.Utils;

public class Array {

    private String[] array;

    public String[] getArray() {
        return array;
    }

    public Array setArray(String[] array) {
        this.array = array;

        return this;
    }

    public boolean has(String value) {
        for (String item : this.array) {
            if (item.equals(value)) {
                return true;
            }
        }

        return false;
    }
}
