package com.demo.dao;

public class StudentCourse 
{
	private Integer scid;
	private  Integer fksid;
	private  Integer fkcid;
	private Student student;	
	private Course course;
	
	public Integer getFksid() {
		return fksid;
	}

	public void setFksid(Integer fksid) {
		this.fksid = fksid;
	}

	public Integer getFkcid() {
		return fkcid;
	}

	public void setFkcid(Integer fkcid) {
		this.fkcid = fkcid;
	}

	

	public Integer getScid() {
		return scid;
	}

	public void setScid(Integer scid) {
		this.scid = scid;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

		
	
	
}
