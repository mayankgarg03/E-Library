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
import com.xyz.elibrary.dto.RegisterDTO;


@WebServlet("/addmember")
public class AddMemberController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		
		RegisterDTO registerdto = new RegisterDTO();
		registerdto.setName(name);
		registerdto.setPassword(password);
		registerdto.setEmailid(email);
		registerdto.setPhoneno(phone);
		
		UserDAO userdao = new UserDAO();
		try {
			String msg = userdao.doRegister(registerdto);
			System.out.println(msg);
			out.println(msg);
		
		
		
			
//			int id = userdao.getId(username, password);
//			System.out.println("!!!!"+id);
	}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
