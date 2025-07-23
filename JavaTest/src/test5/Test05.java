package test5;
/*
 * 날짜 : 2025/07/23
 * 이름 : 이수연
 * 내용 : 자바 연습문제5 5번 API 클래스
 */

class Apple {
	private String country;
	private int price;
	
	public Apple(String string, int i) {
		super();
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}	
}


class Banana {
	private String country;
	private int price;
	
	public Banana(String string, int i) {
		super();
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}
}


class Grape {
	private String country;
	private int price;
	
	public Grape(String country, int price) {
		super();
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}
}





public class Test05 {
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("미국", 2000);
		Grape grape = new Grape("일본", 1000);
		
		showinfo(apple);
		showinfo(banana);
		showinfo(grape);
		
	}

	private static void showinfo(Object fruit) {

		if(fruit instanceof Apple) {
			Apple apple = (Apple) fruit;
			System.out.println(apple);
			
		}else if(fruit instanceof Banana) {
			Banana banana = (Banana) fruit;
			System.out.println(banana);
			
		}else if(fruit instanceof Grape) {
			Grape grape = (Grape) fruit;
			System.out.println(grape);
		}	
	}
}
