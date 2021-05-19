select distributor_name,model_name,price,warranty_in_years
from mobile_master,distributor
where mobile_master.distributor_id=distributor.distributor_id
and warranty_in_years=(select max(warranty_in_years) from mobile_master)
order by distributor_name;