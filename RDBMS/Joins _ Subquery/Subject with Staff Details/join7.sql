select subject_name, subject_code, staff_name from
subject a join staff b on a.staff_id = b.staff_id order by subject_code; 