package p137;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		int intArray[] = new int[5]; // 배열의 선언과 생성
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "개의 점수를 입력하게요>> ");
		for(int i=0; i<intArray.length; i++)
			intArray[i] = scanner.nextInt(); //키보드에서 입력받은 정수 저장
		
		for(int i=0; i<intArray.length; i++)
			sum += intArray[i];
		
		System.out.println("평균은 " + (double)sum/intArray.length);
		scanner.close();
	}
}
