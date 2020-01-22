package com.xyz.elibrary.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xyz.elibrary.dao.UserDAO;
import com.xyz.elibrary.dto.LoginDTO;
import com.xyz.elibrary.dto.RegisterDTO;


@WebServlet("/login")
public class LoginController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		
		LoginDTO logindto = new LoginDTO();
		logindto.setName(name);
		logindto.setPassword(password);
		
		UserDAO userdao = new UserDAO();
		try {
			RegisterDTO registerdto = userdao.doLogin(logindto);
			if(registerdto == null) {
				String msg = "Invalid username and password";
				response.sendRedirect("login.jsp?msg"+msg);
			}
			
			else {
				
				HttpSession session = request.getSession(true);
				session.setAttribute("sessionname", registerdto.getName());
				request.setAttribute("name", registerdto);
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				rd.forward(request,response);
				
				
				
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
