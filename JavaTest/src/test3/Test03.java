package test3;
/*
 * 날짜 : 2025/07/16
 * 이름 : 이수연
 * 내용 : 클래스 연습문제
 */
class Car {
	private String company;
	private String name;
	private int price;
	
	public Car(String company, String name, int price) {
		
		this.company = company;
		this.name = name;
		this.price = price;
	}
	
	public void drive() {
		System.out.println(name+" 운행 중...");
		}
	
	public void info() {
		System.out.println("제조사 : " + company);
		System.out.println("차량명 : " + name);
		System.out.println("가 격 : " + price);
	}

}

public class Test03 {
	public static void main(String[] args) {
		Car sonata = null;
		Car k5 = null;
		
		sonata = new Car("현대", "소나타", 3000);
		k5 = new Car("기아", "K5", 0);
		
		sonata.drive();
		sonata.info();
		k5.drive();
		
		k5.info();
		}


}
