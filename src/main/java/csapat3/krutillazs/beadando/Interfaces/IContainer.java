package csapat3.krutillazs.beadando.Interfaces;
import java.util.function.Supplier;

public interface IContainer {
    <T> void register(Class<T> clazz, Supplier<T> supplier);

    <T> T resolve(Class<T> clazz);
}
