select rs.resortid, rw.comments
from resort rs join review rw
                on rs.resortid=rw.resortid
                where rs.starrating>4.2
order by 1;