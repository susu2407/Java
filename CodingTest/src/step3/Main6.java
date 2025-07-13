package step3;

/*
 * 백준 15552번 '빠른 A+B'
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main6 {
	public static void main(String[] args) throws IOException {
		//입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine()); //테스트 케이스 수
		
		for (int i = 0; i<t; i++) {
			String[] parts = br.readLine().split(" ");
			int a = Integer.parseInt(parts[0]);
			int b = Integer.parseInt(parts[1]);
			bw.write((a+b) + "\n");			
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
