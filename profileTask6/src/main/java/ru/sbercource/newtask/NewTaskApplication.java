package ru.sbercource.newtask;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import ru.sbercource.newtask.dao.BookDao;
import ru.sbercource.newtask.model.User;
import ru.sbercource.newtask.dao.UserDao;
import ru.sbercource.newtask.service.UserService;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class NewTaskApplication implements CommandLineRunner {
    private final UserService userService;
    private final BookDao bookDao;
    private final UserDao userDao;


    public NewTaskApplication(BookDao bookDao, UserService userService, UserDao userDao) {
        this.userService = userService;
        this.bookDao = bookDao;
        this.userDao=userDao;

    }

    public static void main(String[] args) {
        SpringApplication.run(NewTaskApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User(2L,"Георгин", "Олег", "1987/05/20", "8999656563", "mail@com", "Горе от ума, Ревизор");
        userDao.addUser(user);
        user = userService.getUserBooksByEmail("mail@com");
        for (String title : user.getBooks().split(", ")) {
            System.out.println(bookDao.findByTitle(title));
        }
    }
}

//    User user = new User("Георгин", "Олег", "1987/05/20", "8999656563", "mail@com", "Горе от ума, Ревизор");
//       UserDao.addUser(user);