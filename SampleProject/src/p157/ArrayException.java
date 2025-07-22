package p157;
/*
 * 날짜 : 2025/07/22
 * 이름 : 이수연
 * 내용 : 교재예제 3-16. 범위를 벗어난 배열의 접근(ArrayIndexOutOfBoundsException)
 */

public class ArrayException {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 0;
		try {
			for ( int i=0; i<5; i++ ) {
				intArray[i+1] = i+1 + intArray[i]; // i=4인 경우 예외 발생
				System.out.println("inArray[" + i+ "]="+intArray[i]);
			}			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다");
		}
	}

}
