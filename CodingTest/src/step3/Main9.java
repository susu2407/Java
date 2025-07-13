package step3;

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 1; i<=t;i++) {
			for (int j = 1; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		sc.close();
	}

}
