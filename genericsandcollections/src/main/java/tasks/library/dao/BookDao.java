package tasks.library.dao;

import tasks.library.Book;
import tasks.library.Library;

import java.util.ArrayList;
import java.util.List;

public class BookDao implements GenericDao<Book> {
    List<Book> books = new ArrayList<>(Library.getBookList());
    
    @Override
    public Book getById(Integer id) {
        for(Book book : books) {
            if(book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }
    
    @Override
    public void create(Book obj) {
        books.add(obj);
        save(books);
    }
    
    @Override
    public void update(Book obj) {
        delete(obj.getId());
        create(obj);
        save(books);
    }
    
    @Override
    public void delete(Integer id) {
        books.remove(getById(id));
        save(books);
    }
    
    @Override
    public List<Book> getAll() {
        return Library.getBookList();
    }
    //ДОПИСАТЬ ОСТАВШИЕСЯ МЕТОДЫ
    
    public void save(List<Book> list) {
        Library.setBookList(list);
    }
}
