package db;

import java.sql.*;

public class DBConnect {

	public static Connection getConnect() {

		Connection conn = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");// 드라이버 로딩: DriverManager에 등록
		} catch (ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
		}

		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/BOARD";// 사용하는
																	// 데이터베이스명을
																	// 포함한 url
			String userId = "root";// 사용자계정
			String userPass = "root";// 사용자 패스워드

			conn = DriverManager.getConnection(jdbcUrl, userId, userPass);// Connection
																			// 객체를
																			// 얻어냄

			//stmt = conn.createStatement();// Statement 객체를 얻어냄

			//System.out.println("제대로 연결되었습니다");// 성공시 화면에 표시됨
//			stmt.close();
//			conn.close();
		} catch (SQLException e) {
			  e.printStackTrace();
		}
		return conn;
	}
}