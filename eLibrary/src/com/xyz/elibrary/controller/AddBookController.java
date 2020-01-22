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
import com.xyz.elibrary.dto.BookDTO;


@WebServlet("/addbook")
public class AddBookController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String bookno = request.getParameter("bookno");
		String bookname = request.getParameter("bname");
		String author = request.getParameter("author");
		String publisher = request.getParameter("publisher");
		String quantity = request.getParameter("quantity");
		BookDTO bookdto = new BookDTO();
		bookdto.setBookno(bookno);
		bookdto.setBookname(bookname);
		bookdto.setAuthor(author);
		bookdto.setPublisher(publisher);
		bookdto.setQuantity(Integer.parseInt(quantity));
		
		BookDAO bookdao = new BookDAO();
		try {
			String msg = bookdao.addBook(bookdto);
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
