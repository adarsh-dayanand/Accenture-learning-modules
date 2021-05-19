select DISTINCT resortid, SUM(bedroomcount) as TOTALCOUNT 
from cabin 
GROUP BY resortid 
order by resortid;