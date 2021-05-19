select customer_id,customer_name,address,mobile,email from customer_info
where address like '%Kolkata%' or address like '%Patna%' order by customer_name desc;