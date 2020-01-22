package com.xyz.elibrary.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.xyz.elibrary.dto.LoginDTO;
import com.xyz.elibrary.dto.RegisterDTO;
import com.xyz.elibrary.dto.RightDTO;
import com.xyz.elibrary.dto.UserDTO;
import com.xyz.elibrary.utils.CommonDAO;
import com.xyz.elibrary.utils.MyQueries;

public class UserDAO {
		public String doRegister(RegisterDTO registerdto) throws ClassNotFoundException, SQLException {
			
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement(MyQueries.REGISTER_SQL);
			pstmt.setString(1, registerdto.getName());
			pstmt.setString(2, registerdto.getPassword());
			pstmt.setString(3, registerdto.getEmailid());
			pstmt.setString(4, registerdto.getPhoneno());
			
			int record = pstmt.executeUpdate();
			return record>0?"Insert":"not insert";
			}
			finally {
				if(con!=null) {
					con.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
			}
		}
		
		
		
		public RegisterDTO  doLogin(LoginDTO logindto) throws ClassNotFoundException, SQLException {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			RegisterDTO registerdto = null;
			ArrayList<RightDTO> rights = null;
			try {
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement(MyQueries.LOGIN_SQL);
			pstmt.setString(1, logindto.getName());
			pstmt.setString(2, logindto.getPassword());
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				if(registerdto==null) {
				registerdto = new RegisterDTO();
				registerdto.setName(rs.getString("username"));
				System.out.println("$$"+rs.getString("username"));
				registerdto.setRolename(rs.getString("rolename"));
				rights = new ArrayList<>();
				registerdto.setRights(rights);
				}
			
			RightDTO rightdto = new RightDTO(rs.getString("rightname") , rs.getString("linkname"));
			rights.add(rightdto);
		}
			}
			finally {
				if(con!=null) {
					con.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}
			return registerdto;
}
		
		public String updateFlag() throws SQLException, ClassNotFoundException {
			Connection con = null;
			PreparedStatement pstmt = null;
			try{
			con	= CommonDAO.getConnection();
			pstmt = con.prepareStatement(MyQueries.UPDATEFLAG_SQL);
			
			
			  int record = pstmt.executeUpdate();
			  return record>0?"update":"not update";
			}
			finally {
				if(pstmt!=null) {
					pstmt.close();
				}
				if(con!=null) {
					con.close();
				}
				
			}
		}
		
		public String addRole(String role , String desc) throws ClassNotFoundException, SQLException {
			 Connection con = null;
          	  PreparedStatement pstmt = null;
          	  try {
              	  con = CommonDAO.getConnection();
              	  pstmt = con.prepareStatement(MyQueries.ADDROLE_SQL);
              	  pstmt.setString(1,role );
              	  pstmt.setString(2, desc);
              	  int records = pstmt.executeUpdate();
              	  return records>0 ?"insert Successfully":"not inserted";
              	 
              		 
              	  }
              	  
              	  finally {
              		 
              		  if(pstmt!=null) {
              			  pstmt.close();
              		  }
              		  
              		  if(con!=null) {
              			  con.close();
              		  }
		}
		}
		
