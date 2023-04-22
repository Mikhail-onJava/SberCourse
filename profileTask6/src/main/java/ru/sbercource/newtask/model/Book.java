package ru.sbercource.newtask.model;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    private Long id;
    private  String title;
    private String author;
    private Integer date_of_publication;

}
