select staff_name,subject_name,max(value) as max_mark from mark 
inner join subject on mark.subject_id=subject.subject_id
inner join staff on subject.staff_id=staff.staff_id
group by subject_name,staff_name
order by max_mark desc;