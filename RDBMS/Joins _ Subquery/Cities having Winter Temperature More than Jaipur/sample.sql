select townname from town
where wintertemp>(select wintertemp from town
where upper(townname)='JAIPUR')
order by townname;