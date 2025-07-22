package step4;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 바구니와 공의 전체 개수
		int [] bk = new int [N]; // 바구니 안에 넣을 공간 만들기
		bk[0] = 0; // 첫번째 바구니에는 공이 없다.
		
		int M = sc.nextInt(); // 반복할 횟수
		for (int s=0; s<M; s++) {
			int i = sc.nextInt(); // 시작할 바구니 번호
			int j = sc.nextInt(); // 마지막 바구니 번호
			int k = sc.nextInt(); // 넣을 공 번호
			
			for (int e=0; e<(k-j); e++) { // 바구니에 공 넣기
				bk[i+e] =  k;				
			}
		}
		System.out.println(Arrays.toString(bk));
		
		
		
		
		
	}

}
