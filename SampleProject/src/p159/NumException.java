package p159;
/*
 * 날짜 : 2025/07/22
 * 이름 : 이수연
 * 내용 : 교재예제 3-19. 정수가 아닌 문자열을 정수로 변환할 때 예외 발생(NumberFormatException)
 */

public class NumException {
	
	public static void main(String[] args) {
		String[] stringNumber = {"23", "12", "3.141592", "998"};
		
		int i=0;
		
		try {
			for(i=0; i<stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("정수로 변환된 값은 "+ j);
			}
		}
		catch(NumberFormatException e) {
			System.out.println(stringNumber[i] + "는 정수로 변환할 수 없습니다.");
		}
	}

}
