package sub4;

public class Person {
	//속성
	private String name;
	private int age;
	
	// 생성자(Constructor) - 속성을 초기화하는 반환타입이 없고 클래스명인 메서드
	//public <클래스명> ( 변수 > { 초기화 }
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//메서드
	public void work() {
		System.out.println("Person is working");
	}
	
	public void introduce() {
		System.out.println("제 이름은 [" + name + "]이고 나이는 [" + age + "]세 입니다.");
	}

}
