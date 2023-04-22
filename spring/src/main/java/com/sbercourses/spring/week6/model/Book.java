package com.sbercourses.spring.week6.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//ORM - object relational mapping (объектно реляционное отображение)
public class Book {

  private Long id;
  private String title;
  private String author;
  private Date addedDate;

}
