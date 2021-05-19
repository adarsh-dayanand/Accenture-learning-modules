select course.courseid,coursename,sum(fees) as totalfees from course
inner join registration on course.courseid=registration.courseid
group by course.courseid,coursename
order by course.courseid;