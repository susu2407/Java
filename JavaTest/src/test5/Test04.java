package test5;
/*
 * 날짜 : 2025/07/23
 * 이름 : 이수연
 * 내용 : 자바 연습문제5 문자열
 */

public class Test04 {
	public static void main(String[] args) {
		
		String fileName = "Hello Word.java";
		
		int idx = fileName.indexOf("."); // indexOf("구분자") : 구분자를 기준으로 문자열 잘라줌. //indexOf(fileName) 아님
		
		String title = fileName.substring(0, idx); 	// toString() 아님
		String ext 	 = fileName.substring(idx+1);		// concat(fileName) 아님.
		
		
		System.out.println("파일명 : " + title);
		System.out.println("확장자 : " + ext);
		
		//--
		
		String strScores = "60, 72, 82, 86, 92";
		String [] scores = strScores.split(", ");
		
		int total = 0; // 초기화
		
		for(String score : scores) {
			total += Integer.parseInt(score);
			//total += Integer.parseInt(score.trim()); // trim() : 띄어쓰기 제거
		}
		
		System.out.println("strScores 총점 : " + total);
	}

}
