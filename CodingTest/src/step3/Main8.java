package step3;

import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for ( int i = 0; i<t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case #"+(i+1)+": "+ a + " + "+b+" = " + (a+b));		
		}
		sc.close();
	}

}
