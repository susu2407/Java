package step4;

import java.util.Scanner;

public class Main3_2 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt(); // 입력 개수
		int [] nums = new int[count]; // 입력 개수만큼 "배열 만들기"
		
		for (int i =0; i<count; i++) {
			nums[i] = sc.nextInt(); // 입력값 저장			
		}
		
		int min = nums[0];
		
		for (int i=1; i<nums.length; i++) {
			if (nums[i]<min) {
				min = nums[i];
			}
		}
		
		
		int max = nums[0]; // 첫 번재 값을 기준으로 시작
		
		for (int i = 1; i <nums.length; i++) {
			if(nums[i] > max) { // max와 비교해서 nums[i]가 더 크면 if 문 실행
				max = nums[i]; // 더 큰 값이 있으면 max 갱신
			}
		}	
		
		System.out.print(min +" " + max); // 입력값 출력
		sc.close();		
	}
}
