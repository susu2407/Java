package test5;

import java.util.Scanner;

/*
 * 날짜 : 2025/07/23
 * 이름 : 이수연
 * 내용 : 자바 연습문제5 2번 예외처리
 */

class NotFoundException extends Exception {
	public NotFoundException() {
		super("입력한 숫자를 찾을 수 없습니다!");
	}
}

public class Test02 {
	public static void searchArray(int find, int[] arr) throws NotFoundException  {
		
		for(int i : arr) {
			if(i == find) {
				return;
			}
		}
		throw new NotFoundException();
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 10};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("찾을 숫자 입력 : ");
		int find = sc.nextInt();
		
		try {
			searchArray(find, arr);
			System.out.println("입력한 숫자를 찾았습니다!");			
			
		}catch(Exception e) { // Exception 해서 결과 나왔는데, 강사님은 NotFoundException을 했음. 둘 차이가 뭔지 찾아보기!
			System.out.println(e.getMessage());
			
		}finally {
			sc.close();
		}
		System.out.println("프로그램 종료...");
		
		
	}

}
