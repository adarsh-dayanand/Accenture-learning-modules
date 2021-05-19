select ime_no,model_name,price,CASE
WHEN price<10000 THEN 'Average Price'
WHEN price>20000 THEN 'High Price'
ELSE 'Medium Price' 
end as "Comment"
from mobile_master
order by ime_no;