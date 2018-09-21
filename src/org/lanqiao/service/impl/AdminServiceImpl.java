package org.lanqiao.service.impl;

import org.lanqiao.dao.AdminDao;
import org.lanqiao.dao.impl.AdminDaoImpl;
import org.lanqiao.entity.Admin;
import org.lanqiao.service.AdminService;

public class AdminServiceImpl implements AdminService {

	@Override
	public boolean adminLogin(Admin admin) {
		// TODO Auto-generated method stub
		boolean b = false;
		AdminDao adminDao = new AdminDaoImpl();
		b = adminDao.selectAdmin(admin);
		return b;
	}

}
