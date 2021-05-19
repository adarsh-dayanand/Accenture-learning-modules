create table mark(
value number(10),
subject_id number(10),
student_id number(10),
constraint fk foreign key(subject_id) references subject(subject_id),
constraint forkey foreign key(student_id) references student(student_id),
primary key(subject_id,student_id)
);