package sub2;

/*
 * 날짜 : 2025/07/07
 * 이름 : 이수연
 * 내용 : 자바 변수 자료형 실습하기
 */

public class DataTypeTest {
	
	public static void main(String[] args) {
		
		//정수형
		byte num1 = 127; 						 //1byte
		short num2 = 32767; 					 //2byte
		char num3 = 97;							 //2byte
		int num4 = 2147483647; 					 //4byte, 多★★★
		long num5 = 9_223_372_036_854_775_807L;  //8byte
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		System.out.println("num5 : " + num5);
		
		
		//실수형
		float var1 = 0.123456789f;					//4byte
		double var2 = 0.1234567890123456789123123;  //8byte, 多★★★
		
		System.out.println("var1 : "+var1); //소수점 8자리
		System.out.println("var2 : "+var2); //소수점 17자리 까지 나타낼 수 있다 (정밀도 float<double, 그래서 double을 더 많이 씀
		
		
		//논리형
		boolean value1 = true;
		boolean value2 = false;
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		
		
		//문자형
		char c1 = 'A';
		char c2 = '왕';
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		int n1 = c1; //char는 정수형 타입이기 때문에 int형으로 대입가능. 아스키코드 정수값으로.
		int n2 = c2;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		
		//문자열
		String s1 = "A";
		String s2 = "량";
		String s3 = "Import";
		String s4 = "가을";
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);
		
		
	}
}
