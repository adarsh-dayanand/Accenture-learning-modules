select department_block_number from department group by department_block_number
having count(department_name)=(select max(count(department_name)) from department group by department_block_number);