package com.sbercourses.spring.week6;

import com.sbercourses.spring.week6.dao.BookDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private final BookDao bookDao;

    public Application(BookDao bookDao) {
        this.bookDao = bookDao;
    }

//  @Autowired
//  public void setBookDao(BookDao bookDao) {
//    this.bookDao = bookDao;
//  }

//  @Autowired
//  public Application(BookDao bookDao) {
//    this.bookDao = bookDao;
//  }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println(bookDao.findById(4L));
        System.out.println(bookDao.findAll());

    }
}
