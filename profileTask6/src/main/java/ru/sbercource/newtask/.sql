CREATE TABLE users
(
    id          serial primary key not null,
    lastName    varchar            not null,
    firstName   varchar            not null,
    birthDate   varchar            not null,
    phoneNumber varchar            not null,
    email       varchar            not null,
    books       varchar            not null
);

INSERT INTO users (lastName, firstName, birthDate, phoneNumber, email, books)
VALUES ('Менчинев', 'Михаил', '1992/03/21', '498983930', 'yandex.com', 'Тарас Бульба, На западном фронте без перемен');

CREATE TABLE books
(
    id                  serial primary key not null,
    title               varchar            not null,
    author              varchar            not null,
    date_of_publication varchar            not null
);

INSERT INTO books (title,author,date_of_publication)
VALUES ('Ревизор', 'Николай Гоголь', 1835 );
INSERT INTO books (title,author,date_of_publication)
VALUES ('Тарас Бульба', 'Николай Гоголь', 1835 );
INSERT INTO books (title,author,date_of_publication)
VALUES ('Горе от ума', 'Александр Грибоедов', 1825 );
INSERT INTO books (title,author,date_of_publication)
VALUES ('На Западном фронте без перемен', 'Эрих Мария Ремарк', 1929 );

