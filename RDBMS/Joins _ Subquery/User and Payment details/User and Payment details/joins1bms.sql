SELECT 
User_ID, 
(select name from users u where t.user_id=u.user_id) as user_name, 
ticket_id as Ticket_id, 
(no_seats*fare) as Total_amount,
((no_seats*fare)-(select discount_amount from discounts d where d.discount_id=(select discount_id from payments p where t.Ticket_id=p.Ticket_id))) as Paid_amount 
FROM tickets t
ORDER BY User_ID desc;