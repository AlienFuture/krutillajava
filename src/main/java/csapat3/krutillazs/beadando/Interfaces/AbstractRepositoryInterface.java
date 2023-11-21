package csapat3.krutillazs.beadando.Interfaces;

import java.sql.SQLException;
import java.util.List;

public interface AbstractRepositoryInterface<T> {
    T findById(int id) throws SQLException;
    List<T> findAll() throws SQLException;
}