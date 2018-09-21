package org.lanqiao.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection{
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static String url ="jdbc:oracle:thin:@localhost:1521:PROD";
	private static String name="scott";
	private static String psw ="123";
	private static Connection conn = null;
	/*
	 * 获取数据库连接
	 */
	public static Connection getConnection() {
		if(conn != null) return conn;
		try {
			conn = DriverManager.getConnection(url, name, psw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}
