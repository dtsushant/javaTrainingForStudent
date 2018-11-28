create database animals;

use animals;

create table pets(
  id int primary key auto_increment,
  name varchar(250) not null,
  type varchar (255) not null,
  age int not null,
  color varchar(255),
  weight float,
  is_vaccinated bit(1)
);

select * from pets;


insert into pets(name, type, age, color, weight,is_vaccinated) value("Doggy","Dog",3,"White",33,false );