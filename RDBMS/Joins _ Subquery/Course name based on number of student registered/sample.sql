select coursename from course 
inner join registration on course.courseid=registration.courseid
group by coursename having count(studid)>=2
order by coursename;
