package sub1;

// 자바는 모든 클래스가 암.묵.적.으로 오브젝트를 상속 받았음. -> "extends Object" 을 굳이 명시하지 않아도 됨.
public class Apple extends Object {
	//1.
	private String country;
	private int price;
	//2.
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	//3.
	@Override
	public String toString() { 
		// 클래스 정보 출력 메서드
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	
	
	
	
	
}
