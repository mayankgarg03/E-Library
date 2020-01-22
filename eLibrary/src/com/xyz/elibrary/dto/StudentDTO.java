package com.xyz.elibrary.dto;

public class StudentDTO {
public int rollno;
public String sname;
public String mobileno;
public String branch;
public String semester;
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getSemester() {
	return semester;
}
public void setSemester(String semester) {
	this.semester = semester;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
@Override
public String toString() {
	return "StudentDTO [rollno=" + rollno + ", sname=" + sname + ", mobileno=" + mobileno + "]";
}


}
