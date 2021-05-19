select townname from town
where summertemp>(select summertemp from town
where upper(townname)='JAIPUR')
order by townname;