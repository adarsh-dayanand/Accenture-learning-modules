select g.name, rs.resortname, rw.comments
from guest g join review rw 
                on rw.guestid=g.guestid join resort rs 
                                        on rs.resortid=rw.resortid
order by 1, 2;