		public String userRoleMap(int uid  , int roleid) throws ClassNotFoundException, SQLException {
			Connection con = null;
           	  PreparedStatement pstmt = null;
           	  try {
               	  con = CommonDAO.getConnection();
               	  pstmt = con.prepareStatement(MyQueries.USERROLEMAP_SQL);
               	  pstmt.setInt(1,uid);
               	  pstmt.setInt(2, roleid);
               	  int records = pstmt.executeUpdate();
               	  return records>0 ?"insert Successfully":"not inserted";
               	 
               		 
               	  }
               	  
               	  finally {
               		 
               		  if(pstmt!=null) {
               			  pstmt.close();
               		  }
               		  
               		  if(con!=null) {
               			  con.close();
               		  }
		}
		}
		
		
		
		
		 public int getIdByName(String username ) throws SQLException, ClassNotFoundException {
			 Connection con = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				int id = 0;
				try {
				con = CommonDAO.getConnection();
				pstmt = con.prepareStatement(MyQueries.GETIDBYNAME_SQL);
				
				pstmt.setString(1, username);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					 id = rs.getInt("uid");
				}
				
				}
				finally {
				if(rs!=null) {
					rs.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(con!=null) {
					con.close();
				}
				}
				
				return id;
				
		 }
		 
		 
		 public int getRoleId(String rolename ) throws SQLException, ClassNotFoundException {
			 Connection con = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				int roleid = 0;
				try {
				con = CommonDAO.getConnection();
				pstmt = con.prepareStatement(MyQueries.GETROLEID_SQL);
				
				pstmt.setString(1, rolename);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					 roleid = rs.getInt("roleid");
				}
				
				}
				finally {
				if(rs!=null) {
					rs.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(con!=null) {
					con.close();
				}
				}
				
				return roleid;
				
		 }
		 
		 
		 public String uploadRights(ArrayList<RightDTO> list) throws ClassNotFoundException, SQLException {
				Connection con = null;
				PreparedStatement pstmt = null;
				try{
				con	= CommonDAO.getConnection();
				pstmt = con.prepareStatement(MyQueries.UPLOADRIGHT_SQL);
				
				for(int i = 0;i<list.size();i++) {
					pstmt.setString(1, list.get(i).rightname);
					pstmt.setString(2, list.get(i).linkname);
					pstmt.addBatch();
					System.out.println("%%% "+list.get(i).rightname);
				}
				
				  int records[] = pstmt.executeBatch();
				  return records.length>0?"insert":"not insert";
				}
				finally {
					if(pstmt!=null) {
						pstmt.close();
					}
					if(con!=null) {
						con.close();
					}
					
				}
			}
		
		 
		 public ArrayList<RightDTO> getRights() throws ClassNotFoundException, SQLException {
				Connection con = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				//RegisterDto registerdto = null;
				ArrayList<RightDTO> rights = new ArrayList<>();
				//String m = "";
				try {
			con	= CommonDAO.getConnection();
			pstmt = con.prepareStatement(MyQueries.GETRIGHTS_SQL);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
		
				RightDTO rightdto = new RightDTO(rs.getString("rightname") ,rs.getInt("rightid"), rs.getString("linkname"));
				rights.add(rightdto);
				
						
				
			}
				}
				finally {
					if(rs!=null) {
						rs.close();
					}
					if(pstmt!=null) {
						pstmt.close();
					}
					if(con!=null) {
						con.close();
					}
				}
				return rights;
		 }
			

		public String roleRightMap(int roleid , String[] rightid) throws ClassNotFoundException, SQLException {
			
			Connection con = null;
			PreparedStatement pstmt = null;
			 try {
              	  con = CommonDAO.getConnection();
              	  pstmt = con.prepareStatement(MyQueries.ROLERIGHTMAP_SQL);
              	  pstmt.setInt(1,roleid);
              	 
              	  for(String values:rightid) {
              		  pstmt.setString(2, values);
              		  pstmt.addBatch();
              	  }
              	 
              	  int records[] = pstmt.executeBatch();
              	  return records.length>0 ?"insert Successfully":"not inserted";
              	 
              		 
              	  }
              	  
              	  finally {
              		 
              		  if(pstmt!=null) {
              			  pstmt.close();
              		  }
              		  
              		  if(con!=null) {
              			  con.close();
              		  }
		}
			
		}
		
	
		
		 public ArrayList<RegisterDTO> viewLibrarian() throws SQLException, ClassNotFoundException {
			 Connection con = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				ArrayList<RegisterDTO> list = new ArrayList<>();
			RegisterDTO registerdto = null;
			try {
				con = CommonDAO.getConnection();
				pstmt = con.prepareStatement(MyQueries.VIEWLIBRARIAN_SQL);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					
					 registerdto = new RegisterDTO();
					 registerdto.setUid(rs.getInt("uid"));
					 registerdto.setName(rs.getString("username"));
					 registerdto.setEmailid(rs.getString("email"));
					 registerdto.setPassword(rs.getString("password"));
					 registerdto.setPhoneno(rs.getString("phoneno"));
					 list.add(registerdto);
				}
				
				}
				finally {
				if(rs!=null) {
					rs.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(con!=null) {
					con.close();
				}
				}
				
				return list;
		 }
		 
		 
		 public String deleteLibrarian(int id) throws ClassNotFoundException, SQLException {
			 
			 Connection con = null;
				PreparedStatement pstmt = null;
				try{
				con	= CommonDAO.getConnection();
				pstmt = con.prepareStatement(MyQueries.DELETELIBRARIAN_SQL);
				pstmt.setInt(1, id);
				
				  int record = pstmt.executeUpdate();
				  return record>0?"delete":"not delete";
				}
				finally {
					if(pstmt!=null) {
						pstmt.close();
					}
					if(con!=null) {
						con.close();
					}
					
				}
			}
			 
		 
		 public RegisterDTO getUser(int id) throws ClassNotFoundException, SQLException {
			 Connection con = null;
			 PreparedStatement pstmt = null;
			 ResultSet rs = null;
			 
			 RegisterDTO registerdto = new RegisterDTO();
			 try {
			 con = CommonDAO.getConnection();
			 pstmt = con.prepareStatement(MyQueries.GETUSER_SQL);
			 pstmt.setInt(1, id);
			 rs = pstmt.executeQuery();
			 while(rs.next()) {
				 registerdto.setUid(rs.getInt("uid"));
				 registerdto.setName(rs.getString("username"));
				 registerdto.setEmailid(rs.getString("email"));
				 registerdto.setPhoneno(rs.getString("phoneno"));
			 }
			 }
			 finally {
				 if(rs!=null) {
					 rs.close();
				 }
				 if(pstmt!=null) {
					 pstmt.close();
				 }
				 if(con!=null) {
	                con.close();
			 }
			 }
			 return registerdto;
		 }
		 
		 
		 public String edit(RegisterDTO registerdto) throws ClassNotFoundException, SQLException {
			 Connection con = null;
			 PreparedStatement pstmt = null;
			 try {
			 con = CommonDAO.getConnection();
			 pstmt = con.prepareStatement(MyQueries.EDIT_SQL);
			
			 pstmt.setString(1,registerdto.getName());
			 pstmt.setString(2,registerdto.getEmailid());
			 pstmt.setString(3,registerdto.getPhoneno());
			 pstmt.setInt(4, registerdto.getUid());
			 System.out.println(registerdto.getUid());
			 int record = pstmt.executeUpdate();
			 return record>0?"successfully inserted" : "not inserted error occured";
			 }
			 finally {
				 if(pstmt!=null) {
					 pstmt.close();
				 }
				 if(con!=null) {
	               con.close();
			 }
			 }
			
		}

		 
 public String deleteUserRole(int id) throws ClassNotFoundException, SQLException {
			 
			 Connection con = null;
				PreparedStatement pstmt = null;
				try{
				con	= CommonDAO.getConnection();
				pstmt = con.prepareStatement(MyQueries.USERROLEDELETE_SQL);
				pstmt.setInt(1, id);
				
				  int record = pstmt.executeUpdate();
				  return record>0?"delete userrole":"not delete userrole";
				}
				finally {
					if(pstmt!=null) {
						pstmt.close();
					}
					if(con!=null) {
						con.close();
					}
					
				}
			}
		 
}

			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

