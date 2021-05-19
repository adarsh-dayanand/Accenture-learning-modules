select staff_name from staff inner join department on department.department_id=staff.department_id
where department.department_name='IT' order by staff_name;