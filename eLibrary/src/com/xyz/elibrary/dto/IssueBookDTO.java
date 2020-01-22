package com.xyz.elibrary.dto;

public class IssueBookDTO {

	public String bookno;
	public String issuedate;
	public String returndate;
	public int rollno;
	public String getBookno() {
		return bookno;
	}
	public void setBookno(String bookno) {
		this.bookno = bookno;
	}
	public String getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(String issuedate) {
		this.issuedate = issuedate;
	}
	public String getReturndate() {
		return returndate;
	}
	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "IssueBookDTO [bookno=" + bookno + ", issuedate=" + issuedate + ", returndate=" + returndate
				+ ", rollno=" + rollno + "]";
	}
	
}
