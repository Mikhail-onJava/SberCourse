create table books
(
    id         serial primary key,
    title      varchar(30),
    author     varchar(30),
    test       integer not null,
    date_added timestamp
);

-- Посмотрели, что таблица пуста:
select *
from books;

insert into books(title, author, date_added)
values ('Недоросль', 'Д. И. Фонвизин', now());

insert into books(title, author, date_added)
values ('Путешествие из Петербурга в Москву', 'А. Н. Радищев', now() - interval '24h');

alter table books
    alter column author type varchar(100);

alter table books
    alter column title type varchar(100);

insert into books(id, title, author, date_added)
values (3, 'Доктор Живаго', 'Б. Л. Пастернак', now() - interval '24h');

insert into books
values (4, 'Сестра моя - жизнь', 'Б. Л. Пастернак', now());

delete
from books
where id = 1;

insert into books
values (1, 'Недоросль', 'Д. И. Фонвизин', now());

truncate table books;
truncate table reviews;

drop table books;
drop table reviews;
create table books
(
    id         serial primary key,
    title      varchar(100) NOT NULL,
    author     varchar(100) NOT NULL,
    date_added timestamp    NOT NULL
);
INSERT INTO books(title, author, date_added)
VALUES ('Недоросль', 'Д. И. Фонвизин', now());

INSERT INTO books(title, author, date_added)
VALUES ('Путешествие из Петербурга в Москву', 'А. Н. Радищев', now() - interval '24h');

INSERT INTO books(title, author, date_added)
VALUES ('Доктор Живаго', 'Б. Л. Пастернак', now() - interval '24h');

INSERT INTO books(title, author, date_added)
VALUES ('Сестра моя - жизнь', 'Б. Л. Пастернак', now());

select *
from books
where id = 2;

select *
from books
limit 5;
select *
from books
offset 2;
select *
from books
offset 2 limit 5;

-- current page - 1 * количество записей на странице limit количество записей на странице

-- Найти автора книги по названию ‘Недоросль’
select *
from books
where title = 'Недоросль';

-- Найти все книги Пастернака
select *
from books
where author like '%Пастернак';

-- Вывести максимальный id в таблице
select max(id)
from books;

-- Найти все книги Радищева или Пастернака отсортированные по дате в обратном порядке
select *
from books
where author like '%Пастернак'
   or author like '%Радищев'
order by date_added DESC;

-- Найти все книги Пастернака добавленные вчера
-- now() - interval '24h'
select *
from books
where author like '%Пастернак'
  and date_added <= now() - interval '24h'
  and date_added >= now() - interval '48h';

update books
set date_added = '2020-02-02'
where id = 2;

update books
set date_added = '2020-02-02'
where title like '%Недоросль';

select *
from books;

create table reviews
(
    id       serial primary key,
    book_id  integer REFERENCES books,
    reviewer varchar(100) not null,
    rating   integer      not null,
    comment  varchar(255) null
);

-- books <- reviews
-- 1:1 один к одному
-- человек - паспорт
--
-- user
-- id=1
-- pass_id=2
--
-- passport
-- id=2
-- user_id=1
--
-- 1:М один ко многим
-- user
-- id = 1
-- name
-- last_name
-- age
--
-- phones
-- id = 1
-- number = 21312312
-- user_id = 1
--
-- select * from phones where user_id = 1;
--
-- М:М
-- cinema
-- id
-- title
--
-- usr
-- id
-- fio
--
-- cinema_cast
-- id
-- usr_id
-- cinema_id
--
-- select * from cinema_cast where usr_id = 2;

insert into reviews(book_id, reviewer, rating, comment)
values (2, 'петя', 9, 'Хорошая книга');

select *
from reviews;

INSERT INTO reviews(book_id, reviewer, rating)
VALUES (1, 'Кирилл', 9);
INSERT INTO reviews(book_id, reviewer, rating, comment)
VALUES (2, 'Петя', 7, 'ок');
INSERT INTO reviews(book_id, reviewer, rating, comment)
VALUES (3, 'Иннокентий', 2, 'не понравилась');

