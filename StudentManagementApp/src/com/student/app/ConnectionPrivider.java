package com.student.app;

import java.sql.*;
import java.util.*;
public class ConnectionPrivider {
	
	static Connection conn;
	
	public static Connection CreateConnection() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/student_mana";
			String user = "root";
			String password = "";
			conn = DriverManager.getConnection(url, user, password);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
