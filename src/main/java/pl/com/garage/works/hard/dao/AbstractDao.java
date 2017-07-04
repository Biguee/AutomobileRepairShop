package pl.com.garage.works.hard.dao;

import java.util.List;

/**
 * Created by 8760w on 2017-07-04.
 */
public interface AbstractDao<T> {

    // Create
    void save(T entity);

    void save(List<T> entities);

//    // Read
//    T findById(int id);
//
//    List<T> findAll();
//
//    // Update
//    void update(T entity);
//
//    // Delete
//    void delete(T entity);
}
