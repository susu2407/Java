package sub2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 *  날짜 : 2025/07/21
 *  이름 : 이수연
 *  내용 : 자바 예외 던지기 실습하기
 */

public class ThrowsTest {
	
	public static void main(String[] args) {
		//5. try-catch
		try {
			// 2. 여기에서 메서드1을 호출한다
			method1(7);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료...");
	}

	//6. throws Exception 추가. 선언.
	public static void method1(int n) throws Exception { // 모든 예외처리 클래스를 상속하는 상위 클래스 Exception으로 선언.
		method2(n);
		//1. 메서드 1에서 메서드2를 호출한다.		
	}
	
	//InputMismatchException, ArithmeticException을 method2을 호출한 곳에서 예외처리.
		// 4. throws InputMismatchException, ArithmeticException 추가
	public static void method2(int n) throws InputMismatchException, ArithmeticException {
		
		//3. 스케너 생성
		Scanner scanner = new Scanner(System.in);
		System.out.println("값 입력 : ");
		
		int value = scanner.nextInt(); // InputMissmatchException 발생 // int 범위의 수를 입력하지 않으면 발생하는 예외처리.
		
		int result = n / value; // ArtithmeticEsception 발생
		
		System.out.println("result : " + result);
		
	}
}
