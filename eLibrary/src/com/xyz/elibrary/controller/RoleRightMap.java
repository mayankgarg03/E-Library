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


@WebServlet("/rolerightmap")
public class RoleRightMap extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			PrintWriter out = response.getWriter();
			String role = request.getParameter("role");
			String[] rights = request.getParameterValues("right");
			
			UserDAO userdao = new UserDAO();
			try {
				int roleid  = userdao.getRoleId(role);
				System.out.println("%roleid"+roleid);
				String msg = userdao.roleRightMap(roleid, rights);
				out.println(msg);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			for(String values : rights) {
//				System.out.println(values);
//			}
	}
			
			
	

}
