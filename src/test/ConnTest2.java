package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnTest2 {
//단위테스트
	/*DDL : 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe","jtest","ezen1234");
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();
			String sql = "update Song_info";
			sql += " set si_name = '동전한닢',";
			sql += "  si_singer = '다듀',";
			sql += "  si_genre = '힙합',";
			sql += "  si_creadat = '20070531'";
			sql += "where si_num=3";
			int result = stmt.executeUpdate(sql);
			System.out.println(result + "개 업데이트 됭씨음");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
