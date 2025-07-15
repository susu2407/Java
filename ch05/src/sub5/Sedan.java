package sub5;

public class Sedan extends Car {
	
	private int cc; //배기량

	public Sedan(String name, String color, int speed, int cc) {
		// 부모클래스 생성자 호출, 자식클래스는 부모클래스 속성을 초기화해줘야 됨
		super(name, color, speed);
		this.cc = cc;

	}
	
	// 상수(Constant) = 최초 한번 초기화된 값으로 고정된 변수
	private final int MAX_SPEED = 180;
	
	// speedUp + Ctrl + space 해서 찾으면 아래 오버라이드가 생성됨.
	@Override
	public void speedUp(int speed) {
		//부모클래스 speedup을 자식클래스에 맞게 재정의
		super.speedUp(speed);
	}
	
	public void turbo() {
		// 부모 클래스 speed 참조를 위해 접근권환을 private 에서 protected 로 변경
		//(그래서 Car class에서 있는 private int speed → protected int speed로 바꿔줘야 함.)
		this.speed += 10;;
	}
	
	public void show() {
		super.show(); //부모클래스 show() 호출
		System.out.println("배기량 : " + this.cc);
	}
}
