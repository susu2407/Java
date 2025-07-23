package test5;
/*
 * 날짜 : 2025/07/23
 * 이름 : 이수연
 * 내용 : 자바 연습문제5 문자열
 */

public class Test04 {
	public static void main(String[] args) {
		
		String fileName = "Hello Word.java";
		
		int idx = fileName.indexOf(fileName);
		
		String title = fileName.toString();
		String ext = fileName.concat(fileName);
		
		
		System.out.println("파일명 : " + title);
		System.out.println("확장자 : " + ext);
		
		//
		
		String strScores = "60, 72, 82, 86, 92";
		String [] scores = strScores.split(", ");
		
		int total = 0; // 초기화
		
		for(String score : scores) {
			total += Integer.parseInt(score);
		}
		
		System.out.println("strScores 총점 : " + total);
	}

}
