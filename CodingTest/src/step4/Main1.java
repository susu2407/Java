package step4;
/*
문제
총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); 	// 1번째)총 개수
		int arr[] = new int[t];	// 2번째)배열 선언
		
		for(int i =0; i<t; i++) {	// 3번째) N개의 정수를 차례대로 입력받아 arr 배열에 저장하는 것
			arr[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();	// 4번재) 찾을 숫자 입력
		
		int count = 0;
		for (int i =0; i<t; i++) {
			if(arr[i] == v) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
