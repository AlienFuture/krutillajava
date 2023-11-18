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

        if (this.array == null) {
            throw new Error("Array is not set. Use setArray() method.");
        }

        for (String item : this.array) {
            if (item.equals(value)) {
                return true;
            }
        }

        return false;
    }
}
