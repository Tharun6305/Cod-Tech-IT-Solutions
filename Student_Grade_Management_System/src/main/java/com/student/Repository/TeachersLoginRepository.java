package com.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.student.Entity.TeachersLoginData;

public interface TeachersLoginRepository extends JpaRepository<TeachersLoginData, Integer>{
	@Query(value = "SELECT * FROM TEACHERS_LOGIN_DATA WHERE GMAIL = :gmail AND PASSWORD = :password", nativeQuery = true)
	public TeachersLoginData Validation(@Param("gmail")String gmail,@Param("password") String password);

}
