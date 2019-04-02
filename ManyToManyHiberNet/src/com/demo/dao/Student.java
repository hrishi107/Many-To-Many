package com.demo.dao;

import java.util.Set;

public class Student {
private Integer sid;
private String sname;

private Set courseSet;

public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public Set getCourseSet() {
	return courseSet;
}
public void setCourseSet(Set courseSet) {
	this.courseSet = courseSet;
}

}
