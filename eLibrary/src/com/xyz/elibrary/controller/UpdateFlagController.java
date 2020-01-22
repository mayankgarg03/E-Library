package com.xyz.elibrary.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xyz.elibrary.dao.UserDAO;

/**
 * Servlet implementation class UpdateFlagController
 */
@WebServlet("/updateflag")
public class UpdateFlagController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("welcome to right uploader");
		
		UserDAO userdao = new UserDAO();
		try {
			
			String msg1 = userdao.updateFlag();
			out.println(msg1);
			if(msg1.equals("update")) {
				System.out.println("enter if inside rightcontroller");
				ServletContext ctx = getServletContext();
				ctx.setAttribute("flag", "n");
				response.sendRedirect("logout.jsp");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


