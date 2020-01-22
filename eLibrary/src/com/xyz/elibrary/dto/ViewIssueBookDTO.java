package com.xyz.elibrary.dto;

public class ViewIssueBookDTO {
public String name;
public String semester;
public String branch;
public int rollno;
public String bookname;
public String bookno;
public String returndate;

public String getReturndate() {
	return returndate;
}
public void setReturndate(String returndate) {
	this.returndate = returndate;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSemester() {
	return semester;
}
public void setSemester(String semester) {
	this.semester = semester;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getBookno() {
	return bookno;
}
public void setBookno(String bookno) {
	this.bookno = bookno;
}
@Override
public String toString() {
	return "ViewIssueBookDTO [name=" + name + ", semester=" + semester + ", branch=" + branch + ", rollno=" + rollno
			+ ", bookname=" + bookname + ", bookno=" + bookno + "]";
}



}
