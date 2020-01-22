package com.xyz.elibrary.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.xyz.elibrary.dto.BookDTO;
import com.xyz.elibrary.dto.IssueBookDTO;
import com.xyz.elibrary.dto.StudentDTO;
import com.xyz.elibrary.dto.ViewIssueBookDTO;
import com.xyz.elibrary.utils.CommonDAO;
import com.xyz.elibrary.utils.MyQueries;

public class BookDAO {

public String issueBook(IssueBookDTO issue) throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement(MyQueries.ISSUEBOOK_SQL);
		pstmt.setString(1,issue.getBookno());
		pstmt.setInt(2, issue.getRollno());
		pstmt.setString(3, issue.getIssuedate());
		pstmt.setString(4, issue.getReturndate());
		int record = pstmt.executeUpdate();
		return record>0?"Insert":"not insert";
		}
		finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			
			if(con!=null) {
				con.close();
			}
			
		}
	}
	
	

	public String addStudent(StudentDTO studentdto) throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement(MyQueries.ADDSTUDENT_SQL);
		pstmt.setInt(1,studentdto.getRollno() );
		pstmt.setString(2, studentdto.getSname());
		pstmt.setString(3, studentdto.getMobileno());
		pstmt.setString(4, studentdto.getBranch());
		pstmt.setString(5, studentdto.getSemester());
		
		int record = pstmt.executeUpdate();
		return record>0?"Insert":"not insert";
		}
		finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			
			if(con!=null) {
				con.close();
			}
			
		}
	}
	
	public String addBook(BookDTO bookdto) throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement(MyQueries.ADDBOOK_SQL);
		pstmt.setString(1,bookdto.getBookno() );
		pstmt.setString(2, bookdto.getBookname());
		pstmt.setString(3, bookdto.getAuthor());
		pstmt.setString(4, bookdto.getPublisher());
		pstmt.setInt(5, bookdto.getQuantity());
		
		int record = pstmt.executeUpdate();
		return record>0?"Insert":"not insert";
		}
		finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			
			if(con!=null) {
				con.close();
			}
			
		}
	}
	
	
	
	public ArrayList<BookDTO> getBooks() throws SQLException, ClassNotFoundException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BookDTO book = null;
		ArrayList<BookDTO> booklist = new ArrayList<>();
		try {
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement(MyQueries.GETBOOKS_SQL);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			book = new BookDTO();
			book.setBookid(rs.getInt("bookid"));
			book.setBookno(rs.getString("bookno"));
			book.setBookname(rs.getString("bookname"));
			book.setAuthor(rs.getString("author"));
			book.setPublisher(rs.getString("publisher"));
			book.setQuantity(rs.getInt("quantity"));
			booklist.add(book);
			
			
		}
		}
		finally {
			if(rs!=null) {
				rs.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
		
		return booklist;
		
	}
	
	
	
	public ArrayList<ViewIssueBookDTO> viewIssuedBooks() throws SQLException, ClassNotFoundException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ViewIssueBookDTO book = null;
		ArrayList<ViewIssueBookDTO> booklist = new ArrayList<>();
		try {
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement(MyQueries.VIEWISSUEDBOOK_SQL);
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			book = new ViewIssueBookDTO();
			book.setName(rs.getString("sname"));
			book.setRollno(rs.getInt("rollno"));
			book.setBranch(rs.getString("branch"));
			book.setSemester(rs.getString("semester"));
			book.setBookname(rs.getString("bookname"));
			book.setBookno(rs.getString("bookno"));
			book.setReturndate(rs.getString("returndate"));
			
			booklist.add(book);
			
			
		}
		}
		finally {
			if(rs!=null) {
				rs.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
		
		return booklist;
		
	}
	
	
	public String returnBook(String bookno , String rollno) throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
		con = CommonDAO.getConnection();
		pstmt = con.prepareStatement(MyQueries.RETURNBOOK_SQL);
		pstmt.setString(1, bookno);
		pstmt.setInt(2, Integer.parseInt(rollno));
		int record = pstmt.executeUpdate();
		return record>0 ?"returned":"not returned";
		}
		finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
		
	}

}
