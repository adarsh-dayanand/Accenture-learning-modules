select firstname,coursename from student 
inner join registration on student.studid=registration.studid
inner join course on registration.courseid=course.courseid
order by firstname,coursename;