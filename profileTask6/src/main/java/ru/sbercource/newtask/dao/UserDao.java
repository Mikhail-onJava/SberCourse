package ru.sbercource.newtask.dao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.sbercource.newtask.mapper.UserMapper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import ru.sbercource.newtask.model.User;

@Component
@Scope ("prototype")
public class UserDao {
    private final Connection connection;
    private final UserMapper userMapper;

    public UserDao (Connection connection, UserMapper userMapper) {
        this.connection = connection;
        this.userMapper = userMapper;
    }

    public void addUser (User person){
       PreparedStatement preparedStatement;
       try {
           preparedStatement = connection.prepareStatement(
                   """
                   insert into users (lastName,firstName,birthDate,phoneNumber,email,books)
                   values (?,?,?,?,?,?)
           
                   """);
           preparedStatement.setString(1,person.getLastName());
           preparedStatement.setString(2,person.getFirstName());
           preparedStatement.setString(3,person.getBirthDate());
           preparedStatement.setString(4,person.getPhoneNumber());
           preparedStatement.setString(5,person.getEmail());
           preparedStatement.setString(6,person.getBooks());
           preparedStatement.execute();
           } catch (SQLException exception){
           throw new RuntimeException(exception);
       }
    }


    public User findByEmail(String email) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("select *from users where email = ?");
        preparedStatement.setString(1,email);
        ResultSet resultSet = preparedStatement.executeQuery();
        User user = new User();
        while (resultSet.next()){
            user = userMapper.userMapper(resultSet);
        }
        return user;
    }
}

