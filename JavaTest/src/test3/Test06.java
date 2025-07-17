package test3;
/*
 * 날짜 : 2025/07/16
 * 이름 : 이수연
 * 내용 : 객체 연습문제
 */

class Adder {
	// 유일한 객체를 저장할 변수
	private static Adder instance = new Adder();
	
	// 객체가 없으면 만들고, 있으면 그걸 리턴
	public static Adder getInstance() {
		return instance;
	}
	// 외부에서 객체 생성 못하게 막음
	private Adder() {} 
	
	private Adder(int value) {
		y += value;
	}
	
	private int x;
	private int y;
	
	//public void add(int x, int y) {
		//this.x += x;
		//y++;
	//}
	
	public void add(int[] arr) {
		this.x += arr[0];
		this.y += arr[1];
	}
	
	public static void add(int a2) {
		// a2.x += 10;
	}
	
	public static Adder add(int a3, int value) {
		return new Adder(value);
	}
	
	public void show() {
		System.out.println("----------");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}


public class Test06 {
	public static void main(String[] args) {
		
		//Adder a1 = new Adder();
		
		//a1.add(1, 2);
		//a1.show();
		
		
	}
}
