package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2025/07/25
 * 이름 : 이수연
 * 내용 : 자바 Delete 실습하기
 */
public class DeleteTest {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "tndus159200297";
		String pass = "1234";
		
		try {
			// 데이터베이스 접속
			Connection conn =  DriverManager.getConnection(host, user, pass);
			
			// SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			// SQL 실행
			String sql = "DELETE FROM USER1 WHERE USER_ID='J101'"; // 제일 중요
			stmt.executeUpdate(sql);
			
			// 결과 처리(SELECT문 일 결우)
			
			// 데이터베이스 종료
			stmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Update 완료...");	
	}

}
