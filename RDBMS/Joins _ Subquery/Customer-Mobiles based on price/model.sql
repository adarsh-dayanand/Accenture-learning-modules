select c.customer_id,c.customer_name,c.mobile,s.price from customer_info c,sales_info s
where c.customer_id=s.customer_id and s.price<30000 order by c.customer_id;