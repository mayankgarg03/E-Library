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


@WebServlet("/userrolemap")
public class UserRoleMap extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("username");
		String role = request.getParameter("role");
		
		UserDAO userdao = new UserDAO();
		try {
			int uid = userdao.getIdByName(name);
			System.out.println("uid at userrolemap controller "+uid);
			
			int roleid = userdao.getRoleId(role);
			System.out.println("roleid at userrolemap controller "+roleid);
			
			String msg = userdao.userRoleMap(uid, roleid);
			System.out.println("roleid at userrolemap controller "+msg);
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
