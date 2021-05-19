select d.department_name,count(staff_id) as staff_count from staff s, department d 
where d.department_id=s.department_id(+) group by department_name,d.department_id 
order by department_name; 