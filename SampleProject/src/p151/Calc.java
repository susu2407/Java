package p151;
/*
 * 날짜 : 2025/07/21
 * 이름 : 이수연
 * 내용 : 교재 예제 3-13. main()에서 명령행 인자의 합 계산
 */

public class Calc {
	public static void main(String[] args) {
		double sum = 0.0;
		
		for ( int i=0; i<args.length; i++)
			sum += Double.parseDouble(args[i]);
		
		System.out.println("sum = " + sum);
	}

}
