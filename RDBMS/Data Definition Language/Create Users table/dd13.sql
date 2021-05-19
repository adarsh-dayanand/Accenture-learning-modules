create table USERS
( User_id number(11) constraint PK_USERS Primary key,
  Name Varchar2(20),
  Address Varchar2(100),
  Phno number(11),
  Emailid Varchar2(30)
);