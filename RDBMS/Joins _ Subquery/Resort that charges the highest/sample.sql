select r.resortname, c.rate
from resort r join cabincost c
on c.resortid=r.resortid
where c.rate=(select max(rate) from cabincost)
order by 1;