package com.student.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
@Entity
public class StudentDetails {
   @Id
   private String rollnumber;
   public String getRollnumber() {
	return rollnumber;
}
public void setRollnumber(String rollnumber) {
	this.rollnumber = rollnumber;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public List<SubjectsAndMarks> getData() {
	return data;
}
public void setData(List<SubjectsAndMarks> data) {
	this.data = data;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public Double getPercentage() {
	return percentage;
}
public void setPercentage(Double percentage) {
	this.percentage = percentage;
}
private String studentname;
   @OneToMany(targetEntity = SubjectsAndMarks.class ,cascade =  CascadeType.ALL )
   @JoinColumn(name = "rollnumber",referencedColumnName = "rollnumber")
   private List<SubjectsAndMarks> data;
   private String grade;
   private Double percentage;
}
