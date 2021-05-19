SELECT INITCAP(Customer_Name) as NAME,address from Customer_info where address
like '%Chennai%' or address like '%chennai%' order by Customer_name asc;