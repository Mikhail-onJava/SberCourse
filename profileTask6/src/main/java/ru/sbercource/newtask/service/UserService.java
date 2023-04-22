package ru.sbercource.newtask.service;
import org.springframework.stereotype.Component;
import ru.sbercource.newtask.model.User;
import ru.sbercource.newtask.dao.UserDao;
import java.sql.SQLException;
@Component
public class UserService {
    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

public User getUserBooksByEmail (String email) throws SQLException{
        return this.userDao.findByEmail(email);
}
}
