select customer_id,customer_name,address,email from customer_info
where customer_name like 'R%' and customer_name like '%l' order by customer_name asc;