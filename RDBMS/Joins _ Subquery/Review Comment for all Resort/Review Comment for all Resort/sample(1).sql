select rs.resortname, g.name, rw.comments
from resort rs join review rw 
                on rw.resortid=rs.resortid join guest g 
                                            on g.guestid=rw.guestid
order by rs.resortid;