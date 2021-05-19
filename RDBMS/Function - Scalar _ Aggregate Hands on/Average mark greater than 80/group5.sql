select student_id,round(avg(value),2) as avg_mark from mark 
group by student_id
having(avg(value))>80
order by avg_mark;
