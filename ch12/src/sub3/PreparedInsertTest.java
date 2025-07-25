package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2025/07/25
 * 이름 : 이수연
 * 내용 : 자바 PreparedInsert (insert, select) 실습하기
 */

public class PreparedInsertTest {
	public static void main(String[] args) {
		
		
		// DB 정보
		final String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USER = "tndus159200297";
		final String PASS = "1234";
		
		try {
			
			// 데이터베이스 접속
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// SQL 실행객체 생성(PreparedStatement)
			String sql = "INSERT INTO USER1 VALESR (?, ?, ?, ?)"; // 쿼리 파라미터를 사용한 SQL(준비된 쿼리)// ()안에 맵핑/사상/대입을 시켜줘야 함.
			PreparedStatement psmt = conn.prepareStatement(sql); // Prepared : (영단 뜻) 준비된
			
			// 각 쿼리 파라미터를 바인딩
			psmt.setString(1, "P101");
			psmt.setString(2, "김유신");
			psmt.setString(3, "010-1222-3333");
			psmt.setInt(4, 34);
			
			
			// SQL 실행
			psmt.executeUpdate(); // INSERT, DELETE, UPDATE는 executeUpdate() 실행!!! Update!!!
			
			// 결과처리(SELECT 경우)
			
			//데이터베이스 종류
			psmt.close();
			conn.close();			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Insert 완료...");
		
	}

}
