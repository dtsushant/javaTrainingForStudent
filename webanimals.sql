create database webanimals;

use webanimals;

create table owner(
  id int primary key auto_increment,
  fullname varchar(255),
  address varchar(255),
  phone_no int
);

create table pets(
  id int primary key auto_increment,
  name varchar(255),
  age int,
  type varchar(255),
  color varchar(255),
  is_vaccinated bit(1),
  weight float,
  owner_id int,
  FOREIGN KEY (`owner_id`) REFERENCES `owner` (`id`)
)