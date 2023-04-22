package ru.sbercource.newtask.mapper;

import org.springframework.stereotype.Component;
import ru.sbercource.newtask.model.Book;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class BookMapper {
    public Book bookMapper (ResultSet resultset) throws SQLException{
        Book book = new Book();
        book.setId(resultset.getLong("id"));
        book.setTitle(resultset.getString("title"));
        book.setAuthor(resultset.getString("author"));
        book.setDate_of_publication(resultset.getInt("date_of_publication"));
        return book;
    }
}
