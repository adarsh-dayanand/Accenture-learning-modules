select student_name, department_name 
from department inner join student on
student.department_id=department.department_id
where lower(city)= 'coimbatore' order by student_name;