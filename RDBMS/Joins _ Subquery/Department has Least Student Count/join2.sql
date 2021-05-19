select d.department_name from 
(select dd.department_name, count(di.department_id) as id from student di
join department dd on di.department_id=dd.department_id group by dd.department_name) d,
(select min(count(*)) as new from student group by department_id) d2
where d.id=d2.new;