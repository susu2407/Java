package step3;
/*
문제
영수증에 적힌,
구매한 각 물건의 가격과 개수
구매한 물건들의 총 금액
을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.

입력
첫째 줄에는 영수증에 적힌 총 금액 
$X$가 주어진다.
둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 
$N$이 주어진다.
이후 
$N$개의 줄에는 각 물건의 가격 
$a$와 개수 
$b$가 공백을 사이에 두고 주어진다.

출력
구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다. 일치하지 않는다면 No를 출력한다.
 */

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		int all = 0;
		
		for(int i =0; i<n; i++) { 
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int result = a*b;
			all += result;
			
		}
		
		if(x==all) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		
		sc.close();
		
	}

}
