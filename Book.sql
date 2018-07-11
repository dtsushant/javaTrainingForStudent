create database bookstore;

use bookstore;

create table book(
  id int primary key auto_increment,
  name varchar(255) not null ,
  author varchar(255) not null,
  price double not null,
  isbn_no int not null,
  publication varchar(255) null ,
  genre varchar(255) not null
);

show tables;

select * from book;

insert into book(name,author,price,isbn_no,publication,genre)
    value ("Lord of the rings","J R R TOlkien", 99.8,989787,"some publication","fantasy");


insert into book(name,author,price,isbn_no,publication,genre)
  value ("IT","Stephen King", 99.8,989787,"some publication","Horror");

insert into book(name,author,price,isbn_no,publication,genre)
  value ("A brief history of Time","Stephen Hawkings", 99.8,989787,"some publication","Horror");

update book set price=100.1, isbn_no=8767687 where id = 2;

delete from book where genre = "horror" and author= "Stephen Hawkings";