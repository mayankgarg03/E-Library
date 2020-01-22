package com.xyz.elibrary.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xyz.elibrary.dao.BookDAO;
import com.xyz.elibrary.dto.IssueBookDTO;


@WebServlet("/issuebook")
public class IssueBookController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String bookno = request.getParameter("bookno");
		String rollno = request.getParameter("rollno");
		String issuedate = request.getParameter("issuedate");
		String returndate = request.getParameter("returndate");
		
		IssueBookDTO issue = new IssueBookDTO();
		issue.setBookno(bookno);
		issue.setRollno(Integer.parseInt(rollno));
		issue.setIssuedate(issuedate);
		issue.setReturndate(returndate);
		
		BookDAO book = new BookDAO();
		try {
			String msg = book.issueBook(issue);
			out.println(msg);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
