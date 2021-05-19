create table registration(
CourseID number(4),
Studid number(4),
DOJ Date,
foreign key(CourseID) references course(CourseID),
foreign key(Studid) references student(Studid)
);