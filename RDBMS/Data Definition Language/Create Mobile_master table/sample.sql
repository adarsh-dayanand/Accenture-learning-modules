create table mobile_master(
ime_no varchar(10) primary key,
model_name varchar(20),
manufacturer varchar(20),
date_of_manufac date,
warranty_in_years number(10),
price number(7,2),
distributor_id varchar(10),
spec_no varchar(10),
foreign key(distributor_id) references distributor(distributor_id),
foreign key(spec_no)references mobile_specification(spec_no)
);
