package org.lanqiao.entity;

public class Menu {
	private int mid;
	private String mname;
	private int kind_id;
	private int mprice;
	
	public Menu() {
		super();
	}
	public Menu(int mid, String mname, int kind_id, int mprice) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.kind_id = kind_id;
		this.mprice = mprice;
	}
	public Menu(String name, int kind_id, int price) {
		// TODO Auto-generated constructor stub
		this.mname = name;
		this.kind_id = kind_id;
		this.mprice = price;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getKind_id() {
		return kind_id;
	}
	public void setKind_id(int kind_id) {
		this.kind_id = kind_id;
	}
	public int getMprice() {
		return mprice;
	}
	public void setMprice(int mprice) {
		this.mprice = mprice;
	}
	
}
