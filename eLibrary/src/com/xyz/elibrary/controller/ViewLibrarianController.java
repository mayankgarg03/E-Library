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

import com.xyz.elibrary.dao.UserDAO;
import com.xyz.elibrary.dto.RegisterDTO;


@WebServlet("/viewlibrarian")
public class ViewLibrarianController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	UserDAO userdao = new UserDAO();
	try {
		System.out.println("enter view librarian controller");
		ArrayList<RegisterDTO> list = userdao.viewLibrarian();
		//System.out.println(list);
		request.setAttribute("data", list);
		RequestDispatcher rd = request.getRequestDispatcher("viewlibrarian.jsp");
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
