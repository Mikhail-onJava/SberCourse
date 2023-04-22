package tasks.library;

import tasks.library.dao.BookDao;
import tasks.library.dao.GenericDao;

public class Main {
    public static void main(String[] args) {
        GenericDao<Book> dao = new BookDao();
        dao.create(new Book(1, "test", "test"));
        dao.create(new Book(2, "test2", "test2"));
        dao.create(new Book(3, "test3", "test3"));
    
        System.out.println("GET_ALL");
        dao.getAll().forEach((i) -> {
            System.out.println(i.getTitle());
        });
    
        System.out.println("GET_BY_ID");
        System.out.println(dao.getById(1).getTitle());
        
        dao.delete(1);
        System.out.println("AFTER_DELETE");
        dao.getAll().forEach((i) -> {
            System.out.println(i.getTitle());
        });
        
        Book book = dao.getById(2);
        book.setTitle("UPDATED");
        dao.update(book);
        System.out.println("AFTER_UPDATE");
        dao.getAll().forEach((i) -> {
            System.out.println(i.getTitle());
        });
    }
}
