package p144;
/*
 * 날짜 : 2025/07/21
 * 이름 : 이수연
 * 내용 : 비정방형 배열의 생성과 접근
 */

public class SkewedArray {
	public static void main(String[] args) {
		int intArray[][] = new int[4][]; // 각 행의 레퍼런스 배열 생성
		intArray[0] = new int [3]; // 첫째 행의 정수 3개의 배열 생성
		intArray[1] = new int [2]; // 둘째 행의 정수 2개의 배열 생성
		intArray[2] = new int [3]; // 셋째
		intArray[3] = new int [3]; // 넷째
		
		for ( int i = 0; i<intArray.length; i++)
			for(int j = 0; j<intArray.length; j++)
				intArray[i][j] = (i+1)*10 + j;
		
		
		for ( int i =0; i<intArray.length; i++) {
			for (int j = 0; j <intArray[i].length; j++)
				System.out.println(intArray[i][j] + " ");
			System.out.println();
		}
	}

}
