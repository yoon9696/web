package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUserInfo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "jtest", "ezen1234");
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();
			String sql = "insert into user_info( " + " ui_num, ui_name, ui_id, ui_pwd)";
			
			sql += "values(1,'홍길동','hong','hong')";
			
			int result = stmt.executeUpdate(sql);
			System.out.println(result + "개 insert되있음");
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}