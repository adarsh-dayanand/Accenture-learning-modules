SELECT guestID, name, COALESCE(phone, address, email)
AS CONTACT_DETAILS
FROM guest 
order by guestID ASC;