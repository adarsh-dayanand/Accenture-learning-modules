select department_name, count(student_id) as student_count
from department join student on department.department_id=student.department_id
group by department_name
order by department_name;