package com.xyz.elibrary.dto;

public class RightDTO {
public String rightname;
public int rightid;
public String linkname;
public RightDTO() {
	
}

public RightDTO(String rightname, int rightid, String linkname) {
	super();
	this.rightname = rightname;
	this.rightid = rightid;
	this.linkname = linkname;
}

public RightDTO(String rightname, String linkname) {
	super();
	this.rightname = rightname;
	this.linkname = linkname;
}

public String getRightname() {
	return rightname;
}
public void setRightname(String rightname) {
	this.rightname = rightname;
}
public String getLinkname() {
	return linkname;
}
public void setLinkname(String linkname) {
	this.linkname = linkname;
}


public int getRightid() {
	return rightid;
}
public void setRightid(int rightid) {
	this.rightid = rightid;
}
@Override
public String toString() {
	return "RightDto [rightname=" + rightname + ", rightid=" + rightid + ", linkname=" + linkname + "]";
}

}
