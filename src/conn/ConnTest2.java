package conn;

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
			Class.forName("oracle.jdbs.OracleDriver");
		}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		
		try {
			Connection con = DriverManager.getConnection(
					"jdbs:oracle:thin:@localhost:1521/xe","jtest","ezen1234");
			
			Statement stmt = con.createStatement();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
