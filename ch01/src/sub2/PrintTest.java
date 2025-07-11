package sub2;
/*
	날짜 : 2025/07/07
	이름 : 이수연
	내용 : Java 다양한 출력 실습
*/
public class PrintTest {
	public static void main(String[] args) {
		//기본 출력
		System.out.println("Hello Java!"); //한줄복사 ctrl+Art+방향키 아래(우)
		System.out.println("Hello World!"); //한줄삭제 crtl+d
		System.out.println("Hello Susu!"); //작업취소 crtl+z
		System.out.println("Hello Busan!"); //작업실행 ctrl+F11
		
		//한 줄(에 모두) 출력
		System.out.print("Wellocome "); //ln(줄바꿈line) 처리가 안됙 때문에그 다음 출력문이바로 이어서 출력됨
		System.out.print("Java!");
		
		//개행 출력
		System.out.println(); //줄바꿈
		System.out.print("Wellcome\n"); // \n 개행처리 이스케이프 특수문자
		System.out.print("Korea!");
		
	}
}
