package org.lanqiao.service.impl;

import org.lanqiao.dao.MenuDao;
import org.lanqiao.dao.impl.MenuDaoImpl;
import org.lanqiao.entity.Menu;
import org.lanqiao.service.MenuService;

public class MenuServiceImpl implements MenuService {
	MenuDao menudao = new MenuDaoImpl();
	@Override
	public boolean addMenu(Menu menu) {
		// TODO Auto-generated method stub
		return menudao.insertMenu(menu);
	}

}
