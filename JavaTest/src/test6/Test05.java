package test6;
/*
 * 날짜 : 2025/07/24
 * 이름 : 이수연
 * 내용 : 자바 연습문제6.자바 총정리
 * 
 * 원주율
 * - ∏ = 4 x (1/1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
 * - 항수가 늘어날수록 정확도가 높아진다. 
 * 
 * 라이프니츠 공식이라는 π 값을 계산하는 수열을 구현한 것
 * */


public class Test05 {
	public static void main(String[] args) {
		
		boolean sign = false;
		double pi = 0;
		
		for (int i = 1; i <= 10000000 ; i += 2) {
			
			if ( i % 4 == 1 ) { // 빈칸 입력 : if(// i % 4 == 1 //)
				pi += 1.0 / i;
				sign = true;
				
			} else {
				pi -= 1.0 / i;
				sign = false;
				
			}
			
			System.out.printf("i = %d, PI = %f\n", i, 4 * pi);
		}
	}
}
