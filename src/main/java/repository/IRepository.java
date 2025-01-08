package repository;

import java.util.List;

public interface IRepository {
    void add(Object obj);
    void remove(Object obj);
    void update(Object obj);
    void findById(Long id);
    List<Object> findAll();
    int getIndex(Long id);
    boolean existsById(Long id);
}
