package com.xyz.elibrary.utils;

public interface MyQueries {
		String REGISTER_SQL = "insert into user (username,password,email,phoneno) values(?,?,?,?)";
		String LOGIN_SQL  =  "select user.username,user.password,role.rolename,right_mst.rightname,right_mst.linkname"
				+ " from user,role,right_mst,user_role_mapping , role_right_mapping where user.uid = user_role_mapping.uid"
				+ " and role.roleid = user_role_mapping.roleid and role.roleid = role_right_mapping.roleid and"
				+ " right_mst.rightid = role_right_mapping.rightid and username = ? and password = ?";
		String 	UPDATEFLAG_SQL = "update startuptable set flag = 'n' where flag = 'y'";
		String 	STARTUPTABLE_SQL = "select flag from startuptable";
		String ADDROLE_SQL = "insert into role (rolename,description) values(?,?)";
		String USERROLEMAP_SQL = "insert into user_role_mapping (uid,roleid) values(?,?)";
		String ROLERIGHTMAP_SQL = "insert into role_right_mapping (roleid,rightid) values(?,?)";
		String 	GETIDBYNAME_SQL = "select uid from user where username=?";
		String 	GETROLEID_SQL = "select roleid from role where rolename = ?";
		String 	UPLOADRIGHT_SQL = "insert into right_mst (rightname,linkname) values(?,?)";
		String GETRIGHTS_SQL = "select rightid,rightname,linkname from right_mst ";
		String 	VIEWLIBRARIAN_SQL = " select user.uid,user.username,user.password,user.email,user.phoneno from user,role, "
				+ "user_role_mapping where user.uid =user_role_mapping.uid and role.roleid = user_role_mapping.roleid and"
				+ " role.rolename = 'librarian'";
		String	DELETELIBRARIAN_SQL = "delete from user where  uid = ?";
		String USERROLEDELETE_SQL = "delete from user_role_mapping where uid=?";
		String GETUSER_SQL = "select uid , username , email , phoneno from user where  uid = ?";
		String EDIT_SQL = "update user set username = ? , email = ? , phoneno = ? where uid = ?";
		String ADDBOOK_SQL = "insert into book(bookno , bookname , author , publisher , quantity) values(?,?,?,?,?)";
		String GETBOOKS_SQL = "select bookid,bookno,bookname,author,publisher,quantity from book";
		String ADDSTUDENT_SQL = "insert into student (rollno,sname,sphoneno,branch,semester) values(?,?,?,?,?)";
		String ISSUEBOOK_SQL = "insert into issuebook(bookno,rollno,issuedate , returndate) values(?,?,?,?)";
		String VIEWISSUEDBOOK_SQL = "select student.sname,student.rollno,student.branch,student.semester, "
				+ "book.bookname,book.bookno , issuebook.returndate from book,student,issuebook where"
				+ " student.rollno = issuebook.rollno and book.bookno = issuebook.bookno;";
		String RETURNBOOK_SQL = "delete from issuebook where bookno = ? , rollno = ?"; 
}
