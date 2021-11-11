 select guestid, resortid,(todate-fromdate) as number_of_days, adultcount, childcount, petcount, totalcharge 
 from booking 
 where petcount>0 and childcount>=0
 order by petcount desc;
