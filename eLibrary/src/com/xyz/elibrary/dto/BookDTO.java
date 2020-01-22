package com.xyz.elibrary.dto;

public class BookDTO {
	public int bookid;

public String bookno;
public String bookname;
public String author;
public String publisher;
public int quantity;

public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBookno() {
	return bookno;
}
public void setBookno(String bookno) {
	this.bookno = bookno;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookaname) {
	this.bookname = bookaname;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "BookDTO [bookno=" + bookno + ", bookaname=" + bookname + ", author=" + author + ", publisher=" + publisher
			+ ", quantity=" + quantity + "]";
}


}
