package ru.sbercource.newtask.mapper;

import org.springframework.stereotype.Component;
import ru.sbercource.newtask.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserMapper {

    public User userMapper(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setId(resultSet.getLong("id"));
        user.setLastName(resultSet.getString("lastName"));
        user.setFirstName(resultSet.getString("firstName"));
        user.setBirthDate(resultSet.getString("birthDate"));
        user.setPhoneNumber(resultSet.getString("phoneNumber"));
        user.setEmail(resultSet.getString("email"));
        user.setBooks(resultSet.getString("books"));
        return user;
    }
}
