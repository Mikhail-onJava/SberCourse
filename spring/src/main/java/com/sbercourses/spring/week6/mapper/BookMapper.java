package com.sbercourses.spring.week6.mapper;

import com.sbercourses.spring.week6.model.Book;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookMapper {

  public Book bookMapper(ResultSet resultSet) throws SQLException {
    Book book = new Book();
    book.setId((long) resultSet.getInt("id"));
    book.setTitle(resultSet.getString("title"));
    book.setAuthor(resultSet.getString("author"));
    book.setAddedDate(resultSet.getDate("date_added"));
    return book;
  }

  public List<Book> bookMapperFromList(ResultSet resultSet) throws SQLException {
    List<Book> list = new ArrayList<>();
    while (resultSet.next()) {
      list.add(bookMapper(resultSet));
    }
    return list;
  }
}
