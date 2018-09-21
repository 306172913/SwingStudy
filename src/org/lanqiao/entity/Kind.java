package org.lanqiao.entity;

public class Kind {
	private int kid;
	private String kname;
	private String kinfo;
	public Kind() {
		super();
	}
	public Kind(int kid, String kname, String kinfo) {
		this.kid = kid;
		this.kname = kname;
		this.kinfo = kinfo;
	}
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public String getKinfo() {
		return kinfo;
	}
	public void setKinfo(String kinfo) {
		this.kinfo = kinfo;
	}
	
}
