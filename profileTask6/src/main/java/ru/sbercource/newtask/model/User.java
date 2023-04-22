package ru.sbercource.newtask.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private  Long id;
    private String lastName;
    private String firstName;
    private String birthDate;
    private String phoneNumber;
    private String email;
    private String books;



}
