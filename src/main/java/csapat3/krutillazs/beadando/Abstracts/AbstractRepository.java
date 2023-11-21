package csapat3.krutillazs.beadando.Abstracts;

import csapat3.krutillazs.beadando.Interfaces.AbstractRepositoryInterface;
import csapat3.krutillazs.beadando.Modules.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

abstract public class AbstractRepository<T, ID> implements AbstractRepositoryInterface<T> {
    protected Connection connection;

    protected AbstractRepository() {
        connection = DatabaseManager.getInstance().getConnection();
    }

    // Find an entity by its ID
    public abstract T findById(ID id) throws SQLException;

    // Find all entities
    public abstract List<T> findAll() throws SQLException;
}
