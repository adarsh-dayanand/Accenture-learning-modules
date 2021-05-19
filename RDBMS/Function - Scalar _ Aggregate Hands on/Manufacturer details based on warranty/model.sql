select manufacturer,count(model_name) as TOTAL_COUNT
from mobile_master
group by manufacturer
having avg(warranty_in_years)>3;
