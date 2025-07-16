package sub7;
/*
 * 날짜 : 2025/07/16
 * 이름 : 이수연
 * 내용 : 추상클래스 실습하기
 */

public class AbstrackTest {
	
	public static void main(String[] args) {
		// 추상클래스는 객체 생성 불가
		//Animal animal = new Animal();
		
		Animal tiger = new Tiger(); // 다형성을 활용해서 처리한 것.
		Animal eagle = new Eagle();
		
		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
	}

}
