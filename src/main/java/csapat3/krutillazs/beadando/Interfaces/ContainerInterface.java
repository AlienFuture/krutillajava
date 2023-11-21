package csapat3.krutillazs.beadando.Interfaces;

import csapat3.krutillazs.beadando.Utils.Container;

import java.util.function.Supplier;

public interface ContainerInterface {

    <T> void register(Class<T> clazz, Supplier<T> supplier);

    <T> T resolve(Class<T> clazz);

    static ContainerInterface getInstance() {
        return Container.getInstance();
    }
}
