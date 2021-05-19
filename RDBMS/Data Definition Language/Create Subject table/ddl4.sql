create table subject(
subject_id number,
subject_name varchar(30),
subject_code varchar(10),
staff_id number,
primary key(subject_id),
foreign key(staff_id) references staff(staff_id)
);