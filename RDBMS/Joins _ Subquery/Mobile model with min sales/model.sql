select m.model_name,count(salesid) as MIN_SALES from sales_info s join mobile_master m 
on s.ime_no=m.ime_no
group by m.model_name
having count(salesid)=(select min(x) from (select m.model_name,count(salesid) as
x from sales_info s join mobile_master m on s.ime_no=m.ime_no
group by m.model_name))
order by m.model_name desc;