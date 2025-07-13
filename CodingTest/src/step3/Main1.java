package step3;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i<10; i++) {
			int j = N * i;
			System.out.println(N + " * " + i + " = " + j);
		}
		sc.close();
	}


}