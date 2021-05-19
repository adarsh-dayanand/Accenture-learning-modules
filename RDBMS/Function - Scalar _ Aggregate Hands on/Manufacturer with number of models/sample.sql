select manufacturer,count(manufacturer) as Mobile_model_count
from mobile_master
group by manufacturer
order by Mobile_model_count desc,manufacturer asc;


