package com.student.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class SubjectsAndMarks {
   @Id
   @GeneratedValue
   private Integer sno;
   public Integer getSno() {
	return sno;
}
public void setSno(Integer sno) {
	this.sno = sno;
}
public String getSubjectname() {
	return subjectname;
}
public void setSubjectname(String subjectname) {
	this.subjectname = subjectname;
}

private String subjectname;
   private Double obtainedmarks;
   public Double getObtainedmarks() {
	return obtainedmarks;
}
public void setObtainedmarks(Double obtainedmarks) {
	this.obtainedmarks = obtainedmarks;
}
public Double getTotalmarks() {
	return totalmarks;
}
public void setTotalmarks(Double totalmarks) {
	this.totalmarks = totalmarks;
}

private Double totalmarks;
private String subjectwisegrade;
public String getSubjectwisegrade() {
	return subjectwisegrade;
}
public void setSubjectwisegrade(String subjectwisegrade) {
	this.subjectwisegrade = subjectwisegrade;
}
}
