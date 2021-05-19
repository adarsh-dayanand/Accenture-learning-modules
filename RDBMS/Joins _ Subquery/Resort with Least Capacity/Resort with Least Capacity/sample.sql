select rs.resortname, t.townname
from town t join resort rs 
            on t.townid=rs.townid join cabin c
                                    on c.resortid=rs.resortid
                                    where c.bedroomcount=(select min(bedroomcount) from cabin)
order by 1;