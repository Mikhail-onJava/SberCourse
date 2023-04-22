package tasks.library.dao;

import tasks.library.Book;

import java.util.List;

public interface GenericDao<T> {
    
     T getById(Integer id);
     void create(T obj);
     void update(T obj);
     void delete(Integer id);
     List<T> getAll();
}
