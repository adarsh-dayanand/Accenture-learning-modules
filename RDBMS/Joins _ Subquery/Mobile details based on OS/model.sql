select m1.ime_no,m1.model_name,m1.manufacturer,m1.price from mobile_master m1,mobile_specification m2
where m1.spec_no=m2.spec_no and m2.os='Android4S' order by m1.ime_no;