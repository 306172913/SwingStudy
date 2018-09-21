package org.lanqiao.dao;

import org.lanqiao.entity.Admin;

public interface AdminDao {
	/*
	 * 管理员登录
	 */
	public boolean selectAdmin(Admin admin);
}
