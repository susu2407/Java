package p146;
/*
 * 날짜 : 2025/07/21
 * 이름 : 이수연
 * 내용 : 예제3-12 배열 리턴
 */

public class ReturnArray {
	static int[] makeArray() {
		int temp[] = new int[4];
		for (int i=0; i<temp.length; i++)
			temp[i] = i;
		return temp;
	}
	
	public static void main(String[] args) {
		int intArray[];
		intArray = makeArray();
		for (int i=0; i<intArray.length; i++)
			System.out.print(intArray[i] + " ");
	}
	
	
	

}
