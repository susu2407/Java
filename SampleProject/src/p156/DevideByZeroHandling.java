package p156;
/*
 * 날짜 : 2025/07/22
 * 이름 : 이수연
 * 내용 : 교재예제 3-15. 0으로 나눌 때 발생하는 AritheticException 예외 처리
 */

import java.util.Scanner;

public class DevideByZeroHandling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("나눠지는 수를 입력하시오:");
			int dividend = scanner.nextInt();	//나누어지는 수 입력
			System.out.println("나누는 수를 입력하시오:");
			int divisor = scanner.nextInt();	// 나누는 수 입력
			
			try {
				System.out.println(dividend+"를 " +divisor + "로 나누면 몫은"
									+dividend/divisor+"입니다.");
				break;				
			}
			catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요");
			}
			
		}
		scanner.close();
	}
}
