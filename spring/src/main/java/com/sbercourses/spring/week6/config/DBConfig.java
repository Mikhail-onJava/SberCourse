package com.sbercourses.spring.week6.config;

import static com.sbercourses.spring.week6.DBConstants.DB_HOST;
import static com.sbercourses.spring.week6.DBConstants.DB_NAME;
import static com.sbercourses.spring.week6.DBConstants.PASSWORD;
import static com.sbercourses.spring.week6.DBConstants.PORT;
import static com.sbercourses.spring.week6.DBConstants.USER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class DBConfig {

  @Bean
  @Scope("singleton")
  public Connection connection() throws SQLException {
    return DriverManager.getConnection(
        "jdbc:postgresql://" + DB_HOST + ":" + PORT + "/" + DB_NAME,
        USER,
        PASSWORD);
  }
}
