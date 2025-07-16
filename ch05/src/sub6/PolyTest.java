package sub6;
/*
 * 널짜 : 2025/07/15
 * 아룸 : 이수연
 * 내용 : 다형성 실습하기
 * 
 * 다형성(Polymorphism)
 *  - 상속관계에서 부모클래스의 기능이 자식클래스에서 다양한 형태로 변하는 특징
 *  - 객체 생성할 때 타입선언을 부모클래스 타입으로 선언(업캐스팅) - 적극활용하기
 *  - 다형성을 통해서 프로그래밍의 중복코드를 줄이고, 유연성을 향상 된다.
 *  
 */

public class PolyTest {
	
	public static void main(String[] args) {
		
		// 다형성 - 자식객체의 타입선언을 부모타입으로 선언(하는 것이 일반적)
		Animal tiger = new Tiger();	//업캐스팅
		Animal eagle = new Eagle();	//업캐스팅
		Animal shark = new Shark();	//업캐스팅
		
		tiger.move();
		tiger.hunt(); //안됨->tiger class에 가서 override해야 함. -> 하기 위해서 Animal class에서 hunt용 메서드를 만들어야 함.
		
		eagle.move(); //ㄴ처리를 통해 ->가능해짐.
		tiger.hunt();
				
		shark.move();
		tiger.hunt();
		
		
		//
		Tiger t = (Tiger) tiger;
		Eagle e = (Eagle) eagle;
		Shark s = (Shark) shark;
		
		t.move();
		t.hunt();
		
		e.move();
		e.hunt();
		
		s.move();
		s.hunt();
		
		Animal[] arr = {t, e, s};
		
		arr[0].move();
		arr[1].move();
		arr[2].move();		
		
		//연습문제
		Pet dog = new Dog();
		Pet cat = new Cat();
		
		printSound(dog);
		printSound(cat);
		
				
	}
	
	public static void printSound(Pet pet) {
		pet.makeSound();
		
	}
}
