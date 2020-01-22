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

import com.xyz.elibrary.dao.UserDAO;
import com.xyz.elibrary.dto.RegisterDTO;




@WebServlet("/update")
public class UpdateController extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String id = request.getParameter("uid");
		String name = request.getParameter("username");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		System.out.println(name+""+email+""+phone);
		
		RegisterDTO registerdto = new RegisterDTO();
		int uid = Integer.parseInt(id);
		registerdto.setUid(uid);
		registerdto.setName(name);
		registerdto.setEmailid(email);
		registerdto.setPhoneno(phone);
		
		UserDAO userdao = new UserDAO();
		try {
			String msg = userdao.edit(registerdto);
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
