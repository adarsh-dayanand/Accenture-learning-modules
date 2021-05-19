select student_name from student inner join department on student.department_id=department.department_id
where department.department_name='CSE' order by student_name desc;