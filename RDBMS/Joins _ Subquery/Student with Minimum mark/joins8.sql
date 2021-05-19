select subject.subject_name,min(mark.value) as min_mark from subject inner join mark 
on subject.subject_id=mark.subject_id group by subject.subject_name order by subject.subject_name desc;