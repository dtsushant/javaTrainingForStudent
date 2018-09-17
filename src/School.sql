create database school;

create table student(
  id int not null primary key auto_increment,
  full_name varchar(255) not null,
  grade int not null,
  age int not null,
  gender varchar(10) null
)

insert into student(full_name,grade, age, gender) values("something something","3","7","male");
insert into student(full_name,grade, age, gender) values("something nothing","3","7","male");
insert into student(full_name,grade, age, gender) values("nothing something","3","7","male");
insert into student(full_name,grade, age, gender) values("nothing something","3","7","male");

update student set full_name = "someone something" where id = 3;
update student set gender = "female", age=8 and grade = 4 where id = 2;

delete from student where id = 4;
