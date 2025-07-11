package test1;

/*
 * 날짜 : 2025/07/09
 * 이름 : 이수연
 * 내용 : 자바 연산자 연습문제
 */
public class Test03 {
	public static void main(String[] args) {
		
		int num = 1; // num 연산을 해야 하므로, '선언(int num;)'만 하면 안됨. '초기화(int num = 0;)'해야 함.
		int result;
		
		
		result = num++; // 연산자가 뒤에 있으므로, 선 대입 후 연산.
		System.out.println("result : " + result); // result = 1(출력) -> 1+1 = 2 값이 ++num의 num에 대입되는 값.
		
		result = ++num; // 선 연산 후 대입 // result = 2+1 = 2
		System.out.println("result : " + result);
		
		result = num--;
		System.out.println("result : " + result);
		
		result = --num;
		System.out.println("result : " + result);
		
		
	}

}