-- Достать только те записи reviews, у которых comment != null
select *
from reviews
where comment is not null;

-- Посчитать сколько всего записей в reviews. Назвать столбец Количество отзывов
select count(*) as rewie_count
from reviews;

-- Узнать количество уникальных id книг, по которым были оставлены отзывы:
-- Оператор SELECT DISTINCT используется для возврата только различных (различных) значений
select count(distinct book_id)
from reviews;

select *
from reviews;

-- Вывести сколько review по каждой id книги;
select count(*), book_id
from reviews
group by book_id;

-- Вывести все значения по books и по reviews (объединение столбцов результатов)
select *
from books b,
     reviews r
where b.id = r.book_id;

select *
from books b
         join reviews r on b.id = r.book_id;

-- А через left join добъемся вывода книги, для которой нет отзывов
select *
from books b
         left join reviews r on b.id = r.book_id;


delete
from books
where id = 1;
delete
from reviews
where id = 2;

alter table reviews
    drop constraint reviews_book_id_fkey;

alter table reviews
    add constraint reviews_book_id_fkey
        foreign key (book_id)
            references books (id)
            on delete cascade on update no action;

delete
from books
where id = 2;

--ACID
-- A - Atomicity - атомарность
-- C - Consistency - согласованность
-- I - Isolation - изолированность
-- D - Durability - Надежность

-- Атомарность гарантирует, что каждая транзакция будет выполнена полностью или не будет выполнена совсем.
-- Не допускаются промежуточные состояния.

-- Согласованность Это свойство вытекает из предыдущего.
-- Благодаря тому, что транзакция не допускает промежуточных результатов,
-- база остается консистентной.
-- Есть такое определение транзакции: «Упорядоченное множество операций,
-- переводящих базу данных из одного согласованного состояния в другое».
-- То есть до выполнения операции и после база остается консистентной (в переводе на русский — согласованной).
-- Атомарность гарантирует, что не получится такого, что адрес с телефоном сохранились, а сам клиент — нет.
-- Это сделало бы базу неконсистентной, ведь у нас бы появились атрибуты, «висящие в воздухе», никому не принадлежащие.
-- Что, в свою очередь, приведет к ошибкам в системе.

-- Изолированность Во время выполнения транзакции параллельные транзакции не должны оказывать влияния на её результат.

-- Надежность — Если пользователь получил подтверждение от системы, что транзакция выполнена,
-- он может быть уверен, что сделанные им изменения не будут отменены из-за какого-либо сбоя.
-- Обесточилась система, произошел сбой в оборудовании? На выполненную транзакцию это не повлияет.

-- DML операции (Data Manipulation Language)
-- insert
-- update
-- select
-- delete
-- truncate

-- DDL операции (Data Definition Language)
-- create
-- drop
-- alter


create procedure myProcedure(a integer, b integer)
    language sql
as
$$
insert into test(first, second)
values (a, b);
$$;

call myprocedure(1, 2);
call myprocedure(b=>3, a=>4);

create or replace function get_all_book_authors_by_title(varchar) returns setof character as
'
    select author
    from books
    where title like $1;
'
    language sql;

select *
from get_all_book_authors_by_title('Доктор Живаго');

create or replace function count_books_with_review(integer) returns integer as
'
    declare
        i integer;
    begin
        select count(*)
        from reviews
        into i where book_id = $1;
        return i;
    end;
'
    language plpgsql;

select * from count_books_with_review(3);

--view представления
create view  books_title_view as
    select title from books;

select * from books_title_view;

create view get_all_review_with_comment as
    select * from reviews where comment is not null;
select * from get_all_review_with_comment;

--cursor
create type fio as (first_name varchar, last_name varchar, middle_name varchar);

create table usr(
    id serial,
    role varchar,
    fio fio
);

insert into usr(role, fio) values ('user', ('first', 'last', 'middle'));
select *
from usr;
