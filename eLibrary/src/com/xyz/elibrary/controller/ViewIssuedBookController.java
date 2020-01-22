package com.xyz.elibrary.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xyz.elibrary.dao.BookDAO;
import com.xyz.elibrary.dto.ViewIssueBookDTO;


@WebServlet("/viewissuedbook" )
public class ViewIssuedBookController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			BookDAO book = new BookDAO();
			try {
				ArrayList<ViewIssueBookDTO > list = book.viewIssuedBooks();
				request.setAttribute("book", list);
				RequestDispatcher rd = request.getRequestDispatcher("viewissuebook.jsp");
				rd.forward(request, response);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

}
