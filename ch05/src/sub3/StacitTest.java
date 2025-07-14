package sub3;
/*
 * 날짜 : 2025/07/14
 * 이름 : 이수연
 * 내용 : Static 변수(클래스 변수), Static 메서드(클래스 메서드) 실습하기
 * 
 * 클래스변수(정적변수), 클래스(정적메서드)
 *  - static 으로 선언한 변수와 메서드
 *  - Method Area 영역에 따로 관리 됨
 *  - new 객체 생성 없이 바로 클래스 타입으로 참조
 *  - 객체(인스턴스) 간의 데이터 공유 목적으로 활용
 */

class Increment {
	private int num1 = 0;			// int 는 초기값이 기본적으로 0이다.
	public static int num2 = 0;; // 클래스 변수(정적변수)
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
	}
}

public class StacitTest {
	
	public static void main(String[] args) {
		// 클래스변수(정적변수) 실습
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		// 전체 차량 수 확인
		Car sonata = new Car("소나타", "흰색", 0);
		Car avante = new Car("아반테", "검정색", 0);
		Car grandu = new Car("그랜져", "검정색", 0);
		
		sonata.show();
		avante.show();
		grandu.show();
		
		
		//System.out.println("전체 차량수 : " + Car.Count); //public 상태일 때는 이렇게 진행.
		
		//클래스 메서드(정적메서드)는 클래스타입으로 참조 호출
		System.out.println("전체 차량수 : " + Car.getCount()); //private 상태일 때는 이렇게.
		
		
		/////////////////////////////////////////////////////
		// 싱클톤 객체 실습
		/////////////////////////////////////////////////////

		// 여러개 객체를 생성할 필요가 없는 객체
		Calc cal = new Calc();
		int result = cal.puls(1, 2);
		System.out.println("result  " + result);
		
		
		
		
	}

}
