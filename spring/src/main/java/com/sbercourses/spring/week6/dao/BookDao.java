package com.sbercourses.spring.week6.dao;

import com.sbercourses.spring.week6.DBApp;
import com.sbercourses.spring.week6.mapper.BookMapper;
import com.sbercourses.spring.week6.model.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class BookDao {

  private BookMapper bookMapper = new BookMapper();
  private final Connection connection;

  public BookDao(Connection connection) {
    this.connection = connection;
  }

  public Book findById(Long id) throws SQLException {
    PreparedStatement preparedStatement = connection.prepareStatement("select * from books where id = ?");
    preparedStatement.setInt(1, Math.toIntExact(id));
    ResultSet resultSet = preparedStatement.executeQuery();
    Book book = new Book();
    while (resultSet.next()) {
      book = bookMapper.bookMapper(resultSet);
    }
    return book;
  }

  public List<Book> findAll() throws SQLException {
    List<Book> books = new ArrayList<>();
      PreparedStatement preparedStatement = connection.prepareStatement("select * from books");
      ResultSet resultSet = preparedStatement.executeQuery();
      books.addAll(bookMapper.bookMapperFromList(resultSet));
    return books;
  }

}
