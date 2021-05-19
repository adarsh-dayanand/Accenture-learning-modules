select registration.studid,sum(fees) as totalfees from registration
inner join student on registration.studid=student.studid
inner join course on registration.courseid=course.courseid
group by registration.studid
order by student.studid;