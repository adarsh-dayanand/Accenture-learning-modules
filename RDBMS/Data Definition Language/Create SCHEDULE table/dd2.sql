create table SCHEDULE(
	Schedule_id varchar2(3),
	Travel_date date,
  	Source varchar2(20),
  	Destination varchar2(20),
  	Bus_no number(11),
  	Duration number(11),
  	constraint PK_SCHEDULE primary key(Schedule_id),
	constraint FK_SCHEDULE_BUSES foreign key(bus_no) references Buses(bus_no)
);