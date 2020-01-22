package com.xyz.elibrary.listeners;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.xyz.elibrary.dao.UserDAO;
import com.xyz.elibrary.dto.RightDTO;
import com.xyz.elibrary.utils.CommonDAO;
import com.xyz.elibrary.utils.MyQueries;



@WebListener
public class myListener implements ServletContextListener {

  
    public myListener() {
    }

	
    public void contextDestroyed(ServletContextEvent e)  { 
        
    }

	
    public void contextInitialized(ServletContextEvent e)  { 
    	
    		
		
        		
    	Connection con = null;
    	PreparedStatement pstmt = null;
    	ResultSet rs = null;
    	String flag = "";
    	
    	try {
			try {
				con = CommonDAO.getConnection();
				pstmt = con.prepareStatement(MyQueries.STARTUPTABLE_SQL);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					 flag = rs.getString("flag");
					System.out.println("@@@@@ "+flag);
					ServletContext ctx = e.getServletContext();
					ctx.setAttribute("flag", flag);
				}
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} 
    	finally {
    		if(rs!=null) {
    			try {
					rs.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    		}
    		if(pstmt!=null) {
    			try {
					pstmt.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    		}
    		if(con!=null) {
    			try {
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    		}
    	}
    	
    	
    	
    	System.out.println("(((("+flag);
    	
    	if(flag.equals("y")) {
    	ArrayList<RightDTO> right = new ArrayList<>();
		RightDTO rightdto = new RightDTO("Add Member" , "adduser.jsp");
		RightDTO rightdto1 = new RightDTO("Add Role" , "addrole.jsp");
		RightDTO rightdto2 = new RightDTO("UserRolemap","userrolemap.jsp");
		RightDTO rightdto3 = new RightDTO("RoleRightmap","getrights");
		RightDTO rightdto4 = new RightDTO("View Librarian","viewlibrarian");
		RightDTO rightdto5 = new RightDTO("Add Book","addbook.jsp");
		RightDTO rightdto6 = new RightDTO("Add Student","addstudent.jsp");
		RightDTO rightdto7 = new RightDTO("View Books","viewbook");
		RightDTO rightdto8 = new RightDTO("Book Issue","bookissue.jsp");
		RightDTO rightdto9 = new RightDTO("View Issued book","viewissuedbook");
		RightDTO rightdto10 = new RightDTO("Return book","returnbook.jsp");
		right.add(rightdto);
		right.add(rightdto1);
		right.add(rightdto2);
		right.add(rightdto3);
		right.add(rightdto4);
		right.add(rightdto5);
		right.add(rightdto6);
		right.add(rightdto7);
		right.add(rightdto8);
		right.add(rightdto9);
		right.add(rightdto10);
		
		UserDAO userdao = new UserDAO();
		
			String msg;
			try {
				msg = userdao.uploadRights(right);
				if(msg.equals("insert")) {
					System.out.println("Right upload");
					}
					else {
						System.out.println("not uploaded");
					}
			} catch (ClassNotFoundException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		
    	}
    	
    		
    	}
    
}
