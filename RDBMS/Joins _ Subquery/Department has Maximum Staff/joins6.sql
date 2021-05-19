select dept.department_name
from department dept full outer join staff st
on dept.department_id=st.department_id
group by dept.department_name
having count(staff_id)=(select max(count(st2.staff_id))
from department dept2 join staff st2
on dept2.department_id=st2.department_id
group by dept2.department_id)
order by dept.department_name;