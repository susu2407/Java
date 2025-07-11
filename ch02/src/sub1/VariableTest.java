package sub1;
/*
 * 날짜 : 2025/07/07
 * 이름 : 이수연
 * 내용 : VariableTest 변수 실습하기
 */
public class VariableTest {
	public static void main(String[] args) {
		//변수(variable)
		int a = 3; //변수 선언 및 초기화 //=기호의 의미는 오른쪽의 값을 왼쪽에 있는 문자에 (대입)담아라. 문자의 데이터 크기를 '선언'해주어야 함. 보편적으로 int를 사용함.
		int b = 7; //용량이 많아져서 편의상 'int'로 거의 통일하여 사용함.
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		//재할당
		a = 5; //전에 있던 값과 상관없이 값을 재설정하게 되는 것. 17번 줄부터는 a값이 5로 바뀌는 것. 그전은 3으로 출력됨.
		System.out.println("a : " + a);
		
		//상수(constant) : 'final'을 사용하여 NUM의 값을 10으로 고정하여 '상수'로 만드는 것.
		final int NUM = 10; //'상수'는 대문자로 표기하는 것이 '관습'
		
		//상수는 초기화된 값으로 고정되기 때문에 재할당 안됨
		//num = 11;
		System.out.println("NUN : " + NUM);
	}

}
