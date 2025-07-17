package test4.sub1;
/*
 * 날짜 : 2025/07/17
 * 이름 : 이수연
 * 내용 : 자바 연습문제4 - 문제 1.
 */

public class Main {
	
	public static void main(String[] args) {
		StudentScore student = new StudentScore("홍길동", "S001", "자바", 90.0);
		
		student.printStudentInfo();
		System.out.println("--------------------");
		
		student.updateScore(98.0);
		System.out.println("--------------------");
		
		student.updateScore(102.0);
		System.out.println("--------------------");
		
		student.printStudentInfo();
		System.out.println("--------------------");
		
	}

}

//수업 내용 중, 속성(ch05/sub4) 참고
