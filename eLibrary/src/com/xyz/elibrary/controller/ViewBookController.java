package com.xyz.elibrary.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xyz.elibrary.dao.BookDAO;
import com.xyz.elibrary.dto.BookDTO;


@WebServlet("/viewbook")
public class ViewBookController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			BookDAO bookdao = new BookDAO();
			try {
				ArrayList<BookDTO> booklist = bookdao.getBooks();
				request.setAttribute("bookdata", booklist);
				RequestDispatcher rd = request.getRequestDispatcher("viewbook.jsp");
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
