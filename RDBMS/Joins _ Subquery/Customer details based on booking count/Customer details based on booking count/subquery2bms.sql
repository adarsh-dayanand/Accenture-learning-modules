select distinct u.user_id, u.name
from users u join tickets t
                on u.user_id=t.user_id
                where t.no_seats>1
order by 2;