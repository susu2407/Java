package sub5;
/*
 * 날짜 : 2025/07/22
 * 이름 : 이수연
 * 내용 : 자바 Math 클래스 실습하기
 */

public class MathTest {

	public static void main(String[] args) {
		
		
		// Math 클래스는 static 메서드로 기능 제공
		// Math math = new Math();
		
		System.out.println("절댓값 : " + Math.abs(-5));	// 절댓값 : 5
		System.out.println("절댓값 : " + Math.abs(5));	// 절댓값 : 5
		
		System.out.println("제곱근 : " + Math.sqrt(9));	// 제곱근 : 3.0
		System.out.println("제곱근 : " + Math.sqrt(16));	// 제곱근 : 4.0
		
		System.out.println("올림값 : " + Math.ceil(1.2));	// 올림값 : 2.0
		System.out.println("올림값 : " + Math.ceil(1.8));	// 올림값 : 2.0
		
		System.out.println("내립값 : " + Math.floor(1.2));// 내립값 : 1.0
		System.out.println("내립값 : " + Math.floor(1.8));// 내립값 : 1.0
		
		System.out.println("반올림 : " + Math.round(1.2));// 반올림 : 1
		System.out.println("반올림 : " + Math.round(1.8));// 반올림 : 2
		
		
		// random : 임의의 수
		double num1 = Math.random();
		System.out.println("num1 : " + num1); // 0~1 사이의 실수 random 으로. 	// num1 : 0.3686894132298165
		double num2 = num1 * 10;
		System.out.println("num2 : " + num2); // 0~10 사이의 실수	// num2 : 1.9066936871054618
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : " + num3);// 0~10 사이의 정수	// num3 : 4.0
				
		double rand = Math.ceil(Math.random() * 10);
		System.out.println("rand : " + rand); // rand : 8.0
		
		
		
	}

}
