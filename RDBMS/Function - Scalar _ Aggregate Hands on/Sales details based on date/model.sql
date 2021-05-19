select salesid,ime_no,sales_date from sales_info
where extract(month from sales_date)=2 and extract(year from sales_date)=2012
order by salesid;