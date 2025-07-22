package p153;

import java.util.Scanner;

/*
 * 날짜 : 2025/07/22
 * 이름 : 이수연
 * 내용 : 예제3-14.0으로 나누기 예외 발생으로 프로그램이 강제 종료되는 경우
 */

public class DivideByZero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend;	// 나눠지는 수
		int divisor;	// 나누는 수
		
		System.out.println("나눠지는 수를 입력하시오:");
		dividend = scanner.nextInt();
		System.out.println("나누는 수를 입력하시오:");
		divisor = scanner.nextInt();
		System.out.println(dividend+"를 " +divisor + "로 나누면 몫은"+dividend/divisor+"입니다.");
		scanner.close();
		
	}

}
