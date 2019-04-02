package com.demo.dao;

import java.util.Set;

public class Course {
private Integer cid;
private String coursename;
private Set studentSet;

public Integer getCid() {
	return cid;
}
public void setCid(Integer cid) {
	this.cid = cid;
}
public String getCoursename() {
	return coursename;
}
public void setCoursename(String coursename) {
	this.coursename = coursename;
}
public Set getStudentSet() {
	return studentSet;
}
public void setStudentSet(Set studentSet) {
	this.studentSet = studentSet;
}


}
