package sub5;

public class Truck extends Car {
	
	private int capacity; //적재용량

	public Truck(String name, String color, int speed, int capacity) {
		super(name, color, speed);
		this.capacity = capacity;
		
	}
	
	public void load(int capacity) { //트럭에 무엇을 싣는 기능이라 하자.
		this.capacity += capacity;
		
	}
	
	public void show() {
		super.show();
		System.out.println("현재 적재량 : " + this.capacity);
	}

	
	

}
