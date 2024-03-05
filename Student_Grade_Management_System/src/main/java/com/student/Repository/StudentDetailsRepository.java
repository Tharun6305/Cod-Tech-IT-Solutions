package com.student.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.student.Entity.Data;
import com.student.Entity.StudentDetails;



public interface StudentDetailsRepository  extends JpaRepository<StudentDetails, String>{
	 @Query("SELECT  new com.student.Entity.Data( sd.rollnumber, sd.studentname, sd.grade, sd.percentage,m.subjectname,m.obtainedmarks, m.totalmarks, m.subjectwisegrade,m.sno) FROM StudentDetails sd JOIN sd.data m")
	    List<Data> StudentMarksData();
	 @Query("SELECT  new com.student.Entity.Data( sd.rollnumber, sd.studentname, sd.grade, sd.percentage,m.subjectname,m.obtainedmarks, m.totalmarks, m.subjectwisegrade,m.sno) FROM StudentDetails sd JOIN sd.data m WHERE sd.rollnumber LIKE CONCAT('%', :keyword, '%')")
	 List<Data> searchByName(@Param("keyword") String keyword);

}
