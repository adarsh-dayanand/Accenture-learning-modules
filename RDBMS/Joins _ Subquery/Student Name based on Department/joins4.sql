select student_name from student where
department_id in(select department_id from department where lower(department_name)='it')
order by student_name desc;