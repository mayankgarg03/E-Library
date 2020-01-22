package com.xyz.elibrary.dto;

import java.util.ArrayList;

public class RegisterDTO {
	public int uid;
		public String name;
		public String password;
		public String emailid;
		public String phoneno;
		public String rolename;
		public String linkname;
		public String rightname;
		public int rightid;
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		public ArrayList<RightDTO> rights;
		
		
		
		public String getRolename() {
			return rolename;
		}
		public void setRolename(String rolename) {
			this.rolename = rolename;
		}
		public String getLinkname() {
			return linkname;
		}
		public void setLinkname(String linkname) {
			this.linkname = linkname;
		}
		public String getRightname() {
			return rightname;
		}
		public void setRightname(String rightname) {
			this.rightname = rightname;
		}
		public int getRightid() {
			return rightid;
		}
		public void setRightid(int rightid) {
			this.rightid = rightid;
		}
		public ArrayList<RightDTO> getRights() {
			return rights;
		}
		public void setRights(ArrayList<RightDTO> rights) {
			this.rights = rights;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmailid() {
			return emailid;
		}
		public void setEmailid(String emailid) {
			this.emailid = emailid;
		}
		public String getPhoneno() {
			return phoneno;
		}
		public void setPhoneno(String phoneno) {
			this.phoneno = phoneno;
		}
		@Override
		public String toString() {
			return "RegisterDTO [name=" + name + ", password=" + password + ", emailid=" + emailid + ", phoneno="
					+ phoneno + "]";
		}
		
		
		
}
