select customer_id,sales_date,add_months(sales_date,3)
AS REVIEW_DATE
from sales_info order by customer_id;