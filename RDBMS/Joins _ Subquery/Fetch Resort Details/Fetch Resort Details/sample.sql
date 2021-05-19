select rs.resortname, m.name 
from resort rs join manager m 
                on m.managerid=rs.managerid
                where rs.townname='JAIPUR'
order by 1;