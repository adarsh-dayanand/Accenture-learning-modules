--select salesid,sales_date as FormattedDate from sales_info
--order by salesid asc;

Select salesid,to_char(sales_date,'yyyy-mm-dd')as FormattedDated from sales_info 
order by salesid asc; 
