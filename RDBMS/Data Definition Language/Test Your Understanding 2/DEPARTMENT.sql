CREATE table department
( dept_id number(4) constraint PK primary key,
  prod_id number(4) REFERENCES product(prod_id),
  dept_name varchar(25) unique,
  dept_head varchar(25) NOT NULL
); 