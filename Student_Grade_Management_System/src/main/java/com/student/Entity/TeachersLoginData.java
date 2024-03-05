package com.student.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TeachersLoginData {
   @Id
   @GeneratedValue
   private Integer sno;
   public Integer getSno() {
	return sno;
}
public void setSno(Integer sno) {
	this.sno = sno;
}
public String getGmail() {
	return gmail;
}
public void setGmail(String gmail) {
	this.gmail = gmail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
private String gmail;
   private String password;
}
