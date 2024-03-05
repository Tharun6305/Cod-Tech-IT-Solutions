package com.student.Entity;

public class Data {
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
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
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
	public String getSubjectwisegrade() {
		return subjectwisegrade;
	}
	public void setSubjectwisegrade(String subjectwisegrade) {
		this.subjectwisegrade = subjectwisegrade;
	}
	
	public Data(String rollnumber, String studentname, String grade, Double percentage, String subjectname,
			Double obtainedmarks, Double totalmarks, String subjectwisegrade, Integer sno) {
		super();
		this.rollnumber = rollnumber;
		this.studentname = studentname;
		this.grade = grade;
		this.percentage = percentage;
		this.subjectname = subjectname;
		this.obtainedmarks = obtainedmarks;
		this.totalmarks = totalmarks;
		this.subjectwisegrade = subjectwisegrade;
		this.sno = sno;
	}
	@Override
	public String toString() {
		return "Data [rollnumber=" + rollnumber + ", studentname=" + studentname + ", grade=" + grade + ", percentage="
				+ percentage + ", subjectname=" + subjectname + ", obtainedmarks=" + obtainedmarks + ", totalmarks="
				+ totalmarks + ", subjectwisegrade=" + subjectwisegrade + ", sno=" + sno + "]";
	}

	private String studentname;
	private String grade;
	private Double percentage;
	private String subjectname;
	private Double obtainedmarks;
	private Double totalmarks;
	private String subjectwisegrade;
	private Integer sno;
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	
	

}
