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

import com.xyz.elibrary.dao.BookDAO;
import com.xyz.elibrary.dto.StudentDTO;


@WebServlet("/addstudent")
public class AddStudentController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		String rollno= request.getParameter("rollno");
		String name = request.getParameter("username");
		String phone = request.getParameter("phone");
		String branch = request.getParameter("branch");
		String semester = request.getParameter("sem");
		
		StudentDTO studentdto = new StudentDTO();
		studentdto.setRollno(Integer.parseInt(rollno));
		studentdto.setSname(name);
		studentdto.setMobileno(phone);
		studentdto.setBranch(branch);
		studentdto.setSemester(semester);
		
		BookDAO book = new BookDAO();
		try {
			String msg = book.addStudent(studentdto);
			out.println(msg);
			response.sendRedirect("addstudent.jsp?msg="+msg);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
