select student_name,mark.value from student inner join mark on student.student_id=mark.student_id
inner join subject on subject.subject_id=mark.subject_id
where subject_name='Theory of Computation' order by student_name;