create table t1 as select max(value) as max1 from mark,subject where lower(subject_name)='software engineering' 
and mark.subject_id=subject.subject_id;
select distinct student_name from mark,t1,student where mark.student_id=student.student_id and mark.value=max1 order by student_name;