select courseId,coursename from course c
where fees in (select max(fees) from course p where fees not in (select max(fees) from course p)) order by courseId;