package step4;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] num = new int[9];
		for (int i =0; i<9; i++) {
			num[i] = sc.nextInt(); // 입력값 저장			
		}		
		// System.out.println(Arrays.toString(num));
		int max = num[0]; // 첫 번재 값을 기준으로 시작
		int index = 0; // 최댓값의 인덱스 저장을 위한 것
		
		for (int i = 1; i <9; i++) {
			if (num[i] > max) {
				max = num[i];
				index = i;
			}
		}	
		System.out.println(max+"\n"+(index+1));
	}
}
