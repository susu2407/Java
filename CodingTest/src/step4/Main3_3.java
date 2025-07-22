package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3_3 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int min, max;
		int first = Integer.parseInt(st.nextToken());
		min = max = first;
		
		for ( int i = 1; i< count;  i++ ) {
			int num = Integer.parseInt(st.nextToken());
			
			if (num < min) min = num;
			if (num > max) max = num;
		} 
		
		System.out.println(min + " " + max);
		br.close();
	}
}



