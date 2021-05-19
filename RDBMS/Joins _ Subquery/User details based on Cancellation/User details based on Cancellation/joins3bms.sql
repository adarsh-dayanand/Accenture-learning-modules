select u.USER_ID, u.NAME
from ((users u inner join tickets t 
                        on u.USER_ID=t.USER_ID) inner join cancellation c 
                                                        on t.ticket_id=c.ticket_id)
where cancellation_ID is not null 
group by u.USER_ID, u.NAME
order by 1;











