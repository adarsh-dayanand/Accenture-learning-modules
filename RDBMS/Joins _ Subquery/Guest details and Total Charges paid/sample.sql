select guest.guestid,guest.name, sum(booking.totalcharge) as TOTALPAID from guest 
join booking on booking.guestID=guest.guestID
group by guest.guestID,guest.name having sum(booking.totalcharge)>=50000
order by guest.guestid;