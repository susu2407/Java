package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * 날짜 : 2025/07/25
 * 이름 : 이수연
 * 내용 : 자바 Transaction(트랜잭션) 실습하기 _ 금융처럼 민감한 실행은 반드시 트랜잭션 처리가 되어야 한다. 둘다 되거나, 둘다 안되어야 한다.
 */

public class TransactionTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("에러를 발생 하시겠습니까?");
		
		int answer = sc.nextInt();
		
		// DB 정보
		final String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USER = "bank";
		final String PASS = "1234";
		
		Connection conn = null; // 생성과 초기화를 분리하는 것. catch에서 참조할 수 있도록 하기 위해.
		
		try {
			
			conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// 자동 커밋 해제(트랜잭션 시작)
			conn.setAutoCommit(false);
			
			String sql1 = "UPDATE ACCOUNT SET ACC_BALANCE = ACC_BALANCE - 10000 WHERE ACC_CID = ?";
			String sql2 = "UPDATE ACCOUNT SET ACC_BALANCE = ACC_BALANCE + 10000 WHERE ACC_CID = ?";
			
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			psmt1.setString(1, "730423-1000001");
			
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt2.setString(1, "830513-2000003");
			
			
			psmt1.executeUpdate();
			
			if (answer == 1) {
				throw new Exception("예기치 못한 에러가 발생했습니다");
			}
			
			psmt2.executeUpdate();
			
			conn.commit(); // 트랜잭션 작업 홪정(트랜잭션 실행)
			
			
			// 종료
			psmt1.close();
			psmt2.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			// 트랜잭션 작업 취소 // 장애가 발생하면 rollBack 시켜야 함
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		
		System.out.println("프로그램 종료...");
	}

}
