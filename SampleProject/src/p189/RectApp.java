package p189;

import java.util.Scanner;

/*
 * 날짜 : 2025/07/22
 * 이름 : 이수연
 * 내용 : 예제 4-2 Rectangle 클래스 만들기 연습
 */

class Rectangle {
	int width;
	int height;
	public int getArea() {
		return width*height;
	}
}

public class RectApp {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.print(">>");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());
		scanner.close();
	}

}
