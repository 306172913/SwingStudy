package org.lanqiao.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.lanqiao.DBUtil.DBConnection;
import org.lanqiao.dao.MenuDao;
import org.lanqiao.entity.Menu;

public class MenuDaoImpl implements MenuDao {
	PreparedStatement pstmt = null;
	@Override
	public boolean insertMenu(Menu menu) {
		// TODO Auto-generated method stub
		String sql ="insert into menu(mid,mname,kind_id,mprice) values(1,?,?,?)";
		Connection conn = DBConnection.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, menu.getMname());
			pstmt.setInt(2, menu.getKind_id());
			pstmt.setInt(3, menu.getMprice());
			int i = pstmt.executeUpdate();
			if(i>0) return true;
 		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
