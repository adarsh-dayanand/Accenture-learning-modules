select s.student_name
from student s join mark m
on m.student_id=s.student_id
group by s.student_name
having min(m.value)>50
order by s.student_name;