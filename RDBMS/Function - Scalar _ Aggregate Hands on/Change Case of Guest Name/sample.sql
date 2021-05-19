select INITCAP(name) as GUESTNAME
from Guest 
where INITCAP(address) LIKE '%Ooty%'
order by name;