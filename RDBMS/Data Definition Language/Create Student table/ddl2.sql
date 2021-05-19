create table student(
student_id number(10),
student_name varchar(30),
address varchar(40),
city varchar(30),
department_id number(10),
constraint PK primary key(student_id),
constraint FK foreign key (department_id) references department(department_id)
);