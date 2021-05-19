create table staff(
staff_id number(10),
staff_name varchar(30),
department_id number(10),
constraint pk primary key(staff_id),
constraint fk foreign key(department_id) references department(department_id)
);