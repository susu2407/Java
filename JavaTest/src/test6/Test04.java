package test6;
/*
 * 날짜 : 2025/07/24
 * 이름 : 이수연
 * 내용 : 자바 연습문제6.자바 총정리
 */

public class Test04 {
	public static void main(String[] args) {
		
		int index;
		int primes = 0;
		
		for (int i = 2; i < 100; i++) {
			for (index = 2; index < i; index++) {
				if (i % index == 0) {
					index = i ;
				}
			}
			
			if (i == index) {
				primes++;
				System.out.printf("%5d%s", i, primes % 10 == 0 ? "\n" : "");
			}
		}
		System.out.printf("\n2부터 100 사이의 소수의 개수 : %d개", primes);
	}
}
