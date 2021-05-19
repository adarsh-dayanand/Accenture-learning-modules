select address,manufacturer,model_name,dimension,discount
from mobile_master
inner join distributor on distributor.distributor_id=mobile_master.distributor_id
inner join sales_info on mobile_master.ime_no=sales_info.ime_no
inner join mobile_specification on mobile_master.spec_no=mobile_specification.spec_no
order by address;