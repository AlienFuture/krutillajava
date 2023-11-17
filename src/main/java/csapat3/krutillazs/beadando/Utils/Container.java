package csapat3.krutillazs.beadando.Utils;

import csapat3.krutillazs.beadando.Interfaces.IContainer;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 *Register services to the container
 */
public class Container implements IContainer {

    private final Map<Class<?>, Supplier<?>> services = new HashMap<>();

    private static Container instance = null;

    /**
     * Singleton pattern
     */
    public static Container getInstance() {
        if (instance == null) {
            instance = new Container();
        }

        return instance;
    }

    public <T> void register(Class<T> clazz, Supplier<T> supplier) {
        services.put(clazz, supplier);
    }

    @SuppressWarnings("unchecked")
    public <T> T resolve(Class<T> clazz) {
        Supplier<?> supplier = services.get(clazz);

        if (supplier != null) {
            return (T) supplier.get();
        }

        try {
            return clazz.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException("Error creating instance of " + clazz.getName(), e);
        }
    }
}
