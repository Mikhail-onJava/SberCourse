package ru.sbercource.newtask.dao;

import org.springframework.stereotype.Component;
import ru.sbercource.newtask.mapper.BookMapper;
import ru.sbercource.newtask.model.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class BookDao {
    private final Connection connection; // внедрение зависимости connection
    private final BookMapper bookMapper;

    public BookDao(Connection connection, BookMapper bookMapper) {
        this.connection = connection;
        this.bookMapper = bookMapper;
    } // связка connection и bookMapper с классом BookDao

    public Book findByTitle(String title) throws SQLException {
        PreparedStatement preparedStatement;
        preparedStatement = connection.prepareStatement("select * from books where title = ?");
        preparedStatement.setString(1, title);
        ResultSet resultSet = preparedStatement.executeQuery();
        Book book = new Book();
        while (resultSet.next()) {
            book = bookMapper.bookMapper(resultSet);
        }
        return book;
    }
}

