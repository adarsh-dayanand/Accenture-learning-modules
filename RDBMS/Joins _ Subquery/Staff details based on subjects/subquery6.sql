select distinct staff_name from staff inner join subject on subject.staff_id=staff.staff_id
order by staff_name;