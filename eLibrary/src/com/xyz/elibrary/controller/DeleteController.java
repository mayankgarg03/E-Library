package com.xyz.elibrary.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xyz.elibrary.dao.UserDAO;


/**
 * Servlet implementation class DeleteController
 */
@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String id = request.getParameter("id");
	PrintWriter out = response.getWriter();
	System.out.println("Delete id is"+id);
	UserDAO userdao = new UserDAO();
	try {
		int uid = Integer.parseInt(id);
		String msg = userdao.deleteLibrarian(uid);
		out.println(msg);
		String msg1 = userdao.deleteUserRole(uid);
		out.println(msg1);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	out.close();
	
	
	
	
	}

	

}
