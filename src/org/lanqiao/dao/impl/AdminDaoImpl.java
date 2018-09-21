package org.lanqiao.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.lanqiao.DBUtil.DBConnection;
import org.lanqiao.dao.AdminDao;
import org.lanqiao.entity.Admin;

public class AdminDaoImpl implements AdminDao {
	PreparedStatement pstmt = null;
	@Override
	public boolean selectAdmin(Admin admin) {
		// TODO Auto-generated method stub
		boolean b = false;
		Connection conn = DBConnection.getConnection();
		String sql = "select * from admin where aname=? and apsw=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, admin.getAname());
			pstmt.setString(2, admin.getApsw());
			ResultSet rs = pstmt.executeQuery();
			b = rs.next(); 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//DBClose.dbClose(conn, pstmt);//关闭连接如果直接关闭连接
		}
		return b;
	}

}
