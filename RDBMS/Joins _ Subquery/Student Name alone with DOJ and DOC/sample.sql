select firstname,doj,add_months(doj,duration) as DOC from student
inner join registration on student.studid=registration.studid
           inner join course on registration.courseid=course.courseid
           order by firstname,doj,DOC;