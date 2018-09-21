package org.lanqiao.entity;

public class Admin {
	private int aid;
	private String aname;
	private String apsw;
	public Admin() {
		super();
	}
	public Admin(String aname, String apsw) {
		this.aname = aname;
		this.apsw = apsw;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getApsw() {
		return apsw;
	}
	public void setApsw(String apsw) {
		this.apsw = apsw;
	}
	
}
