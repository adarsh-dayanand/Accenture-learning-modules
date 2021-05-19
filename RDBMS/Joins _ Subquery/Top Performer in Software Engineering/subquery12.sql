select a.student_name,b.department_name,c.value from student a
inner join department b on a.department_id=b.department_id
inner join mark c on c.student_id=a.student_id and(c.subject_id,c.value) in
(select subject_id,max(a.value) from mark a join subject d using(subject_id)
where d.subject_name='Software Engineering'
group by subject_id)
order by b.department_name;