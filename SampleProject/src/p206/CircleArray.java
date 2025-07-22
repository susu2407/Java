package p206;
/*
 * 날짜 : 2025/07/22
 * 이름 : 이수연
 * 내용 : 예제 4-6 p.206 Circle 객체 배열 만들기
 */


class Circle {
	int radius;
	public Circle (int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	
}

public class CircleArray {
	public static void main(String[] args) {
		Circle [] c; 		// Circle 배열에 대한 레퍼런스 c 선언
		c = new Circle[5]; 	// 5개의 레퍼런스 배열 생성
		
		for (int i=0; i<c.length; i++) 	// 배열의 개수 만큼
			c[i] = new Circle(i);		// i 번째 원소 객체 생성
		
		for (int i=0; i<c.length; i++) 	// 배열의 모든 Circle 객체의 면적 출력
			System.out.println((int)c[i].getArea()+" ");
	}
	
}