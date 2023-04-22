package tasks.library;

import java.util.Objects;

public class Book {
    
    private Integer id;
    private String title;
    private String author;
    
    public Book(Integer id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public Book() {
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    //Если x.equals(y) == true, то обязательно hashcode(x) == hashcode(y)
//  Если hashcode(x) == hashcode(y), то не обязательно x.equals(y) == true
    @Override
    public boolean equals(Object o) {
        // self check
        if(this == o) {
            return true;
        }
        // null check
        if(o == null) {
            return false;
        }
        
        if(getClass() != o.getClass()) {
            return false;
        }
        
        Book book = (Book) o;
        
        return Objects.equals(title, book.title) &&
               Objects.equals(author, book.author);
    }
    

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }
}
