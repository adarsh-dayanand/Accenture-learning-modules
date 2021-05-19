create view course_student_details as select 
a.studid,a.firstname,b.coursename
from registration c,student a,course b 
where c.studid=a.studid and c.courseid=b.courseid;