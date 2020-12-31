package conn;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnTest {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");//종류 오라클선택
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe","jtest","ezen1234");//호스트 포트 서비스명 사용자이름 비밀번호 이상이 없으면 con한태 넘겨준다
			con.setAutoCommit(false);//자동적으로 저장하지마라.
			Statement stmt = con.createStatement();//쿼리문 쓰는 화면 
			String sql = "insert into song_info(si_num,si_name,si_genre,si_singer,si_creadat)";
			sql += "values(1,'애국가','KPOP','우리모두','19401201')";
			int result = stmt.executeUpdate(sql);//업데이트해 명령때림.
			System.out.println(result+"개 insert되있음");
			//원래는 종료를 해야된다 .프로그램이 끝나게 되면 자동적으로 종료는 된다 . 하지만 적어줘야된다 .배우진않았다.
			con.commit();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
